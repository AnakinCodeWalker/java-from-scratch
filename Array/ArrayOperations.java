// wrong code
//wrong code


import java.util.Scanner ;
import java.util.Arrays ;
public  class ArrayOperations  {

    public static void main(String[] args) {
        System.out.println("how many element you want to enter :");
    Scanner input = new Scanner(System.in) ;
    int size  = input.nextInt() ;
        System.out.println("enter "+size+" elements : ");
     int [] arr = new int[size+1] ; // array creation
    for(int i = 0 ; i< size -1 ; i++) {
    arr[i] = input.nextInt();
    }

        System.out.println("position : ");
  int position =   input.nextInt();
        System.out.println("element : ");
    int element = input.nextInt() ;
//    int [] arr1 = new int[arr.length+1] ;
    for(int i = arr.length - 1 ; i < position ; i--){
        arr[i] = arr[i-1] ;
    }arr[position] = element ;
        System.out.println("new array : "+Arrays.toString(arr));}
    }




