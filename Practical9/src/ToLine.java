public class ToLine {
    int [][] data;

    public ToLine (int [][] data) {
        this.data = data;
    }

    public int[] resize(){
        int n = data.length * data[0].length;
        int [] arr2 = new int [n];
        int k = 0;
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                arr2[k] = data[i][j];
                k++;
            }
            //k += data[i].length;
        }
        return arr2;
    }
}
