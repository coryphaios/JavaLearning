import java.util.ArrayList;

public class Player extends Human {
    public Backpack backpack = new Backpack();
    String thing = "";
    private boolean existence;
    private int i = 1;

    Player(String name){
        super(name);
    }

    public void take(String thing){
        this.thing += thing + ",";
        existence = true;
    }

    class Backpack{
        public String toString(){
            if (!existence){
                return "the backpack is empty";
            }
            return thing.substring(0, thing.length()-1) + " in the backpack";
        }
    }


}