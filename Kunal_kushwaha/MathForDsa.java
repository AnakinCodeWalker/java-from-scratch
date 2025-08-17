// NOTE  :Java doesn't allow & directly in an if condition without parentheses,
// because of operator precedence..

public class MathForDsa {
    public static void main(String[] args) {
        System.out.println(  isEven(-2) );
        int[]nums = { 2 ,2, 1, 3, 4, 3, 6, 1,4}; // 6 is the only number that is not appearing twice.
        System.out.println(missingNumber2(nums)) ;
    }
    public static boolean isEven(int n){
//        if ((n & 1) == 0 ) {  // remember the operator precedence
//            return true;
//        }               // and since this whole code  is an expression in its own
        // I can return it  , it is going to be evaluated as true or false
//        else{
//        return false ;
//    }
        return (n&1) == 0 ; // since this is an expression i can return it.
        // internally it is performing and with  only the last bit of the number.

        }
        public  static int missingNumber2(int[]arr){
        int sum = 0 ;
        for (int i = 0 ; i < arr.length ;i++){
            sum = sum ^ arr[i];
        }; return sum ;

        }

        // return the missing number form an array where every one of the element appeared twice.

}
