public class Compare {
    public static void checkUserName(String str1, String str2){
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя");
            System.out.println("Ваше имя имеет длину " + str1.length() + " символов");
            int number = str1.length();
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ' ') {
                    number--;
                }
            }
            System.out.println("А без пробелов ваше имя занимает " + number + " символов");
        }
    }
}

