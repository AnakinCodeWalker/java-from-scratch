package Sorting;

import java.util.Arrays ;
public class BubbleSort {
    public static void main(String[]args){
bubbleSort();
    }
    public static void bubbleSort(){
//        int [] arr = {3 , 1, 5, 4 , 2} ;
        int []arr = {1, 2 , 3 , 4 , 5};
        for(int i  = 0 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr.length -i ; j++){
                if( arr[j]  < arr[j-1]){
                    int temp = arr[j] ;
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    };
}
