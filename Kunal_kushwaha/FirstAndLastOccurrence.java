//import java.util.Arrays;
//
//public class FirstAndLastOccurrence {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 7, 7, 9, 10};
//FirstAndLastOccurrence object = new FirstAndLastOccurrence();
//        System.out.println(Arrays.toString(object.searchRange(nums ,7)));
//    }
//
//    public int[] searchRange(int[] nums, int target) {
//        int[]arr = {-1 ,-1 } ;
//
//        arr[0] = findFirstAndLast(nums, 7, true);
//        arr[1] = findFirstAndLast(nums, 7, false) ;
//        System.out.println(Arrays.toString(arr));
//        return arr ;
//    }
//
//
//    public static int findFirstAndLast(int[] nums, int target, boolean firstIndex) {
//        int start = 0;
//        int end = nums.length - 1;
//        int index = -1;// will return -1 if element is not found.
////        boolean firstIndex = true ;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target == nums[mid]) {
// index = mid ; // to keep track of the potential answer.
//               // mid hmesha condtiton false hone se phele first yah last occurrence rhega
//               // according to  the movement
//                // kuki jb loop break hoga tb target != mid hoga
//                // start > end hoga.
//                if (firstIndex) {
//                    end = mid - 1;
//                  //  index = start;
//                } else {
//                    start = mid + 1;
//                //    index = end;
//                }
//            } else if (nums[mid] > target) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return index;
//    }
//}

