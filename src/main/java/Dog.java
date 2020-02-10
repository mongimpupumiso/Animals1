public class Dog extends Animals {

    public static String name = "Rax";

    public Dog() {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
