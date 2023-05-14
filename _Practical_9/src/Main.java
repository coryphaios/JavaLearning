public class Main {
    public static void main(String[] args) {

        Square square = new Square(5, "red");
       // System.out.println(square.getArea());
        Rectangle rectangle = new Rectangle(5, 10, "green");
       // System.out.println(rectangle.getLargeDiagonal());
        Parallelogram par = new Parallelogram(5, 10, 30,150,"black");
        Parallelogram parallelogram = new Parallelogram(1, 2, 60, 120, "Pink");
        Parallelogram parallelogram1 = new Parallelogram(2, 1, 60, 120, "Pink");
        Parallelogram parallelogram2 = new Parallelogram(1, 2, 90, 90, "White");
        Parallelogram parallelogram3 = new Parallelogram(2, 3, 60, 120, "Pink");
        System.out.println("Par");
        System.out.println(parallelogram.getHeight());
        System.out.println(parallelogram.getLargeDiagonal());
        System.out.println(parallelogram.getArea());
        System.out.println(parallelogram.getPerimeter());
        System.out.println("Par 1");
        System.out.println(parallelogram1.getHeight());
        System.out.println(parallelogram1.getLargeDiagonal());
        System.out.println(parallelogram1.getArea());
        System.out.println(parallelogram1.getPerimeter());
        System.out.println("Par 2");
        System.out.println(parallelogram2.getHeight());
        System.out.println(parallelogram2.getLargeDiagonal());
        System.out.println(parallelogram2.getArea());
        System.out.println(parallelogram2.getPerimeter());
        System.out.println("Par 3");
        System.out.println(parallelogram3.getHeight());
        System.out.println(parallelogram3.getLargeDiagonal());
        System.out.println(parallelogram3.getArea());
        System.out.println(parallelogram3.getPerimeter());
    }
}