package laba4;

public class pickaxe implements Nameable {
    private final String objName;

    public pickaxe(String objName) {
        this.objName = objName;
    }

    @Override
    public String getNameUsingOverriding() {
        return this.objName;
    }
}