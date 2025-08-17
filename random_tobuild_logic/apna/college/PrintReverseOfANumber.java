package apna.college;
// things to know..
// n % 10 returns last digit of n
// n  / 10 returns the number without last digit of n.
public class PrintReverseOfANumber {
    public static void main(String[]args){
        rev(321);
    }
    public static void rev(int n) {
        System.out.println("number in original order : "+n);
        System.out.print("number in reverse order : ");
        while (n > 0) {
        int reverse = n % 10;
        System.out.print(reverse);
        n = n / 10;
    }
    }
}
