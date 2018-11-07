public class EqualTest {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "spot";
        scruffy.name = "scruffy";

        spot.says = "Ruff!";
        scruffy.says = "Wurf!";

        System.out.println(spot.says);
        System.out.println(scruffy.says);

        Dog ric = new Dog();
        ric = spot;

        System.out.println(spot == scruffy);
        System.out.println(spot == ric);
        System.out.println(ric == scruffy);

        System.out.println(spot.equals(scruffy));
        System.out.println(spot.equals(ric));
        System.out.println(ric.equals(scruffy));
    }
}

class Dog {
    String name;
    String says;
}