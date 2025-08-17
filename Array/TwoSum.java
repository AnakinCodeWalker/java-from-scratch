import java.util.Arrays ;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 8, 11, 13};
        System.out.println(Arrays.toString(arr));
        System.out.println(" "+twoSum(arr, 19));
    }
    public static  int twoSum(int[]arr , int target){
        int j = arr.length-1 ;
        for(int i = 0 ; i < arr.length ; i++){
         if(target == arr[i]+arr[j]){
             System.out.println(target+" is  the sum of "+arr[i] +" and "+arr[j]) ;
             System.out.println(target+" is  the sum of index : "+i +" and index: "+j);
        return 0;
         }    j-- ;
        }
        return  -1 ;
}
        }