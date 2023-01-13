import java.sql.SQLOutput;

import static java.util.Collections.replaceAll;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));

    }
    private static String removeWhiteSpaces(String str) {
        str = str.replaceAll(" ", "");
        return str;
    }
}