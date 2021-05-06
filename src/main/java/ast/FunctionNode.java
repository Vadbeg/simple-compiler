package ast;

import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends Node {

    public FunctionNode(TokenStream tokens, int pointer, List<Function> functions) throws Exception {
        nodes = new ArrayList<>();
        List<Variable> variables = new ArrayList<>();
        if ("main".equals(tokens.get(pointer).getText())){
            name = "main";
            typeNode = "function";
            type = "procedura";
            this.pointer = pointer + 1;
            nodes.add(new Node(tokens, this.pointer, variables, functions));
            this.pointer = nodes.get(nodes.size() - 1).getPointer();
            return;
        }
        type = tokens.get(pointer++).getText();
        name = tokens.get(pointer).getText();
        functions.add(new Function(name, type));
        typeNode = "function";
        pointer += 2;
        while (!")".equals(tokens.get(pointer).getText())){
            if (",".equals(tokens.get(pointer).getText())){
                pointer++;
            }
            Node node = new Node();
            node.setTypeNode("attribute");
            node.setType(tokens.get(pointer++).getText());
            node.setName(tokens.get(pointer++).getText());
            variables.add(new Variable(node.getName(), node.getType()));
            functions.get(functions.size() - 1).getParams().add(variables.get(variables.size() - 1));
            nodes.add(node);
        }
        this.pointer = pointer + 1;
        nodes.add(new Node(tokens, this.pointer, variables, functions));
        nodes.get(nodes.size() - 1).setTypeNode("body");
        this.pointer = nodes.get(nodes.size() - 1).getPointer();
    }
}
