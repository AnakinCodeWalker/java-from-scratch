public class PairInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
//[[2 ,4] [2,6] [2,8] [2,10] //pairs
// [4 ,6] [4,8] [4,10]
// [6,8] [6 , 10]
// [8,10]]
// take one element as starting then choose all the elements after that
        pairs(arr);
    }
public static void pairs(int[]arr){

        for(int i = 0 ; i<arr.length ;i++){ // first column
            for (int j = i+1 ;j< arr.length ;j++){ //current column+1 element
                System.out.print("["+arr[i]+" , "+arr[j]+ "]");
            }
            System.out.println();
        }
}
}
