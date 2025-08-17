// working pretty well
package binarysearch.com;
// The Ceiling of the number is the smallest element in the array greater or = target element
// if the target is present it will return the index and if not it will return index of (smallest)next greatest element
public class CeilingOfANumber {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        int target=15;
        int value=ceil(arr,target) ;
        System.out.println(value) ;
    }
     public static int ceil(int[]arr , int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
       int mid=start+(end-start)/2;
       if (target==arr[mid]){
           return mid;
       } else if (target>arr[mid]) {
           start=mid+1;
       } else{
           end=mid-1;
       }
        }   return start;

    }
}
