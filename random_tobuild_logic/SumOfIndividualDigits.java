public class SumOfIndividualDigits {
    public static void main(String[] args) {
        int n = 123 ;
        int sum = 0 ;
        System.out.println("Number is : "+n);
        while(n > 0){
            sum = sum+(n%10);
            n = n/10 ;
        }
        System.out.println(" Individual sum is  "+sum);
    }
}
