package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = {1,33,3,5,6};
        quick(arr ,0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[]arr ,int low , int high){
        if(low >= high){ //base case
            return;
        }
        int start = low ;
        int end = high ;
        int mid = start+(end-start)/2 ;
        int pivot = arr[mid] ;
        while (start <= end){
            while(arr[start] < pivot){  // while elements before are less than it
                start++;  // move ahead
            }
            while (arr[end] > pivot){  // while elements are greater than pivot
                end--; // move backwards
            }
            if (start<=end){  // logic to swap
             int temp = arr[start]; // will only hit when the condition is voilated
             arr[start] = arr[end];//
             arr[end] = temp;
             start++ ;  // after my swap is done increment start by and decrement
             end -- ;  // end by 1.
            }
        }
        // now call the recursion.
        quick(arr, low , end);
        quick(arr , start, high); // why here start at first not high at first ??
    }

}
