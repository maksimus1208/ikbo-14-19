public class CircleTest {

    public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("Original radius: " + circle.getRadius());

		circle.setRadius(15);
		System.out.println("New radius: " + circle.getRadius());
    }
}