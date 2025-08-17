import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysInmethods {
    public static void main(String[]args){
int[] nums = {1 , 3 , 5 , 6 };
change(nums);
System.out.println(Arrays.toString(nums));
    }
    static void change(int[]arr){
arr[0] = 99 ;

    }
}
