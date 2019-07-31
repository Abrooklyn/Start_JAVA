public class Dog extends Animal implements Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Yum yum yum");
    }

    @Override
    public void play() {
        System.out.println("Wouf");
    }

    @Override
    public boolean pet() {
        System.out.println("love ya");
        return true;
    }
}