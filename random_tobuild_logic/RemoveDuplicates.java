import java.util.Arrays;
//..  so in copyof range method the last index is exclusive.
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]arr = { 2  , 3 , 3 , 4, 5, 6 ,6 ,7};
        int j = 0 ;
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i]!=arr[j]){
                  arr[j+1]  = arr[i];
                j++ ;
            }

        }
//        Arrays.copyOfRange()
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOfRange( arr, 0, j+1)));
    }
}
