import java.util.Scanner;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException{
/*

Create file request.txt from folder "files" and write phrase
GIVE ME THE CODE, PLEASE
there
*/
        FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Documents\\request.txt");
        fos.write("GIVE ME THE CODE, PLEASE".getBytes("UTF-8"));
        fos.close();
    }

}
