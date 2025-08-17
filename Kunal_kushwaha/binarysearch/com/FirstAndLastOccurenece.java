package binarysearch.com;

import java.util.Arrays;

public class FirstAndLastOccurenece {
    public static void main(String[] args) {
        int target=8 ;
        int []arr={2,3,4,5,6,6,7,8,8,8,8,9,12};
        System.out.println("First occurrence of the "+target+" is :"+binarySearch(arr,target));
        System.out.println("Last occurrence of the "+target+" is :"+binarySearch2(arr,target));
    }
    public static int binarySearch(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
        int ans = -1;
        System.out.println(Arrays.toString(arr));
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return ans;
    }
    public static int binarySearch2(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return ans;
    }
}
