package pream ;
import java .util.Arrays ;

// adding the boolean statement after each pass it will check swapping is performed or not
// this makes code more efficient.
public class BubbleSort {
    public static void main  (String [] args){
// int[]nums ={ 2 ,4 ,7, 6 , 3 , 1 , 9 } ; // when array is not sorted
 int[]nums = {2 ,3, 4,  5, 6, 7} ; // array is sorted
       System.out.println (Arrays.toString( bubbleSort(nums))); // calling the method and printing the value

    }
    public  static int[]bubbleSort(int[]arr){  // declaring the method which perform the bubble sort
        int temp = 0 ; // swapping variable
        boolean isSwapped = true ; // boolean value to keep track if the array is sorted or not.
        for(int  j = 0 ; j< arr.length ; j++){ // outer loop to decrease the search space one by one.
            isSwapped = true ;   // if array sorted does not change after each pass break from loop.
            // it will be reinitialized after each pass to check if array is sorted or not.
            for(int i =   1 ; i< arr.length -j ; i++){
// using the loop to check the  adjacent elements
                if(arr[i]< arr[i-1]){ // if array current element is less than the previous one perform the swap
                    isSwapped = false ; // this will change if swapped is performed
                    // if this does not change after each pass loop will be exited
                    temp = arr[i-1 ] ;  // swapping logic
                    arr[i-1] = arr[i] ;
                    arr[i] = temp ;
                }
            }
            if(isSwapped){ // checking after the current pass the swapping is performed or not.
                break; // if continue if not break from the loop.
            }
        }

        return arr ; // returning the array in the end.

    }
}
