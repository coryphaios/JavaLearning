import java.util.Scanner;

public class Balance {
    // write your code here
    private int weightRight = 0;
    private int weightLeft = 0;
    private char side;
    private char action = 'C';
    boolean stop = true;
    Scanner scanner = new Scanner(System.in);
    while (stop) {
        System.out.println("Choose L or R");
        char side = scanner.next().charAt(0);
        System.out.println("Type weight");
        int weight = scanner.nextInt();
        if (side == 'L') {
            weightLeft = weightLeft.addLeft(weight);
        }
        else{
            weightRight = weightRight.addRight(weight);
        }
        System.out.println("What would you like to do next? Choose continue (C), stop (S) or get balance (G)");
        char action = scanner.next().charAt(0);
        switch (action){
            case ('C'):
                action = 'C';
                break;
            case ('S'):
                stop = false;
                break;
            case ('G'):
                System.out.println(getSituation(weightLeft, weightRight));
        }

    }

    private static int addRight(int n){
        n += n;
        return n;
    }

    public static int addLeft(int n){
        n += n;
        return n;
    }
    public static char getSituation(int weightLeft, int weightRight){

        if (weightRight > weightLeft) {
            return 'R';
        }
        else if (weightRight == weightLeft){
            return '=';
        }
        else {
            return 'L';
        }
    }
}