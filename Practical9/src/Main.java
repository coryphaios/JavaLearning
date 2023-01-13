public class Main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        ToLine a2 = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr2 = a2.resize();
        for (int i = 0; i < arr2.length; i++){
                System.out.print(arr2[i] + " ");
        }
    }
}