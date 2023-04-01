public class ConditionsAndCycles {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c; //5
        //a = a * b;
        c = a - c; //2
        //a = a + b;
        a = a - b; //-1
        c = a + b; //4
        //b = c / a;
        a = b + c; // 9
        a = a + c + b; //18

        // Напишите здесь свой код
        int i = 1;
        do {
            System.out.println(i + " " + a);
            i++;
        } while (i <= 20);
    }
}