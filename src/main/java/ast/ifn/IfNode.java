package ast.ifn;

import ast.Function;
import ast.Node;
import ast.Variable;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

/*
if(counter > 10 Or counter == -1)
        then
        start
        print(1);
        finish
        else
        start
        print(10);
        return;
        finish
*/

public class IfNode extends Node {
    public IfNode(TokenStream tokens, int pointer, List<Variable> variables, List<Function> functions) throws Exception {
        typeNode = "operation";
        name = "if";
        nodes = new ArrayList<>();
        setConditions(tokens, pointer + 2, variables, functions);
//        pointer = nodes.get(nodes.size() - 1).getPointer();
//        then
        nodes.add(new Node(tokens, this.pointer + 2, variables, functions));
        nodes.get(nodes.size() - 1).setTypeNode("bodyFunc");
//         else
        this.pointer = nodes.get(nodes.size() -1).getPointer();
        if ("else".equals(tokens.get(++this.pointer).getText())){
            nodes.add(new Node(tokens, ++this.pointer, variables, functions));
            nodes.get(nodes.size() - 1).setTypeNode("bodyFunc");
            this.pointer = nodes.get(nodes.size() -1).getPointer() + 1;
        }
    }

    private void setConditions(TokenStream tokens, int pointer, List<Variable> variables, List<Function> functions) throws Exception {
        Node node = new Node("condition");
        Node oldNode = node;
        StringBuilder builder = new StringBuilder();
        nodes.add(node);
        boolean check = false;
        while (!tokens.get(pointer).getText().equals(")")) {
            String token = tokens.get(pointer).getText();
            if (token.equals("and") || token.equals("or")){
                check = true;
                node.setName(token);
                node.setType("operation");
                node.getNodes().add(new ConditionNode(builder.toString(), variables, functions));
                node.getNodes().add(new Node());
                oldNode = node;
                node = node.getNodes().get(node.getNodes().size() - 1);
//                pointerNode.getNodes().add(new Node(token));
//                pointerNode = getNodes().get(nodes.size() - 1);
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
            nodes.remove(0);
            nodes.add(new ConditionNode(builder.toString(), variables, functions));
        }
//        pointerNode.getNodes().add(new Node(builder.toString()));
        this.pointer = pointer;
    }
}
