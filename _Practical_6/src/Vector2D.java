public class Vector2D extends Vector{
    public Vector2D(int x1, int y1, int x2, int y2){
        super(x1, y1, 0, x2, y2, 0);
    }

    public double getLength(){
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
    }

    public String getVectorCords(){
        return x1 + " " + y1;
    }

    public double getScalarProduct(Vector2D vector){
        return x1 * x2 + y1 * y2;
    }

    public double getAngle(Vector2D vector){
        double angel = getScalarProduct(Vector2D vector) / getLength();
        return angel;
    }
}
