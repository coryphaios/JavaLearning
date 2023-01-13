public class Main {
    public static void main(String[] args) {
        Car.Build();
        Car.buy();
    }

    public class Car{
        public static void Build() {
            System.out.println("You must build a new car");
        }
        public static void buy() {
            System.out.println("I will buy this car");
        }

        int carSpeed = 0;
    }
}
