package ConditionalsAndLoops;
import java.util.Scanner ;
public class FibonacciUsingLoops {
    public static void main(String[]args) {
        // fibonacci series is the sum of previous two numbers.
        // 0 1  1 2 3 5 8 13 21 ..
        // 0 then 1 and then sum of previous two number

        int a = 0;
        int b = 1;
        int sum = 0 ;
        System.out.println("enter value of n : ");
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        if(n <= 1){
   sum = n ;
        }else {
            for (int i = 2; i <= n; i+=1) {
                sum = a + b;
                a = b;
                b = sum;
            }
        }
        System.out.println(sum);
    }
}
