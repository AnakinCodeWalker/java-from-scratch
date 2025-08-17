public class EvenOrNotWithVariation {
    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isEven(2));
        System.out.println(isEven2(87));
    }


    // program to find odd or not.
    private static boolean isOdd(int n) {
        return ((n & 1) == 1);
        // we know that if we do  any number & with one is the number remains the same
        // 2 in binary 01 & 1 will give 0 as the last digit
        // so if a number last digit is 0 then it is even else odd
        // if you do binary operation &1 with any number digits remain the same
        // and here ((n&1)==0) this is itself an expression we can return it directly
        // use brackets for operator precedence rule.

    }

    public static boolean isEven(int n) {
        return (n & 1) == 1;
    // if you do &1 digits remain the same and if you do &1 with even remainder will be 1
        // you can do it copy give it a try
        // and since (n & 1) == 1 this thing is expression in itself i can return it itself
         // faster than modulo operators
    }
public static boolean isEven2(int n ){
        return n%2==0 ;
}
// similarly you can go with false but & is chosen over normal one because this one is faster

}

