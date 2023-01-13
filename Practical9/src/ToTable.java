public class ToTable {
    // write your code here
    int [] data;
    int x;
    int y;

    public ToTable (int [] data, int x, int y){
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize(){
        int [][] arr = new int [x][y];
        int k = 0;
        int n = data.length;
        for (int i = 0; i < this.y; i++){
            for (int j = 0; j < this.x; j++){
                arr[j][i] = data[k];
                k += n / x;
            }
            k = i + 1;
        }
        return arr;
    }
}

