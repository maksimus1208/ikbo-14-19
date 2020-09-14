package praktika3ex4;

public class MovableTest {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(13, 7, 11, 28, 3);
        System.out.println(circle);
        circle.moveUp();
        circle.moveDown();
        circle.moveLeft();
        circle.moveRight();
    }
}
