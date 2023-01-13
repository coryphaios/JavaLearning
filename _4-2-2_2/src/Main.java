import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Rect Rect1 = new Rect(10, 20);
        Rect1.w = 1;
//        System.out.println(Rect1.getW());
//        System.out.println(Rect1.getH());
        System.out.println(Rect1.getW() * Rect1.getH());
        System.out.println(Rect1.getS());
    }
}
class Rect{
    private int s; int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}