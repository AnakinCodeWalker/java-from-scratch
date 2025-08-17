// knowledge on String methods and type promotion.

package ConditionalsAndLoops;
/*


//  1.  .next() takes the first word as input if you add a space it will terminate means
// it will not  take as  input whatever is written after the space.

input : pream kumar
        output : pream
//  2. .nextLine() takes the line as input , until you press enter and control goes to next line.
input : pream kumar
        is a good boy.
    output : pream kumar

// 3. trim is used to remove the white space


//  4.  .charAt() : return the character at the given index in the String.
name  = pream ;
name.charAt(0); // return the character at the given index.
*/
import java.util.Scanner;

public class UpperCaseOrLowerCase {
    public static void main(String[] args) {
        // using the Scanner class to take the input
        Scanner input = new Scanner(System.in);
        // using the next() in the string to take the input.
//         String value = input.nextLine(); // takes the whole line as input.
        char ch = input.next().trim().charAt(0); // calling the next method  of Scanner class.
      /* calling the method chained up

        1.next() takes the input
                2. trim() removes the white space if any
                      3. charAt(0) : returns character at given () -> index
                .. at last storing the result in char value.
        System.out.println(value);
       */


            // note : when you make comparison character are get converted
            // into their ascii value

      if(ch >= 'a' && ch <= 'z'){ // initially they are comparing the ascii values
           System.out.println(ch + " lower case");
        }else {
            System.out.println(ch + " is upper case.");
        }
    }
}
     /* Sequential call.

        // call when you want to print the result of debug them.
        // call them sequentially when you want the result for further execution
//        // need the reuse the intermediate values.
        String newval = value.trim();
        char find = newval.charAt(0) ;
        System.out.println(find);
        // clear and concise code for debugging also.
*/

// when you assign a char value to integer you are implicittly assigning
// the ascii value
//when you are performing arithmetic operations.
//    int  a = 'a'+'b';
//    char c = (char)('c' + 'a') ; // this will automatically converted into int because of type promotion rules
//byte z = 'a' + 1 ; // this is wrong because you are adding integer to a char so the whole expression is promoted to int type
//            System.out.println(c);
//            System.out.println(a);

/*
        byte a  = 100 , b = 1 ; //
//  byte z = a + b ; // here type promotion will happen because you are using
// two  variable

byte c  =  100 + 1 ; // this will not be converted because you are   using the
//  with constant value  and 101 + 1 comes in the range of the byte so
// compilation issue either.

 */