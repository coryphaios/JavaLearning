import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("2000");
        for (int i = 2001; i <= 2100; i++){
            stringBuilder.append(" " + i);
        }
        System.out.println(stringBuilder);
        String text = stringBuilder.toString();
        Pattern pattern = Pattern.compile("20\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }

    }
}
