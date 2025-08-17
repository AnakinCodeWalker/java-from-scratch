import java.util.Arrays;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 4, 6};
        int unique = 1 ;
        int unique2 = 1 ;
        for(int i = 1 ; i< nums1.length ; i++){
            if(nums1[i-1] != nums1[i]){
                unique++ ;
            }
        } for(int j = 1 ; j < nums2.length ; j++){
            if(nums2[j-1] != nums2[j]){
                unique2++ ;
            }
        }
        System.out.println((unique));
        System.out.println(unique2);

        int [] arr = new int[unique+unique2] ;
        int i =0 ;
        int j = 0 ;
        int k = 0 ;
        while (i < nums1.length) {
            if (nums1[i] < nums2[j] && arr[k] != nums1[i]) {
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }
            while (j < nums2.length){
                if(nums2[j] < nums1[i] && arr[k] != nums2[j]){
                    arr[k] = nums2[j];
                    j++ ;
                    k++ ;
                }

        }
        System.out.println(Arrays.toString(arr));
    }
}
