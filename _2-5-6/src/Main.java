public class Main {
    public static void main(String[] args) {

        Loader.main1();
    }
    public static class Loader {

        public static void main1() {
            int a = 10;
            int b = 25;
            int c = 0;
            System.out.println(a + b * 10 >= 255 && 4 << 1 <= 14) ;
        }
    }
}