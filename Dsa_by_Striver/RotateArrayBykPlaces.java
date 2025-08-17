import java.util.Arrays ;
public class RotateArrayBykPlaces {
    public static void main(String[] args) {
int d = 3 ;
int [] arr = {1,  2, 3, 3, 4} ;
int [] temp = new int[d];
for (int i = 0 ; i < temp.length ;i++){
    temp[i] = arr[i] ; // d elements are copied in another array.
}
for(int i = d ; i < arr.length ;i++){
    arr[i-d] = arr[i] ;
}
int j = 0 ;
for(int i = arr.length -d ; i<  arr.length ; i++){
     arr[i] = temp[j] ;
     j++ ;
}
        System.out.println(Arrays.toString(arr));


    }
}