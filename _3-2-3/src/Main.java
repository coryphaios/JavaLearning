public class Main {
    public static void main(String[] args) {
        String str1 = "Иван Иванов";
        String str2 = "иван иванов";
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("You can't use this name");
        } else {
            System.out.println("Username is correct");
        }
    }
}