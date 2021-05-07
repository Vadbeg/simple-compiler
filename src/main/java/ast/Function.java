/*
Module with handling of function
 */

package ast;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private String name;
    private String type;
    private boolean use;
    private final List<Variable> params;

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

    public List<Variable> getParams() {
        return params;
    }

    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    public Function(String name, String type) {
        this.name = name;
        this.type = type;
        params = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }
}
