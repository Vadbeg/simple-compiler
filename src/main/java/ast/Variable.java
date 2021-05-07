/*
Module with Variable node.
 */

package ast;

public class Variable {
    private String name;
    private String type;
    private boolean use;
    private boolean function;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    public boolean isFunction() {
        return function;
    }

    public void setFunction(boolean function) {
        this.function = function;
    }

    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
        this.use = false;
        this.function = false;
    }

    @Override
    public String toString() {
        return name + ' ' + type;
    }
}
