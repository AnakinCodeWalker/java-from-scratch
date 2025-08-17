public class CheckSmallestInDuplicateArray {
    public static void main(String[] args) {
       // first one is the smallest and after it will not change.
        int[] nums = {1 ,1, 1, 1,1} ;
        int smallest = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i]> smallest){
                smallest = nums[i] ;
            }
        }

    }
}

