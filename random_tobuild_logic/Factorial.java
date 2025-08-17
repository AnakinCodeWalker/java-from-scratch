public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }

    public static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value = value * i;
        }
        return value;
    }
}