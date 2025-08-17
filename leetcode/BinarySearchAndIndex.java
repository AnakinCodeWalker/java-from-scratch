public class BinarySearchAndIndex {
    // nums = [-1,0,3,5,9,12], target = 9
    public static void main(String[] args) {
        BinarySearchAndIndex object = new BinarySearchAndIndex();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(object.search(nums, target));

    }

    public int search(int[] nums, int target) {
//        int index;
        int start = 0 ;
        int end = nums.length-1 ;
        while(start <=end){
            int mid = start+(end-start)/2 ;

            if (target== nums[mid]){
                return mid; // returning the index.
            } else if (target > nums[mid]) {
                start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }
        } return  -1 ;
    }
}