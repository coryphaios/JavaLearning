public class Loader {

    public static void main(String args[]) {

        int variable = 7;
        variable = (variable > 10) ? (variable -= 10) : (variable += 10);
            System.out.println(variable);
    }
}