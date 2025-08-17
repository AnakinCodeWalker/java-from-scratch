package apna.college;

public class ReverseANumber {
    public static void main(String[] args) {
        reverse(10899);
    }
    public static void reverse(int n){
     //   int num = 0  ;
        int rev = 0 ;
        while(n > 0 ){
      //      num = n % 10 ;
//            rev = (rev*10) + num ;
            rev = (rev*10) + (n % 10);
            n = n / 10 ;
//            System.out.println(n);
        }
        System.out.println(rev);
    }
}
