public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 27, 3, 344, 17 };
        int summ = 0;
        for (int i: arr) {
            summ += i;
        }
        System.out.println(summ / arr.length);
        System.out.println("Hello world!");
    }
}