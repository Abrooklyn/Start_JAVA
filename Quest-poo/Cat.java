import java.util.Random;

public class Cat extends Animal implements Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Yum Yum");
    }

    @Override
    public void play() {
        System.out.println("Mow");
    }

    @Override
    public boolean pet() {
        Random random = new Random();
        boolean agrees = random.nextBoolean();
        if (agrees) {
            System.out.println("rrrar rrrar");
        } else {
            System.out.println("...");
        }
        return agrees;
    }

    @Override
    public void trick() {
        System.out.println("No");
    }
}