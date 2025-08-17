////package apna.college;
/// FIR SE BNAO CODE WRONG HAI
/////*
////public class PrimeNumberOrNot {
////    public static void main(String[] args) {
//////        System.out.println(primeNumber(7));
////         primeInRange() ;
////    }
////
////
////    private static boolean primeNumber(int n) {
////        boolean flag = true;
////        for (int i = 2; i < n - 1; i++) {
////            if (n % i == 0) {
////
////                flag = false;
////                return flag;
////            }
////        }
////        return flag;
////    }
////
////
////// all  prime number  in range.
////
////
////    private  static void primeInRange() {
////        //  int start = 3 ;
////int start  =3 ;
////int end = 10 ;
////for ( ; start <=end ;start++){
////  for (int i =  2 ; i < start-1 ; i++){
////   if (start % i == 0){
////       continue;
////   }
////  }
////
////}
////    }
////}
////*/
////public class PrimeNumberOrNot {
////    public static void main(String[] args) {
////        primeInRange(3 ,10);
////    }
////    public static void primeInRange(int start , int end){
////      int num = 10 ;
////        for (int i = 2 ; i < num-1 ; i++){
////
////            if ( num% i ==0){
//////                System.out.println();
////            }
////        }
////    }
////}
//package apna.college;
//public  class PrimeNumberOrNot {
//    public static void main(String[] args) {
////System.out.println(prime(7));
//        System.out.println(optimizedPrime(3));
//    }
//// brute force approach is just taking an element and
//    // if it get divided by any number except 1 and the number itself return false
//    // either true.
//
//    /*
//    public static boolean prime(int n) {
//        for (int i = 2; i < n - 1; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    //OptimizedPrime.
//    public static boolean optimizedPrime(int n){
//        if (n==2){
//            return true ;
//        }
//        for (int i =2 ; i <=Math.sqrt(n) ; i++){ // [ under root n via srt() ]
//            if (n%i==0)
//                return false ;
//        }
//        return true ;
//    }
//    */
//
//    //prime in range
//    public static  void primeInRange(int n ,  int start,  int end){
//
//        for(int i = start; i <= end ; i++){
//            for (int j = 2 ; j <start-1 ;j++){
//                if (n%i==0){
//                    break;
//                }
//
//            }
//
//        }
//    }
//}