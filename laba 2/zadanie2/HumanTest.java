public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("vasiliy", "rubkin", 18,
                new Head("brown", "blond", 2),
                new Hand(44),
                new Leg(42));
        System.out.println("1) " + human + "\n");
        human.setHead(new Head("brown", "light", 1));
        human.setSurname("pupkin");
        human.setLeg(new Leg(39));
        System.out.println("2) " + human + "\n");
        human.getHead().setHairColor("gray");
        System.out.println("3) " + human);
    }
}