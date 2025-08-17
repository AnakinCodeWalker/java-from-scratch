import java.util.Scanner ;
public class FindMinimumIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 11}
        };

 int minValue = MinimumIn2DArray(arr);
 if(minValue != Integer.MAX_VALUE){
     System.out.println("Minimum in the 2D array is :"+minValue);
 }else {
     System.out.println("no minimum");
 }
    }
        public static int MinimumIn2DArray(int[][]arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE ;
        }
        int minimum =Integer.MAX_VALUE ;
        for(int row = 0 ; row < arr.length ;row++){
            for (int column = 0 ; column < arr[row].length ;column++){
                if(minimum > arr[row][column] ){
                    minimum = arr[row][column];
                }
            }
        }
           return minimum ;
        }

}
