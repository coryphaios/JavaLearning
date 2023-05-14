import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        long currentTime = System.currentTimeMillis();
        copyFileUsingStream("C:\\Users\\User\\Documents\\WindowsTH-RSAT_WS_1803-x64.msu", "C:\\Users\\User\\Desktop\\WindowsTH-RSAT_WS_1803-x64.msu");
        long newTime = System.currentTimeMillis();
        System.out.println("Program execution time: " + (newTime - currentTime));

    }
    private static void copyFileUsingStream(String source, String dest) throws IOException {

        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}