package translator;

import ast.Node;
import ast.OperationNode;
import ast.Variable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Translator {

    private final String path = System.getProperty("user.dir") + "/src/main/java/";

    private StringBuilder fileClass;
    private Node ast;

    public Translator(Node node) {
        this.ast = node;
        fileClass = new StringBuilder();
        fileClass.append("public class ").append(node.getName()).append("{\n");
        appendFunctionsInFileClass();
        fileClass.append("\n}");
    }

    private void appendFunctionsInFileClass() {
        for (Node node : ast.getNodes()) {
            List<Variable> variables = new ArrayList<>();
            if ("main".equals(node.getName())) {
                fileClass.append("\tpublic static void main(String[] args)");
            } else {
                System.out.println(node.getType());
                String functionType = node.getType();

                if ("float".equals(functionType)) {
                    functionType = "double";
                }

                fileClass.append("\tprivate static ").append(
                        (!"procedure".equals(node.getType())) ? functionType : "void"
                ).append(" ").append(node.getName());

                createParams(node, variables);
            }
            createBody(node.getNodes().get(node.getNodes().size() - 1), "\t\t", variables);
        }

    }

    private void createParams(Node node, List<Variable> variables) {
        fileClass.append("(");
        if (node.getNodes().size() - 1 == 0) {
            fileClass.append(")");
            return;
        }
        for (int i = 0; i < node.getNodes().size() - 1; i++) {
            Node param = node.getNodes().get(i);
            variables.add(new Variable(param.getName(), param.getType()));
            if ("float".equals(param.getType())) {
                System.out.println("WTF");
                fileClass.append("double").append(" ").append(param.getName()).append(",");
                continue;
            }
            fileClass.append(param.getType()).append(" ").append(param.getName()).append(",");
        }
        fileClass.setLength(fileClass.length() - 1);
        fileClass.append(")");

    }

    private void createBody(Node node, String tab, List<Variable> variables) {
        fileClass.append("{\n");
        for (Node node1 : node.getNodes()) {
            if ("return".equals(node1.getTypeNode())) {
                fileClass.append(tab).append("return ");
                createOperation(node1.getNodes().get(0));
                fileClass.append(";\n");
                continue;
            }
            if ("if".equals(node1.getName())) {
                createIfOperation(node1, tab, variables);
                continue;
            }
            if ("for".equals(node1.getType())) {
                createForOperation(node1, tab, variables);
                continue;
            }

            if (node1.getType().contains("=")) {
                createElement(variables, ((OperationNode) node1).getVariables(), tab);
                fileClass.append(tab);
                fileClass.append(node1.getNodes().get(0).getName())
                        .append(" ").append(node1.getType())
                        .append(" ");
                createOperation(node1.getNodes().get(1));
                fileClass.append(";\n");
            }
            if ("call".equals(node1.getTypeNode())) {
                fileClass.append(tab);
                createOperation(node1);
                fileClass.append(";\n");
            }
        }
        fileClass.append(tab.substring(1)).append("}\n");
    }

    private void createElement(List<Variable> params, List<Variable> variables, String tab) {
        for (Variable variable : variables) {
            boolean check = false;
            for (Variable param : params) {
                if (variable.getName().equals(param.getName())) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                fileClass.append(tab);
                if ("float".equals(variable.getType())) {
                    System.out.println("Hey there!");

                    fileClass.append("double ");
                } else {
                    fileClass.append("int ");
                }
                fileClass.append(variable.getName()).append(" = 0;\n");
                params.add(variable);
            }
        }
    }

    private void createOperation(Node node) {
        if (Objects.isNull(node.getTypeNode())) {
            return;
        }
        if ("call".equals(node.getTypeNode())) {
            if ("print".equals(node.getName())) {
                fileClass.append("System.out.println(");
            } else {
                fileClass.append(node.getName()).append("(");
            }
            for (Node param : node.getNodes()) {
                createOperation(param);
                fileClass.append(", ");
            }
            fileClass.setLength(fileClass.length() - 2);
            fileClass.append(")");
            return;
        }
        if ("variable".equals(node.getTypeNode()) || "literal".equals(node.getTypeNode())) {
            fileClass.append(node.getName());
            return;
        }
        if ("^".equals(node.getName())) {
            if ("int".equals(node.getType())) {
                fileClass.append("(int)");
            }
            fileClass.append("Math.pow(");
            createOperation(node.getNodes().get(0));
            fileClass.append(" , ");
            createOperation(node.getNodes().get(1));
            fileClass.append(")");
            return;
        }
        fileClass.append("(");
        if ("operation".equals(node.getNodes().get(0).getTypeNode())) {
            createOperation(node.getNodes().get(0));
        } else {
            fileClass.append(node.getNodes().get(0).getName());
        }
        fileClass.append(" ").append(node.getName()).append(" ");
        if ("operation".equals(node.getNodes().get(1).getTypeNode())) {
            createOperation(node.getNodes().get(1));
        } else {
            fileClass.append(node.getNodes().get(1).getName());
        }
        fileClass.append(")");
    }

    private void createOperationWithoutBrackets(Node node) {
        if (Objects.isNull(node.getTypeNode())) {
            return;
        }
        if ("call".equals(node.getTypeNode())) {
            fileClass.append(node.getName()).append("(");
            for (Node param : node.getNodes()) {
                createOperation(param);
                fileClass.append(", ");
            }
            fileClass.setLength(fileClass.length() - 2);
            fileClass.append(")");
            return;
        }
        if ("variable".equals(node.getTypeNode()) || "literal".equals(node.getTypeNode())) {
            fileClass.append(node.getName());
            return;
        }
        if ("^".equals(node.getName())) {
            fileClass.append("Math.pow(");
            createOperation(node.getNodes().get(0));
            fileClass.append(" , ");
            createOperation(node.getNodes().get(1));
            fileClass.append(")");
            return;
        }
        if ("operation".equals(node.getNodes().get(0).getTypeNode())) {
            createOperation(node.getNodes().get(0));
        } else {
            fileClass.append(node.getNodes().get(0).getName());
        }
        fileClass.append(" ").append(node.getType()).append(" ");
        if ("operation".equals(node.getNodes().get(1).getTypeNode())) {
            createOperation(node.getNodes().get(1));
        } else {
            fileClass.append(node.getNodes().get(1).getName());
        }
    }

    private void createIfCondition(Node node) {
        if ("And".equals(node.getName())) {
            createIfCondition(node.getNodes().get(0));
            fileClass.append(" && ");
            createIfCondition(node.getNodes().get(1));
            return;
        }
        if ("Or".equals(node.getName())) {
            createIfCondition(node.getNodes().get(0));
            fileClass.append("||");
            createIfCondition(node.getNodes().get(1));
            return;
        }
        if ("operation".equals(node.getType())) {
            createIfCondition(node.getNodes().get(0));
            fileClass.append(" ").append(node.getName()).append(" ");
            createIfCondition(node.getNodes().get(1));
            return;
        }
        fileClass.append(node.getName());
    }

    private void createIfOperation(Node node, String tab, List<Variable> variables) {
        fileClass.append(tab).append("if (");
        createIfCondition(node.getNodes().get(0));
        fileClass.append(") ");
        createBody(node.getNodes().get(1), tab + "\t", variables);
        if (Objects.nonNull(node.getNodes().get(2))) {
            fileClass.append(tab).append("else ");
            createBody(node.getNodes().get(2), tab + "\t", variables);
        }
    }

    private void createForOperation(Node node, String tab, List<Variable> variables) {
        fileClass.append(tab).append("for");
        createForCondition(node);
        createBody(node.getNodes().get(3), tab + "\t", variables);
    }

    private void createForCondition(Node node) {
        fileClass.append("(");
        createOperationWithoutBrackets(node.getNodes().get(0));
        fileClass.append("; ");
        createIfCondition(node.getNodes().get(1));
        fileClass.append("; ");
        createOperationWithoutBrackets(node.getNodes().get(2));
        fileClass.append(")");
    }

    public void printFile() {
        System.out.println(fileClass.toString());
    }

    public void translate() {
        try (FileWriter writer = new FileWriter(String.format("%s/%s.java", path, ast.getName()))) {
            writer.write(fileClass.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
