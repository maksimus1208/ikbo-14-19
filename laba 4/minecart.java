package laba4;

public class minecart implements Nameable {
    private final String objName;

    public minecart(String objName) {
        this.objName = objName;
    }

    @Override
    public String getNameUsingOverriding() {
        return this.objName;
    }
}