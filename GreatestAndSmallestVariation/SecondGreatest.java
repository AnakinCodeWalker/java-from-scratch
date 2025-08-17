import java.util.Scanner ;
import java.util.Arrays ;

import static java.lang.Integer.MIN_VALUE;  // importing to use the constant MIN_VALUE the minimum value

public class SecondGreatest{
    public static void main(String[]args){
        System.out.println(secondGreatest());
    }
    public static int[]creation(){
        System.out.println("Enter the size : ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
        System.out.println("enter "+size+" elements :");
        int []arr = new int[size];
    for(int i = 0 ; i < arr.length ; i++){
        arr[i] = input.nextInt() ;
    }
    return arr ;

    }
    public static int secondGreatest(){
        int []arr =  creation();  // creation() methods return an array storing it into array of secondGreatest()
      //  System.out.println("Printing the values of "+Arrays.toString(arr));  // --> if print array directly it will
                                                                            // print address and hexadecimal value
      int largest = 0;
      int second = arr.length-1;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > arr[largest]) {
                largest = arr[i];
            }

            // System.out.println("The largest element in the array is :  "+arr[largest]);

            if (arr[i] > arr[second] && arr[second] != arr[largest]){
                second = arr[i];
            }
        }
//            System.out.println("hi");

        return arr[second] ;
        }



    }
