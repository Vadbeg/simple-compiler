/*
Module for if else clause

ex.:
    for (i = 0; i < 15; i+=2)
    start
        ...
    finish

 */


package ast;

import ast.ifn.ConditionNode;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

public class ForNode extends Node {
    public ForNode(TokenStream tokens, int pointer, List<Variable> variables, List<Function> functions) throws Exception {
        nodes = new ArrayList<>();
        typeNode = "operation";
        type = tokens.get(pointer).getText();
        pointer += 2;
        StringBuilder builder = new StringBuilder();
        while (!")".equals(tokens.get(pointer).getText())) {
            if (";".equals(tokens.get(pointer).getText())) {
                pointer++;
                nodes.add(new OperationNode(builder.toString(), variables, functions));
                setConditions(tokens, pointer, variables, functions);
                pointer = this.pointer + 1;
                builder = new StringBuilder();
            } else {
                builder.append(tokens.get(pointer++).getText());
            }
        }
        nodes.add(new OperationNode(builder.toString(), variables, functions));
        this.pointer = pointer + 2;
        nodes.add(new Node(tokens, this.pointer, variables, functions));
        nodes.get(nodes.size() - 1).setTypeNode("bodyFunc");
        this.pointer = nodes.get(nodes.size() - 1).getPointer();
    }

    private void setConditions(TokenStream tokens, int pointer, List<Variable> variables, List<Function> functions) throws Exception {
        Node node = new Node("condition");
        Node oldNode = node;
        StringBuilder builder = new StringBuilder();
        nodes.add(node);
        boolean check = false;
        while (!tokens.get(pointer).getText().equals(";")) {
            String token = tokens.get(pointer).getText();
            if (token.equals("and") || token.equals("or")){
                check = true;
                node.setName(token);
                node.setType("operation");
                node.getNodes().add(new ConditionNode(builder.toString(), variables, functions));
                node.getNodes().add(new Node());
                oldNode = node;
                node = node.getNodes().get(node.getNodes().size() - 1);
                builder = new StringBuilder();
            } else {
                builder.append(token);
            }
            pointer++;
        }
        if (check){
            oldNode.getNodes().remove(node);
            oldNode.getNodes().add(new ConditionNode(builder.toString(), variables, functions));
        } else {
            nodes.remove(oldNode);
            nodes.add(new ConditionNode(builder.toString(), variables, functions));
        }

        this.pointer = pointer;
    }
}
