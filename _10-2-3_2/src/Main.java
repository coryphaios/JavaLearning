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
        int c;
        int s = 0;
        while ((c = fis.read()) != -1) {
            if (c >='0' && c <= '9')
                s++;
        }
        System.out.println(s);
    }
}
