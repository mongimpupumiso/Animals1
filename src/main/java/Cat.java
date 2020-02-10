import java.util.ArrayList;

public class Cat extends Animals {
    public static String name = "Stormy";

    public Cat() {
        super(name);
    }


    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
