/*
Module parse input tokens and builds AST
 */

package ast;

import ast.ifn.IfElseNode;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Node {
    public static List<Variable> unusableVariables = new ArrayList<>();
    public static List<Function> unusableFunctions = new ArrayList<>();
    protected String name;
    protected String typeNode;
    protected String type;
    protected int pointer;
    protected List<Node> nodes;

    public Node() {
        nodes = new ArrayList<>();
    }

    public Node(TokenStream tokens) throws Exception {
        nodes = new ArrayList<>();
        type = tokens.get(0).getText();
        name = tokens.get(1).getText();
        List<Function> functions = new ArrayList<>();
        functions.add(new Function("print", "procedure"));
        functions.get(0).getParams().add(new Variable("test", "int"));
        functions.add(new Function("print", "procedure"));
        functions.get(1).getParams().add(new Variable("test", "float"));
        for (int i = 3; i < tokens.size() - 1; i++) {
            nodes.add(new FunctionNode(tokens, i, functions));
            i = nodes.get(nodes.size() - 1).getPointer();
            this.pointer = i;
        }
        for (Function function : functions) {
            if (!function.isUse() && !"print".equals(function.getName())) {
                unusableFunctions.add(function);
            }
        }
        unusableVariables = unusableVariables.stream().distinct().collect(Collectors.toList());
        checkUniquenessFunc(functions);
        System.out.println("Code was processed.");
        unUseV();
        unUseF();
    }

    public void unUseV() {
        if (Node.unusableVariables.size() == 0) {
            return;
        }
        if (Node.unusableVariables.size() == 1) {
            System.out.printf("Unused variable: %s\n", unusableVariables.get(0));
        } else {
            System.out.printf("Unused variables: %s\n", unusableVariables);
        }
    }

    public void unUseF() {
        if (Node.unusableFunctions.size() == 0) {
            return;
        }
        if (Node.unusableFunctions.size() == 1) {
            System.out.printf("Unused function: %s\n", unusableFunctions.get(0));
        } else {
            System.out.printf("Unused functions: %s\n", unusableFunctions);
        }
    }

    private void checkUniquenessFunc(List<Function> functions) throws Exception {
        for (int i = 0; i < functions.size(); i++) {
            for (int j = 0; j < functions.size(); j++) {
                boolean check = true;
                if (i != j) {
                    if (functions.get(i).getName().equals(functions.get(j).getName())) {
                        if (functions.get(i).getParams().size() == functions.get(j).getParams().size()) {
                            for (int k = 0; k < functions.get(i).getParams().size(); k++) {
                                if (!functions.get(i).getParams().get(k).getType().equals(functions.get(j).getParams().get(k).getType())) {
                                    check = false;
                                    break;
                                }
                            }
                        } else {
                            check = false;
                        }
                    } else {
                        check = false;
                    }
                } else {
                    continue;
                }
                if (check) {
                    throw new Exception("Same functions in code");
                }
            }
        }
    }

    public Node(String typeNode) {
        this.typeNode = typeNode;
        nodes = new ArrayList<>();
    }

    public Node(TokenStream tokens, int pointer, List<Variable> variables, List<Function> functions) throws Exception {
        nodes = new ArrayList<>();
        String token = tokens.get(pointer).getText();
        if ("start".equals(token)) {
            pointer++;
            token = tokens.get(pointer).getText();
        }
        while (!"finish".equals(tokens.get(pointer).getText())) {
            switch (token) {
                case "if": {
                    nodes.add(new IfElseNode(tokens, pointer, variables, functions));
                    pointer = nodes.get(nodes.size() - 1).getPointer();
                    break;
                }
                case "for": {
                    nodes.add(new ForNode(tokens, pointer, variables, functions));
                    pointer = nodes.get(nodes.size() - 1).getPointer() + 1;
                    this.pointer = pointer;
                    break;
                }
                case "return": {
                    nodes.add(new Node("return"));
                    pointer++;
                    nodes.get(nodes.size() - 1).nodes.add(new OperationNode(getOperation(tokens, pointer), variables, functions));

                    Node temp = nodes.get(nodes.size() - 1);

                    variables = ((OperationNode) temp.nodes.get(temp.nodes.size() - 1)).getVariables();
                    pointer = this.pointer;
                    break;
                }
                default: {
                    nodes.add(new OperationNode(getOperation(tokens, pointer), variables, functions));
                    pointer = this.pointer;
                }

            }
            token = tokens.get(pointer).getText();
        }
        setUnusable(variables);
    }

    private void setUnusable(List<Variable> variables) {
        for (Variable variable : variables) {
            if (!variable.isUse()) {
                unusableVariables.add(variable);
            }
        }
    }

    private String getOperation(TokenStream tokens, int pointer) {
        StringBuilder builder = new StringBuilder();
        while (!tokens.get(pointer).getText().equals(";")) {
            builder.append(tokens.get(pointer++).getText());
        }
        this.pointer = pointer + 1;
        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPointer() {
        return pointer;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeNode(String typeNode) {
        this.typeNode = typeNode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeNode() {
        return typeNode;
    }
}
