import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{-1, -2}, {3, 4}, {-7, 0}};
        LimitingRectangle rec = new LimitingRectangle(arr);
        System.out.println(rec.getWidth() + " " + rec.getHeight());
        System.out.println(rec.getBorders());
    }

    private static class LimitingRectangle {
        // write your code here
        int[][] points;
        int maxX;
        int minX;
        int maxY;
        int minY;
        String borders;
        public LimitingRectangle(int[][] points){
            this.points = points;
        }

        int getWidth(){
            maxX = points[0][0];
            minX = points[0][0];

            for (int i = 0; i < points.length; i++){
                if (points[i][0] > maxX) {
                    maxX = points[i][0];
                }
                if (points[i][0] < minX) {
                    minX = points[i][0];
                }
            }
            return (maxX - minX);
        }

        int getHeight(){
            maxY = points[0][1];
            minY = points[0][1];
            for (int i = 0; i < points.length; i++){
                if (points[i][1] > maxY) {
                    maxY = points[i][1];
                }
                if (points[i][1] < minY) {
                    minY = points[i][1];
                }
            }
            return (maxY - minY);
        }

        String getBorders(){
            borders = minY + ", " + maxY + ", " + minX + ", " + maxX;
            return borders;
        }
    }


}

