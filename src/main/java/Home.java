import java.util.ArrayList;
public class Home {
    ArrayList<Animals> name = new ArrayList();

   public void adoptPet(Animals pets){
        name.add(pets);

    }

    public void makeAllSound(){
        for (Animals object: name){
            object.sound();
        }
    }
}

