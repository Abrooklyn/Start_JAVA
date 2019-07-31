public class Home {

    public static void main(String[] args) {
        Dog puppy = new Dog("Poppi", 4);
        System.out.printf("\n%s:%n", puppy.getName());
        puppy.feed();
        puppy.play();
        puppy.pet();
        puppy.pet();
        puppy.trick();

        Cat kitty = new Cat("Maritza", 8);
        System.out.printf("\n%s:%n", kitty.getName());
        kitty.feed();
        kitty.play();
        kitty.pet();
        kitty.pet();
        kitty.pet();
        kitty.trick();
    }
}