package laba4;

public class test {
    public static void main(String[] args) {
        nameable minecart = new Minecart("Вагонетка");
        nameable pickaxe = new Pickaxe("Кирка");

        //  переопределение
        System.out.println(minecart.getNameUsingOverriding());
        System.out.println(pickaxe.getNameUsingOverriding());
        // Стандартный метод
        System.out.println(minecart.getNameUsingDefaultMethod());
        System.out.print(pickaxe.getNameUsingDefaultMethod());
    }
}