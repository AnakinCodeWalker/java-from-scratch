public class CountMaxConsecutiveOnes {
    public static void main(String[] args) {
      int [] nums =  {1,0,1,1,0,1} ;
CountMaxConsecutiveOnes object = new CountMaxConsecutiveOnes();
        System.out.println(object.findMaxConsecutiveOnes(nums));
    }
        public int findMaxConsecutiveOnes(int[] nums) {
int count = 0 ;
int max = 0 ;
for (int i = 0 ; i < nums.length ;i++){
    if (nums[i]==1){
        count++ ;
        if(max < count){
max = count ;
        }
    }else {
        count = 0 ;
    }
}
        return max;
        }

}
