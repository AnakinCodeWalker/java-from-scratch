
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner in = new Scanner(System.in); // creating the scanner to take the input .
        System.out.println("enter the number of rows : ");
        row = in.nextInt();
        System.out.println("enter the number of columns : ");
        column = in.nextInt();


        int[][] nums = new int[row][column];

        userInputArray2D(row, column, nums, in);
        System.out.println(Arrays.deepToString(nums));
    }
        public static void userInputArray2D ( int rows, int columns, int[][] arr, Scanner input ){
            System.out.println("Please enter " + (rows * columns) + " numbers : ");
            for (rows = 0; rows < arr.length; rows++) {
                // this will return the number of arrays(outer for loop)
                for (columns = 0; columns < arr[rows].length; columns++) {
                    // for each row in every column of the array.
//                arr[rows].length --> arr[0].length = 3
//                arr[rows].length --> arr[1].length = 2 // approx length may differ according to user input.
//               arr[rows].length --> arr[2].length =  4
                    arr[rows][columns] = input.nextInt();
                }


            }
            ///printing 2d matrix using basic loop
            for(int row = 0 ; row < arr.length ; row++ ){
                for(int column = 0 ; column  <arr[row].length ;column++){
                    System.out.println(arr[row][column] + " ");
                }
            }




            // 2.  printing the array using toString()
/*
            for(int row = 0 ; row < arr.length ; row++){
                System.out.println(Arrays.toString(arr[row]));
            }
 */
            // 3. printing the array using an enhance for loop.

            /*
            for(int[]a : arr){ // a is used for iteration.
                System.out.println(Arrays.toString(a));
            }

             */

    }

}
