public class CheckSorted {
    // check if sorted in non-descending order.
    public static void main(String[] args) {

        int[] arr = {1, 3 ,2, 3, 3, 4};
        boolean value = sorted(arr);
        if (value) {
            System.out.println("array  is sorted");
        } else {
            System.out.println(" array is not sorted");
        }
    }

    public static boolean sorted(int[] arr) {
        for (int i = 1; i < arr.length; i += 1) {
            if (arr[i - 1] > arr[i]) {
                return false ;
            }

        }

    return false ;
    }
}
