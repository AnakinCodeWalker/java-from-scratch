import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class characterInString {
    public static void main(String[]args){
        String name = "kunal kushwaha" ;
        // it also counts space as characters.
//        char[] newName = name.toCharArray();
        System.out.print("The number of characters  is : ");
       // int j = newName.length-1 ;
        int count = 0 ;
        name = name.trim() ;
        for (int i = 0 ; i < name.length() ;  i++){
//


                 count++ ;
             }
        System.out.println(count);
        }

//        System.out.print(count+ " in : ");


//        System.out.println(new String(newName)); // reconverting the
        // character array   into String
    }

