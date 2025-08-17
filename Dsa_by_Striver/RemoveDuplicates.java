
public class RemoveDuplicates {
    public static void main(String[]args){
        int [] arr = {1 ,1, 2, 3 ,4 ,4, 5 } ;

        int j = 0 ;
        for(int i = 1 ; i < arr.length ; i++){ // start from first index
            // because 1st one is on its correct position.
 // no element is found which is not equal then loop will continue.
            if (arr[i] != arr[j] ){ // check which element is not equal.
// who ever is not equal place in front of j.
                arr[j+1] = arr[i] ;
                j++ ; // now j is pointing to the current element.
            }

        }   System.out.println("unique element in the array : "+(j+1));
    }
}


/*
import java.util.Arrays ;
class Solution {
    public static void main(String[]args){
    int[] nums = {1,1,2} ;
    Solution object = new Solution() ;
       int value =     object.removeDuplicates(nums) ;
       System.out.println(value);
    }
    public int removeDuplicates(int[] nums) {
        int j = 0 ;

        for(int i = 1 ; i< nums.length ; i++){
            if(nums[i]!= nums[j]){
                nums[j+1] = nums[i] ;
                j++ ;
            }
        } for(int i = 0 ; i <= j ; i++){
            System.out.println(nums[i]) ;
        }
        return j+1;
    }
}
*/