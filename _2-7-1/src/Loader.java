public class Loader {

    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {

        //Писать код здесь
        switch (ch) {
            case 'h':
                return "Hello";
            case 'i':
                return "I can decode!";
            case 'm':
                return "I can decode!";
            case 'k':
                return "I can decode!";
            case 'b':
                return "Bye!";
            default:
                return "I don't know these symbols";
        }
    }
}