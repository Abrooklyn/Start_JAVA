public class Hangar {

    public static void main(String[] args) {

        Car golf = new Car("Ferrari");
        Boat bateau = new Boat("kayak");

        System.out.println(golf.doStuff());
        System.out.println(bateau.doStuff());
    }

}