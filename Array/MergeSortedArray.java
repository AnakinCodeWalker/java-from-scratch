public class MergeSortedArray{
    public static  void main(String[]args){
        int [] arr1 = {1 , 3 , 5 , 7 , 9 } ;
    int [] arr2 = {2 , 4 , 6 , 8 , 10} ;
            sorting(arr1 , arr2) ;
    }
    public static void sorting(int []arr1 , int[]arr2){
        int[]narray = new int[arr1.length + arr2.length] ;
     int i =  0 ;
     int j = 0 ;
     int k = 0  ;


        while(i < arr1.length && j < arr2.length){ // will iterate until 4<5  which is true {5 is the length of array here}
                                                                                // 4 is the index .
            if (arr1[i] < arr2[j]) {
              narray[k] = arr1[i] ;
                i++;
                k++ ;
            }else{
            narray[k] = arr2[j] ;
                j++ ;
                k++ ;
            }
        }
//        while(i > arr1.length && k <= narray.length){ // will  enter only if i value becomes greater than array size.
//            narray[k] = arr1[i] ;
//            i++ ;
//            k++ ;
//
//        }
    }
}