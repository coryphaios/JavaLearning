public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2){
        super(x1, y1, x2, y2, z1, z2);
    }

    public double getLength(){
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(z1, 2));
    }

    public String getVectorCords(){
        return x1 + " " + y1 + " " + z1;
    }

    public double getScalarProduct(Vector3D vector){
        return x1 * x2 + y1 * y2 + z1 * z2;
    }
}
