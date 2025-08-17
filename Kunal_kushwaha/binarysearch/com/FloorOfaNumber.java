// working pretty well
package binarysearch.com;
// floor: - if the target is present, it will return the target
// if it's not, it will return the greatest number smaller or equal than the target

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[]arr={ 1,4,5,6,8,9,10};
    int target=0; // will return -1 because in the end, the end pointer will go out of bound

        System.out.println(floor(arr,target));
    }
    public  static  int floor(int[]arr ,int target){
        int start=0 ;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;

        } else if (target>arr[mid]) {
            start=mid+1;
        }else {
            end=mid-1;
        }
        }
        return  end;
    }
}
