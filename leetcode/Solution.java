// baki hai code  iska

import java.util.Arrays;
// every number is coming twice except one element find the missing one.
public class Solution {
    public static void main(String[] args) {
       // int [] nums  = {1} ;
        int[] nums = {2,2,1} ;
        Solution object = new Solution();
        System.out.println(  object.singleNumber(nums));

    } public int singleNumber(int[] nums){
        int sum = 0 ;
        int originalSum =  0 ;
        int greatest =Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE ;
        for(int i = 0 ; i< nums.length ; i++) {
            if (greatest < nums[i]) {
                greatest = nums[i];
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        if (greatest == smallest){
            return greatest ;
        }else {
            System.out.println("hi"+ Arrays.toString(nums));
            for (int i = 0 ; i < nums.length ; i++){
           sum = sum + nums[i] ;
//           sum = sum*2 ;

            }  //sum = sum*2 ;
            System.out.println(sum);
            for (int i = smallest ; i < greatest; i++){
           originalSum= originalSum+ i  ;
//           sum = sum*2 ;

            } originalSum = originalSum*2 ;
        }
return  originalSum-sum ;
    }
}
