// working pretty well
package binarysearch.com;

public class BinarySearch {
    public static void main(String[] args) {
     int[]arr={ 1,2,3,4,5,67,99};
      int result= binarySearch(arr,5);
if(result==-1){
    System.out.println("Target is not present");
}else{
    System.out.println("Index of the target is : "+result);
}
    }
    public static int binarySearch(int[]arr,int target){
      int start=0 ;
      int end=arr.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if (target==arr[mid]){
              return mid ;
          }else if(target>arr[mid]){
              start=mid+1;
          }
          else {
              end=mid-1;
          }
      }return -1;
    }

}
