public class ArmstrongNumber {
    public static void main(String[] args) {
        // code baki hai
        // an armstrong number 153 is an Armstrong number because
        // it has 3 digits, and if you cube each digit and add them together, you get the number itself:
        // 1³ + 5³ + 3³ = 153 so armstrong number.
        System.out.println(armStrong(153));
    }
public static boolean armStrong(int n){
        //if a number individual  digits cube  after that their sum is equal then number is armstrong
    // 153 =  1³ + 5³ + 3³ = 153 so armstrong number.
   int remainder = 0 ;
   int result = 0;
   int value = n ;
    while (n>0){

        remainder =  n %10 ;
   result =   result+ (remainder*remainder*remainder);
        n = n /10 ;
    }

    return result == value  ;
}
}