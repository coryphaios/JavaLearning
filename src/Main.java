import java.io.File;

public class Main {
    public static void main(String[] args) {
        long number =0;
        File directory = new File("C:\\Users\\User\\YandexDisk\\IdeaProjects");
        String[] files = directory.list();
        for (String fileName : files){
            File file = new File("C:\\Users\\User\\YandexDisk\\IdeaProjects\\" + fileName);
            number += file.length();
            System.out.println(fileName);
            System.out.println(number);
        }
        System.out.println(number);

//        File file = new File("C:\\Users\\User\\YandexDisk\\IdeaProjects\\Git-2.39.0.2-64-bit.exe");
//        System.out.println(file.getName() + " " + file.length());
    }
}
