import java.util.Scanner;

public class Balance {
    // write your code here
    public static int weightRight = 0;
    public static int weightLeft = 0;
    public static void main(String[] args){
        char side;
        char action = 'C';
        boolean stop = true;

        Scanner scanner = new Scanner(System.in);
        while (stop) {
            System.out.println("Choose L or R");
            side = scanner.next().charAt(0);
            System.out.println("Type weight");
            int weight = scanner.nextInt();
            if (side == 'L') {
                weightLeft = addLeft(weight);
            } else {
                weightRight = addRight(weight);
            }
            System.out.println("What would you like to do next? Choose continue (C), stop (S) or get balance (G)");
            action = scanner.next().charAt(0);
            switch (action) {
                case ('C'):
                    action = 'C';
                    break;
                case ('S'):
                    stop = false;
                    break;
                case ('G'):
                    System.out.println(getSituation());
            }
        }

    }
    private static int addRight(int weight){
        weightRight += weight;
        return weightRight;
    }

    public static int addLeft(int weight){
        weightLeft += weight;
        return weightLeft;
    }
    public static String getSituation() {
        if (weightRight > weightLeft) {
            return "R";
        } else if (weightRight == weightLeft) {
            return "=";
        } else {
            return "L";
        }
    }
}