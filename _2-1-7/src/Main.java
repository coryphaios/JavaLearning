class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.build();
    }
}
class Car {
    //metod dlya build
    public static void build() {
        System.out.println("You must build a new car");
    }
}