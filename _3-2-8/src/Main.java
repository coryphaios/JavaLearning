import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));

    }
    private static String removeWhiteSpaces(String str) {
        String mass[] = str.split(" ");
        str = "";
        for (int i = 0; i < mass.length; i++) {
            str = str + mass[i];
        }
        return str;
    }
}