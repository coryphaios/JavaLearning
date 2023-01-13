public class Main {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("StringBuilder");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
           // sb.insert(0, "ABC");
           // sb.append("long_string_29");
           // sb.deleteCharAt(1);
            // sb.insert(sb.length()/2, "ABC");
            sb.setCharAt(5, 'A');
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}