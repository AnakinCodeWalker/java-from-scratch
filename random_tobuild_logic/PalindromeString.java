import java.util.Scanner;

public class PalindromeString {
    public static void main(String[]args){
        System.out.println("String is palindrome   ? ");
        if(palin()){
            System.out.println("yes");
        }
        else {
            System.out.println("False");
        }


    } public  static boolean palin(){
        String name = "Mom" ;
        name = name.toLowerCase() ;
        int j = name.length()-1 ;
        for(int i = 0 ; i < name.length()/2 ; i++) {


            if (name.charAt(i) != name.charAt(j)) {
                return false;
            }
            j-- ;
        }
      //  return  true ;

    return true ;
    }
}
