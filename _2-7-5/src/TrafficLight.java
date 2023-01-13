public class TrafficLight {
    public static void main(String[] args) {
        String signal = "yellow";

        if (signal == "red") {
            System.out.println("Stop");
        }
        else if (signal == "yellow") {
            System.out.println("Wait");
        }
        else if (signal == "green") {
            System.out.println("Go");
        }
    }
}