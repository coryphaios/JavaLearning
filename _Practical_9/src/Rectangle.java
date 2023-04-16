import static java.lang.Math.*;

public class Rectangle extends Quadrangle implements Figure {
    public Rectangle(int a, int b, String color){
        super(a, b, color);
    }

    public double getLargeDiagonal(){
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    public String getColor(){
        return color;
    }

    public double getHeight() {
        return min(a, b);
    }

    public double area(){
        return a * b;
    }

    public double getArea(){
        return area();
    }

    public double perimeter(){
        return 2 * (a + b);
    }

    public double getPerimeter(){
        return perimeter();
    }
}
