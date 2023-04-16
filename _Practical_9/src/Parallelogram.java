import static java.lang.Math.*;

public class Parallelogram extends Quadrangle implements Figure{
    double alpha;
    double beta;
    public Parallelogram(int a, int b, double alpha, double beta, String color){
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    public double getLargeDiagonal(){
        return sqrt(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(toRadians(beta)));
    }

    public String getColor(){
        return color;
    }

    public double getHeight() {
        if (a < b) {
            return a * sin(toRadians(alpha));
        }
        else {
            return b * sin(toRadians(alpha));
        }
    }

    public double area(){
        return a * b * sin(toRadians(alpha));
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
