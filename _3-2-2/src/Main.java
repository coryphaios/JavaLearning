public class Main {
    public static void main(String[] args) {
        String str1 = "Иван Иванов";
        String str2 = "иван иванов";
        if (str1.equals(str2) == false) {
            System.out.println("Username is correct");
        } else {
            System.out.println("You can't use this name");
        }
    }
}