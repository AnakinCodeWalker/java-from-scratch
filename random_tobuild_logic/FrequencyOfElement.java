public class FrequencyOfElement {
    public static void main(String[] args) {
        int target ;
        int count = 0 ;
        int [] arr = { 1 ,2, 2, 3, 3, 4} ;
        for(int j = 0 ; j< arr.length ; j++){
            target = arr[j] ;
            for (int i = 0 ; i< arr.length ; i++){
                if (arr[i]==  target){
                    count++ ;
                }
            }
            System.out.println("the frequency of " +arr[j]+" is " +count);
        }
    }
}
