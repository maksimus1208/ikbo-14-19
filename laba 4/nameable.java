package laba4;

public interface nameable {
    String getNameUsingOverriding();
    default String getNameUsingDefaultMethod() {
        return this.getClass().getSimpleName();
    }
}