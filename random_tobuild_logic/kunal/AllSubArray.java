package kunal;
//CODE BAKI HAI
public class AllSubArray {
    public static void main(String[] args) {
        // loo for dsa by Striver copy for better understanding
        int[] arr = {2, 4, 6, 8, 10};

        subArray(arr);
    }

    public static void subArray(int[] arr) {
// to print the Sub-Array
        int tp=0;
for (int i =0 ; i <arr.length ;i++){ // i is o and it goes till arr.length[]
    for (int j =i ;j< arr.length ; j++ ){ //loop starts from i to n[select the elements in between i to n]
        for (int k = i ;k<=j ; k++){ //now here you print all the elements in between the i and j.at first i , j = 0 so only one element
            System.out.print("[ "+arr[k]+" ] ") ;

        }
        tp++ ;
        System.out.println();
    }

    System.out.println();
}
        System.out.println("Total pairs in the array : "+tp);
    }

}