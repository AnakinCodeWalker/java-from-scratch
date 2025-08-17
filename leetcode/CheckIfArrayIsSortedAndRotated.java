/* code is not correct.
Given an array nums, return true if the array was originally sorted
in non-decreasing order, then rotated some number of positions (including zero).
Otherwise, return false.

There may be duplicates in the original array.
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2]

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

        Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.


        * */
// first find the Smallest element in the array.
// if smallest is present on the first then simply perform an iteration to check sorted or not and return.
// if smallest is present on d position then perform rotation and check sorted or not.

import java.util.Arrays;

/*
import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] ars) {
        int[] nums = { 2,4, 0, 1,};
        CheckIfArrayIsSortedAndRotated object = new CheckIfArrayIsSortedAndRotated();

        System.out.println(object.check(nums));
    }

    public boolean check(int[] nums) {
        boolean istrue = false;
//1. find smallest in the array.
        int smallest = Integer.MAX_VALUE;
        int count = 0;                   // initially 0 to keep track of the first smallest value.
        for (int i = 0; i < nums.length; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];
                count = i;  // here i value will be inserted in count variable.
            }


        }
        System.out.println("position of smallest :- " + count);
        // 2. check if it is present on the first index.
        if (nums[0] == smallest) { //given  array is sorted and rotated  if smallest is present
//            on the first index then whole array is sorted.

            return true;
        } else {
            // instead of returning false perform the next condition implementation
// if smallest element  is not present on the first index then perform rotation of elements
            // that are previously present from the smallest element.

            // create an array of the size of number  of elements present before the smallest.
            int[] arr = new int[count]; // will create an array to swap the value before the  smallest array.
            System.out.println("not created if nums is sorted");
            for (int i = 0; i < count; i++) {
                arr[i] = nums[i];  // copying the Elements from nums to arr.
            }
            System.out.println("copied elements : " + Arrays.toString(arr));

            // now perform the swapping
//
            for (int i = count; i < nums.length; i++) {  //moving the elements
                nums[i- count] = nums[i];
            }

            for (int i = 0; i < arr.length; i++) {  // copying the remaining elements.
                nums[count + i] = arr[i];
//            }
                for (int equal = 1; equal < nums.length; equal++) {
                    if (nums[equal - 1] < nums[equal] || nums[equal - 1] == nums[equal]) {

                    }

                        return true;

                    }

                }
            }
            return false;
        }
    }
}

 */


/*
public class CheckIfArrayIsSortedAndRotated {

    public static void main(String[] args) {
//        int[] nums = { 3,5,1,2};
//        int[] nums = { 6,3,5,1,2};
        int[] nums = {0, 3, 5, 1, 2};
        CheckIfArrayIsSortedAndRotated object = new CheckIfArrayIsSortedAndRotated();
        System.out.println("sorted after rotation:  " + object.check(nums));
    }

    public boolean check(int[] nums) {
        boolean istrue = false;
        int smallest = Integer.MAX_VALUE;
        int d = 0;
        int num  = -1;
//        boolean sorted = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
                d = i;
            }
        }
        System.out.println("smallest " + smallest);
        System.out.println("shift " + d + " elements");
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return istrue;
            }
        }
            else {
                int[] arr = new int[d];
                // copy the elements before the d

                for (int i = 0; i < d; i++) {
                    arr[i] = nums[i];
                }
                // move elements to forward.
                for (int i = d; i < nums.length; i++) {
                    nums[i - d] = nums[i];
                }
                //copy the elements from the arr to nums.
                int j = 0;
                for (int i = nums.length - d; i < nums.length; i++) {
                    nums[i] = arr[j];
                    j++;
                }
                System.out.println(Arrays.toString(nums));
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i - 1] == nums[i] || nums[i - 1] < nums[i]) {

                    } else {
                        return istrue;
                    }
                }  //return  true ;// System.out.println(Arrays.toString(nums));

            }


            return true;
        }
    }
*/





