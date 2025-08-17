 // note : - when doing arr[i+1] always go until arr.length -1
// .. otherwise index out of bound error will show up
import java.util.Arrays;

/*✅ Use Enhanced for When:
You just need to read elements
You don’t care about indexes
You’re not modifying the collection
You want clean, readable code
*/
public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[5]; // -> creating the array
        Arrays.fill(arr, 55); // method in the arrays class to fill
        // array with similar values.
arr[2] = 45;
arr[arr.length-1] = 104 ;
        for (int n : arr) { // n is element not the index remember it ...
            System.out.println(n); // iterating over the array
        }
// insertion
        int position = 0;
        int element = 99;
        arr[1] = 96;
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];// this goes out of bound
        }
        arr[position] = element; // adding the element on the vacant space.
        System.out.println("After adding an element : ");
        System.out.println(Arrays.toString(arr));
// deletion
        // now for the deletion part of the elements in array.
        int index = 0;
        int i = index ;
        for ( i = index; i < arr.length - 1; i++) {
            // start from the index and then goes until arr.length-1
            // not arr.length because of
            arr[i] = arr[i + 1]; // this
        }
        // value of i is going to be
        arr[i] = -1; // after the deletion
        // represent element is deleted from here.
        System.out.println("After removing an element : ");
        System.out.println(Arrays.toString(arr));   }
}
