// code to find an element in the 2d matrix.

import java.lang.reflect.Array;
/*The java.lang.reflect.Array class provides static methods to create and manipulate
 arrays dynamically at runtime,especially when you don’t know the type or size of the
 array at compile time.*/

//Integer is a class which contains a constant MIN_VALUE --> minimum value variable can hold.
        // constant are written  as capital letter by default
import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int [] [] arr ={
                {2 ,3, 4},
                {5 ,6 ,7},
                {8 , 9, 10, 11}
        };
        int target = 9 ;


       int []result   = found(arr , target) ;
       if(result[0]!= -1 && result[1]!= -1){
        System.out.println("Index  of "+target +" is : "+Arrays.toString(result));
       }else {
           System.out.println("not found");
       }
    } public  static  int[] found(int[][]arr, int target){
        int[]index  = {-1 , -1}  ;
        for (int row = 0 ; row  < arr.length; row++){
            for(int column = 0 ; column < arr[row].length ; column++){
                if(  target == arr[row][column]){
                    System.out.println("found ");
                index[0] = row ;
                index[1] = column ;
                return index ;
                }
            }
        }   return index ;
    }
}
