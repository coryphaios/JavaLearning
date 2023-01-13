import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop_check = true;
        char operation = '+';
        int next_operand = 0;
        System.out.println("Input first integer");
        int operand1 = scanner.nextInt();

        if (operand1 == 's') {
            stop_check = false;
        }

        if (stop_check) {
            System.out.println("Input operation");
            operation = scanner.next().charAt(0);
            if (operation == 's') {
                stop_check = false;
            }
        }

        if (stop_check) {
            System.out.println("Input second integer");
            next_operand = scanner.nextInt();
            if (next_operand == 's') {
                stop_check = false;
            }
        }

        while (stop_check) {

            switch (operation) {
                case '+':
                    next_operand = operand1 + next_operand;
                    System.out.println("Result is " + next_operand);
                    break;
                case '-':
                    next_operand = operand1 - next_operand;
                    System.out.println("Result is " + next_operand);
                    break;
                case '*':
                    next_operand = operand1 * next_operand;
                    System.out.println("Result is " + next_operand);
                    break;
                case '/':
                    next_operand = operand1 / next_operand;
                    System.out.println("Result is " + next_operand);
                    break;
                default:
                    System.out.println("Incompatible operation");
                    break;
            }

            operand1 = next_operand;
            System.out.println("Input operation");
            operation = scanner.next().charAt(0);

            if (operation == 's') {
                stop_check = false;
                break;
            } else if (operation == 'C') {
                System.out.println ("All values have been zeroed");
                System.out.println("Input first integer");
                operand1 = scanner.nextInt();
                System.out.println("Input operation");
                operation = scanner.next().charAt(0);
            }

            System.out.println("Input next integer");
            next_operand = scanner.nextInt();
            if (next_operand == 's') {
                stop_check = false;
                break;
            }
        }

        System.out.println ("Calculator has stopped");
    }
}
