import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException{
/*

The file asciitable.txt is hidden in files directory
you have to count all digits in it.
The number of digits in it is the CODE for the excercise

*/
        String fileName = "C:\\Users\\User\\Documents\\asciitable.txt";
        FileInputStream fis = new FileInputStream(fileName);
        int i;
        int digitCount = 0;
        while ((i = fis.read()) != -1) {
            if (Character.isDigit(i)) {
                System.out.print((char) i);
                digitCount++;
            }
        }
        fis.close();
        System.out.println("\nNumber of digits: " + digitCount);
    }
}
