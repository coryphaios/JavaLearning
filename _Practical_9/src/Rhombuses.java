import static java.lang.Math.*;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha;
    double beta;
    public Rhombuses(int a, double alpha, double beta, String color){
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    public double getLargeDiagonal(){
        return a * sqrt(2 + 2 * cos(toRadians(alpha)));
    }

    public String getColor(){
        return color;
    }

    public double getHeight() {
        return a * sin(toRadians(alpha));
    }

    public double area(){
        return a * getHeight();
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
