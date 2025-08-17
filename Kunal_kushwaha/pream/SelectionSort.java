package pream;
//TIME COMPLEXITY :- big-oh(n²) [best case , worst case]
import  java.util.Arrays ;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 0 , -1 ,33 , 2 , 9 };


        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] nums) {
        // select the greatest element index in the array and swap it with the correct index.
        // the search space  of finding the greatest index and swapping will be reduced after each pass
        // something similar we did in the bubble sort.
        int start = 0;
        int end;
        for (int i = 0; i < nums.length; i++) {
            end = nums.length - 1 - i; // will reduce the  search space.
            // 1. find the maximum index then it will swap
            int maximumIndex = greatestIndex(nums, start, end); // here we find the maximum index
            // for each iteration and search space is reduced.

            //2. maximum is found now the swapping is performed.
            swap(nums, maximumIndex, end); // it is going to swap the maximum index with the current index
            // in that case also search space is reduced.

        }
        return nums; // after swapping, it is going to return the array.

    }
    // creating a method to find the greatest element index.
    // it will find the greatest element index and return it , search space will reduce each time.

    public static int greatestIndex(int[] nums, int start, int end) {
        for (int i = start; i  <=end; i++) { // loop will run again and again to find the maximum index.
          // here we are going till = end because internally end = arr.length -1 see before block
            if (nums[start] < nums[i]) {
                start = i; // now start will be my new maximum
            }
        }
        return start; // in the end it will return the maximum index(start is my new maximum).
    }

    // creating a method to swap
    // once you find the max index swap it with the last index.
    public static void swap(int[] nums, int maxIndex, int last) {

int temp = nums[maxIndex];   // performing the swap
nums[maxIndex] = nums[last];
  nums[last] = temp ;
    }
}

