import static java.lang.Math.sqrt;

public class Square extends Quadrangle implements Figure{

    public Square(int a, String color){
        super(a, a, color);
    }

    public double getLargeDiagonal(){
        return a * Math.sqrt(2);
    }

    public String getColor(){
        return color;
    }

    public double getHeight() {
        return a;
    }

    public double area(){
        return Math.pow(a, 2);
    }

    public double getArea(){
        return area();
    }

    public double perimeter(){
        return 4 * a;
    }

    public double getPerimeter(){
        return perimeter();
    }
}
