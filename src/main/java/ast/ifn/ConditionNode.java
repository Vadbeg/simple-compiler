/*
Module for handling conditions

ex.: (a > b)
 */

package ast.ifn;

import ast.Function;
import ast.Node;
import ast.OperationNode;
import ast.Variable;

import java.util.List;

public class ConditionNode extends Node {
    public ConditionNode(String condition, List<Variable> variables, List<Function> functions) throws Exception {
        typeNode = "condition";
        String operation = searchOperation(condition);
        if (!"".equals(operation)) {
            type = "operation";
            name = operation;
            nodes.add(new OperationNode(condition.substring(0, condition.indexOf(operation)), variables, functions));
            nodes.add(new OperationNode(condition.substring(condition.indexOf(operation) + operation.length()), variables, functions));
        }

    }

    private String searchOperation(String condition) {
        if (condition.contains("and")) {
            return "and";
        }
        if (condition.contains("or")) {
            return "or";
        }
        if (condition.contains(">")) {
            return ">";
        }
        if (condition.contains(">=")) {
            return ">=";
        }
        if (condition.contains("<")) {
            return "<";
        }
        if (condition.contains("<=")) {
            return "<=";
        }
        if (condition.contains("==")) {
            return "==";
        }
        if (condition.contains("!=")) {
            return "!=";
        }

        return "";
    }
}
