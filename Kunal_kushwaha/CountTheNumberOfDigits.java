/* LEETCODE QUESTION
Modulo by 10 (number % 10) returns the last digit of the number.
Example: 1234 % 10 = 4

Division by 10 (number ÷ 10) returns the number without the last
 digit (essentially removes the last digit).

Example: 1234 ÷ 10 = 123.4 (or just 123 if you're considering
only the whole part).*/

public class CountTheNumberOfDigits {
    public static void main(String[] args) {
        int dividedNumber = 1234 ;
        int value = dividedNumber / 10 ;
        System.out.println(dividedNumber);
        System.out.println(value);

        int number = 34235 ;
        int modulus = number % 10 ;
        System.out.println(number);
        System.out.println(modulus);


    }
}
