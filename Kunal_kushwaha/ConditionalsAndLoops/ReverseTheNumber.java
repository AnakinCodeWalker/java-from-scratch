package ConditionalsAndLoops;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 23597;  // this is my number to be reversed
        int ans  = 0 ; // this is the variable that is going to store the result
        while (num > 0) { // repeatedly executing the loop body until number becomes less than 0 .
int rev = num % 10 ;  // so using a variable to store the last digit of the number
            // this variable is inside a loop so it will be reinitialized again again

        num = num /10 ; // after storing the last digit removing the last digit from the number
            ans =  (ans *10)+rev ; //  multiplying the current value of ans with 10 and then
            // adding the value rev variable is currently holding  to my answer
//            ans * 10 + rev -->  0 * 10 = 0 +7
//            ans * 10 + rev -->7 * 10 = 70 + 9
//            ans * 10 + rev -->  79 * 10 = 790 + 5

        }
        System.out.println(ans); // printing the answer
    }
}
