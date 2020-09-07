public class TestBall 
{
	public static void main(String[] args) 
	{
		Ball ball1 = new Ball(200, 200);
		System.out.println("Initial ball1 position: " + ball1);
		ball1.move(60, 30);
		System.out.println("Ball1 position after move: " + ball1);

		Ball ball2 = new Ball();
		System.out.println("\nInitial ball2 position: " + ball2);
		ball2.move(-20, 200);
		System.out.println("Ball2 position after move: " + ball2);
	}
}