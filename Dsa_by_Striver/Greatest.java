public class Greatest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2};
//        int[] arr ={};
        Greatest object = new Greatest();
        int value = object.largestElement(arr);
        if(value == -1) {
            System.out.println("array is empty ");
        }
        else{
            System.out.println("The greatest element present in the array "+value);
        }
//        System.out.println("");
    }

    public int largestElement(int[] arr) {
        int index = -1 ; // to return the index of the current biggest element.

        if (arr.length == 0) {
            return -1;
        } else {
            // return the largest in the array.
            int largest = Integer.MIN_VALUE;
            // not taking  -1 as if array contains negative numbers.
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];

                    index = i ;


                }
            }if (index != -1) {
                System.out.println("The grestest element is present at Index: " + index + " and position " + (index+1));
            }
            return largest;
        }
    }
}