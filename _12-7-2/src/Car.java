public class Car implements Comparable<Car> {
    private String brand;
    private long serialNumber;

    public Car(String brand, long serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public int compareTo(Car o) {
        return brand.compareTo(o.brand);
    }
}