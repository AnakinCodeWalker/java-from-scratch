import java.util.Arrays ;
public class MoveAllZero {
    public static void main(String[]args){
        int[] arr ={1 ,2, 0 , 3, 0 , 5, 0 , 4 } ;
        int j = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]==0){
          j = i ;        // this is to find the first the zero element on the
                             // array.
          break;
      }

        }
        // now we will check after the first zeroth element of the array.
        for(int i = j+1 ; i< arr.length ; i++){
            if(arr[i]!= 0){ // which one is first non zero  then swap these two.(zero and non-zero)
                arr[j] = arr[i];
                arr[i] = 0;
                j++ ;
            }

        }
        // using a for loop to print till the part where non zero elements are present.
        for (int i = 0 ; i < j ; i++){
            System.out.println(arr[i]);
        }
    }
}