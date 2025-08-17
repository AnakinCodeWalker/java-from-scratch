import java.util.Arrays;
public class AdditionOfTwoMatrix {
public static void main(String[]args){

/*   public class Main {
        public static void main(String[] args) {
            int[][] array = {
                    {1, 2},
                    {3, 4}
            };

            System.out.println(Arrays.toString(array)); // this is going to give you an error
            // internally it just convert it into a string do some formatting and prints it.
            //Because Arrays.toString() doesn't recursively go into nested arrays.
             It just sees each inner array as a single object and calls toString()
             on it — which for arrays, is the default object representation
              (memory address-looking thing).
 */
    int[][] array = {
            {1, 2},
            {3, 4}
    };
    System.out.println(Arrays.deepToString(array)); // you can use this method to print the value of 2d array
    // This method is made for multidimensional arrays — it recursively converts each level into strings.
      // output : - [[1, 2], [3, 4]]
        }
  }

