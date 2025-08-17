
package array.com;

public class MaximumSubArraySumI {
    public static void main(String[] args) {
        //here you have to find the sub Array sum for all the element in the array then print the maximum among all the
        //sub Array sum.
        int[] arr = {1, -2, 6, -1, 3};
        int maximumsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += arr[k];
                }
               System.out.print(currentsum + " ");
              if (maximumsum < currentsum) {
                  maximumsum = currentsum;
                }

            }
        }
        System.out.println(" ");
        System.out.println("the maximum sum in the array is " + maximumsum);
    }
}

//public class MaximumSubArraySumI {
//    public static void main(String[] args) {
//        int[]arr={1, -2, 6, -1, 3};
//       int current=Integer.MIN_VALUE;
//        for (int i =0 ; i<arr.length;i++){
//            for (int j=i;j<arr.length;j++){
//                int sum=0;
//                for (int k=i;k<=j;k++){
//                    sum+=arr[k];
//                }
//                System.out.print(sum+" ");
//                if (current<sum){
//                    current=sum ;
//                }
//
//            }
//        }
//        System.out.println(" ");
//        System.out.println("maximum sub array sum is : "+current);
//    }
//}