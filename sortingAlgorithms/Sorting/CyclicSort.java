package Sorting;

// worst case is for n number n -1 swaps and n comparison for checking sorted or not
// so overall 2n-1 so it will be big-oh(n).

import java.util.Arrays;

// use when number are from 1 to n in range
// we know after sorting the elements are going to be like
// index = value- 1 ;
// lets say array is 3 5 1 2 4
//so  after sorting  is going to be index-1
//2 5 3 1 4 we swap numbers.
// just swap again again until the array becomes sorted(swap element with index -1 )
// in the end when element get in correct position so the variable will move ahead
// again and loop will be over
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int i = 0;
//if (arr[i]-1 == i){
//    System.out.println("hi");

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }

        }
    }
}
