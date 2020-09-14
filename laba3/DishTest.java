package laba3ex1;

public class DishTest {
    public static void main(String[] args) {
        Dish plate = new Plate("main course");
        System.out.println(plate);
        plate.wash();
        System.out.println(plate);
        plate.setClean(false);
        plate.setType("Plate");
        System.out.println(plate);

        Dish fork = new Fork(6, 2);
        System.out.println(fork);
        fork.wash();
        System.out.println(fork);
        fork.setClean(false);
        fork.setType("Fork");
        System.out.println(fork);
    }
}
