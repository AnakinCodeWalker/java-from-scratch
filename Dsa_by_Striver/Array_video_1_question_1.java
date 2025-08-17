// program to find the largest element in the array.
// return the  greatest element and index also.
// check if array is empty or not (if empty return).
import java.util.Arrays ;
public class Array_video_1_question_1 {
    public static void main(String[]args){
        int [] arr = {3 , 2, 1, 3 ,2 };
       // int [] arr = {} ; //--> run this to check array is empty.
        Array_video_1_question_1 object = new Array_video_1_question_1() ;
        object.greatest(arr) ;


    }
    public int greatest(int []arr) {
        System.out.println(Arrays.toString(arr));  // printing the array.
        // check if array is empty.
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return 0;
        } else {

            int greatest = Integer.MIN_VALUE;
            int i ;
            int index = 0 ;
            // only initialize when array is not empty
            for (i = 0; i < arr.length; i++) {
                if (greatest < arr[i]) {
                    greatest = arr[i];
                    index = i ; // to track index of the current greatest.

                }

            }
            System.out.println("array greatest element is : " + greatest + " Present at index : " +index );
            return greatest; // returning greatest in-case for future uses
        }
    }
    }


