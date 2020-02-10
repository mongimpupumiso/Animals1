import java.util.SortedMap;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("sounds . . .");
    }

    public void eat(){
        System.out.println(name + " eats");
    }


}
