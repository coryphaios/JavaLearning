import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String mass[] = name.split(" ");
        int number = mass.length;
        boolean result = true;
        if (number != 3) {
            result = false;
        }
        System.out.println(name.sortByLength(name));
        return result;
    }

    private static String formatName(String name) {
        String mass[] = name.split(" ");

        return mass;
    }

    private static void sortByLength(String[] words) {
        String mass[] = words;
        int FirstLength = words[0].length();
        int SecondLength = words[1].length();
        int ThirdLength = words[2].length();
        //String mass[] = Arrays.sort(words);
        mass = Arrays.sort(mass);
        System.out.println(mass);
    }
}