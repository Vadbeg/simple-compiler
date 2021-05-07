/*
Module with function node

ex.:
    a + v

 */

package ast;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationNode extends Node {

    private final List<Variable> variables;

    public OperationNode(String expression, List<Variable> variablesIn, List<Function> functions) throws Exception {
        nodes = new ArrayList<>();
        variables = variablesIn;
        if ("".equals(expression)) {
            return;
        }
        if (expression.contains("=")) {
            typeNode = "operation";
            List<Character> operation = Arrays.asList('+', '-', '*', '/', '^', '~');
            if (operation.contains(expression.charAt(expression.indexOf("=") - 1))) {
                int pointer = expression.indexOf("=") - 1;
                type = expression.substring(pointer, pointer + 2);
            } else {
                type = "=";
            }
            String variable = searchVariable(expression);
            nodes.add(new OperationNode(variable, variables, functions));
            nodes.add(new OperationNode(expression.substring(expression.indexOf("=") + 1), variables, functions));
            nodes.get(nodes.size() - 2).setType(nodes.get(nodes.size() - 1).getType());
            Variable temp = new Variable(nodes.get(nodes.size() - 2).getName(), nodes.get(nodes.size() - 2).getType());
            for (Variable variable1 : variables) {
                if (variable1.getName().equals(temp.getName())) {
                    variable1.setType(temp.getType());
                }
            }
            return;
        }
        if (expression.charAt(expression.length() - 1) == ')' && expression.charAt(0) == '(') {
            expression = expression.substring(1, expression.length() - 1);
        }
        int pointerOperation = searchOperation(expression);
        if (pointerOperation != -1 && pointerOperation != 0) {
            typeNode = "operation";
            name = expression.charAt(pointerOperation) + "";
            OperationNode left = new OperationNode(expression.substring(0, pointerOperation), variables, functions);
            nodes.add(left);
            OperationNode right = new OperationNode(expression.substring(pointerOperation + 1), variables, functions);
            nodes.add(right);
            type = ("int".equals(right.type) && "int".equals(left.type)) ? "int" : "float";
            if (name.contains("=")) {
                left.type = type;
                for (Variable variable : variables) {
                    if (variable.getName().equals(left.name)) {
                        variable.setType(type);
                    }
                }
            }
            return;
        }
        String nameFunction = searchCall(expression);
        if ("".equals(nameFunction)) {
            if (isLiteral(expression)) {
                typeNode = "variable";
                final String tempName = expression;
                Optional<Variable> variable = variables.stream().filter(e -> e.getName().equals(tempName)).findFirst();
//                variable.ifPresent(value -> type = value.getType());
                if (variable.isPresent()) {
                    type = variable.get().getType();
                    variable.get().setUse(true);
                } else {
                    variables.add(new Variable(expression, "int"));
                }
            } else {
                typeNode = "literal";
                type = isInteger(expression) ? "int" : "float";
            }
            name = expression;
        } else {
            typeNode = "call";
            name = nameFunction;
            expression = expression.substring(nameFunction.length());
            String result = "";
            Function resultFunction = null;
            int counter = -1;
            createParam(expression, variables, functions);
            for (Function function : functions) {
                counter++;
                if (!function.getName().equals(nameFunction)) {
                    continue;
                }
                resultFunction = function;
                result = checkParam(function, variables);
                if ("Done".equals(result)) {
                    type = function.getType();
                    break;
                }
            }
            if (Objects.isNull(resultFunction)) {
                throw new Exception("No function!");
            }
            if (!"Done".equals(result)) {
                throw new Exception(result);
            }
            functions.get(counter).setUse(true);

        }
    }

    private String searchVariable(String expression) {
        Pattern pattern = Pattern.compile("-?[a-zA-z0-9]+");
        Matcher matcher = pattern.matcher(expression);
        matcher.find();
        return expression.substring(matcher.start(), matcher.end());
    }

    private String searchNumber(String expression) {
        Pattern pattern = Pattern.compile("-?[0-9]+[.][0-9]+");
        Matcher matcher = pattern.matcher(expression);
        if (!matcher.find()){
            return "";
        }
        return expression.substring(matcher.start(), matcher.end());
    }


    private int searchOperation(String expression) {
        int check = 0;
        List<Character> operation = Arrays.asList('+', '-', '*', '/', '^', '~');
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                check++;
                continue;
            }
            if (expression.charAt(i) == ')') {
                check--;
                continue;
            }
            if (check == 0 && operation.contains(expression.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    private String searchCall(String expression) {
        if (expression.equals(searchNumber(expression))){
            return "";
        }
        String nameFunction = searchVariable(expression);
        if (expression.equals(nameFunction)) {
            return "";
        }
        return nameFunction;
    }

    private String checkParam(Function function, List<Variable> variables) {
        if (nodes.size() != function.getParams().size()) {
            if (nodes.size() > function.getParams().size()) {
                return "More vars in functions " + function.getName();
            }
            return "Less vars in functions " + function.getName();
        }
        for (int i = 0; i < nodes.size(); i++) {
            if (Objects.isNull(function.getParams().get(i))) {
                return ("Less vars in functions " + function.getName());
            }
            if ("literal".equals(nodes.get(i).typeNode)) {
                if ("int".equals(function.getParams().get(i).getType())) {
                    if (!isInteger(nodes.get(i).name)) {
                        return ("Bad var type " + nodes.get(i).name);
                    }
                } else {
                    if (isInteger(nodes.get(i).name)) {
                        return ("Bad var type " + nodes.get(i).name);
                    }
                }
            } else {
                for (Variable variable : variables) {
                    if (!variable.getName().equals(nodes.get(i).name)) {
                        continue;
                    }
                    if (!variable.getType().equals(function.getParams().get(i).getType())) {
                        return ("Bad var type " + function.getParams().get(i).getType());
                    } else {
                        break;
                    }
                }
            }
        }
        return "Done";
    }

    private void createParam(String expression, List<Variable> variables, List<Function> functions) throws Exception {
        if (expression.charAt(expression.length() - 1) == ')' && expression.charAt(0) == '(') {
            expression = expression.substring(1, expression.length() - 1);
        }
        int check = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                check++;
            }
            if (expression.charAt(i) == ')') {
                check--;
            }
            if (check == 0 && expression.charAt(i) == ',') {
                nodes.add(new OperationNode(builder.toString(), variables, functions));
                nodes.get(nodes.size() - 1).setType("param");
                builder = new StringBuilder();
            } else {
                builder.append(expression.charAt(i));
            }
        }
        if (!"".equals(builder.toString())) {
            nodes.add(new OperationNode(builder.toString(), variables, functions));
            nodes.get(nodes.size() - 1).setType("param");
        }
    }

    private boolean isLiteral(String expression) {
        Pattern pattern = Pattern.compile("[a-zA-z]+");
        Matcher matcher = pattern.matcher(expression);
        return matcher.find();
    }

    private boolean isInteger(String expression) {
        return !expression.contains(".");
    }

    public List<Variable> getVariables() {
        return variables;
    }
}
