public class Main {
    public static void main(String[] args) {
        Transport car = new Car(1000, 200, 5);
        Transport plane = new Plane(10000, 800);
        System.out.println(car.getFuelLevel());
        System.out.println(plane.getFuelLevel());
        car.canMove(100);
        System.out.println(car.getFuelLevel());
        plane.canMove(1000);
        System.out.println(plane.getFuelLevel());
        ((Plane) plane).fillFuel(400);
        System.out.println(plane.getFuelLevel());
    }
}