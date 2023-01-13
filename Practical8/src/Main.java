public class Main {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Separator sep = new Separator(array);
        int [] even = sep.even();
        int [] odd = sep.odd();
        for (int i = 0; i < even.length; i++){
            System.out.println(even[i]);
        }
        for (int j = 0; j < odd.length; j++){
            System.out.println(odd[j]);
        }
    }

    public static class Separator {
        // write your code here
        // solution is not completed. Array is fixed
        int [] array;
        int [] even = new int[5];
        int [] odd = new int[5];

        public Separator(int[] array){
            this.array = array;
        }

        public int [] even(){
            int i = 0;
            int j = 0;
            while (i < this.array.length){
                if (this.array[i] % 2 == 0) {
                    even[j] = this.array[i];
                    j++;
                }
                i++;
            }
            return even;
        }

        public int [] odd(){
            int i = 0;
            int j = 0;
            while (i < this.array.length){
                if (this.array[i] % 2 != 0) {
                    odd[j] = this.array[i];
                    j++;
                }
                i++;
            }
            return odd;
        }

    }
}