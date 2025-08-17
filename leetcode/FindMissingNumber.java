public class FindMissingNumber {
    public static void main(String[] args) {
        int []nums = {0,1} ;  // number of element is 2 so find the missing number from 0 to 2
     // n is 2 so return missing number from 0 to 2 .

        FindMissingNumber object  =new FindMissingNumber();
int missingNumber = object.missingNumber(nums);
        System.out.println(missingNumber);
    }public int missingNumber(int[] nums) {
        int n = 0 ; // count the number in array.
        for (int i = 0 ; i<nums.length ;i++){
          n = i ;
        }n++ ; // actual number present in array
//        System.out.println(n);
        int actualSum = 0;
        int sum = 0 ;
        for (int i = 0 ;i < nums.length ;i++) {
            actualSum +=i;
            sum+= nums[i];
        }   actualSum +=n ;
      //  System.out.println(actualSum);

        return actualSum-sum ;

//return 0 ;
    }
}