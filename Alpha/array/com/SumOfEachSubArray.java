package array.com;

import java.lang.reflect.Array;
import java.util.Arrays;

//  here I need to calculate the sum of each Sub Array
public class SumOfEachSubArray {
    public static void main(String[] args) {

int [] arr = {2,4,6,8,10};
        System.out.println(Arrays.toString(arr));
int count=0;
int currentgreatest=0;
for(int i =0 ; i<arr.length;i++){
    int sumofsubarray=0;
    for (int j=i;j<arr.length;j++){
        for (int k=i ;k<=j;k++){
            System.out.print(arr[k]+" ");// this will print the Sub Array
            sumofsubarray+=arr[k];//this will store the running Sub Array sum
        }
        System.out.println(" ");
    }
    ++count;
    System.out.println("The sum of sub array  "+count+"  is : "+ sumofsubarray );
    if(sumofsubarray > currentgreatest)
        currentgreatest=sumofsubarray ;
}
        System.out.println("The greatest sum of all the Sub Array is : "+currentgreatest);   }
}
