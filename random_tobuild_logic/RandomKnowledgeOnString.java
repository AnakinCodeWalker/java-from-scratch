import java.util.Arrays;

public class RandomKnowledgeOnString {
    public static  void main(String[]args){

       String value = " " ;

            System.out.println(value.length());
            System.out.println("in array we .length and in string we have .length()");
            System.out.println("length of the empty string is one. ");
System.out.println(value);// empty string

            String type2 = "can be created like this " ;
            System.out.println(type2);

String[] type3 = {"Pream" , "babu"} ; // array of string
            //      0     ,    1    -> internally the length  is going to be 2
            System.out.println(type3); // will print the random value
            System.out.println(type3.length); // print 2
            System.out.println(Arrays.toString(type3));  // use toStirng() ;
            // use array method internally it is just an array of string.

            String[] type4 = new String[5] ;
            // an array of string of size 5.
            type4[2] = "value" ; // other value are going to be null
            System.out.println(Arrays.toString(type4));

            String outsidepool = new String("outside pool String value") ;

            System.out.println(outsidepool);

                    String palindrome = "papa" ;
String same  = "same" ; // same and name are created in the String pool
String name = "same" ; // internally both of them are same for comparator and method as well.
        System.out.println( same == name);
        String   diffrent = new String("value") ; // here we are creating object outside the
        // pool so comparator will return false but the values are same
        // so for method it will return true .

        String  object = new String("value") ;
        // this is less efficient

        // internally  ==  check if the reference variable
        // to both the value are same or not.
        System.out.println( same == name);
        // it only check the values are same or not.
        System.out.println(diffrent.equals(object));
        // it checks the object  references are same or different
        System.out.println(diffrent==name);

        String [] letter = { "ramam" } ; // creating an array of string more elements can be added.
       // using curly brackets as same as arr to directly specify its elements.
        String value1 = "sunita" ;
        String[] array = new String[5] ; // creating an array of size 5 more element than 5 cant be added.
// here i am create an  String array of size 5.
        // internally it is array of Strings.
        char[] arr = new char[5] ;
        // will create an array which is going to store the value of character type in it.
       // char[0] = "s" ; // will give error can not assign a  string  value in character array.


        array[0] = "c " ;
int [] array1 = new int[5] ;
        String print = new String("ravi") ;





    }
}
/*
public class PalindromeOrNot {
    public static void main(String[] args) {
        // String literals are created in the String pool.
        String same = "same";
        String name = "same"; // Both 'same' and 'name' point to the same literal in the pool.

        // '==' checks if both references point to the same object.
        System.out.println(same == name); // true

        // When using the new operator, you create new objects outside the pool.
        String different = new String("value"); // new object on the heap
        String object = new String("value");      // another distinct object on the heap

        // '==' compares references, so these are different objects.
        System.out.println(different == object); // false

        // equals() compares the content of the strings.
        System.out.println(different.equals(object)); // true

        // Comparing a new String with a literal that has different content:
        System.out.println(different == name); // false

        // Creating a String array with one element.
        String[] letter = { "ramam" };

        // Creating a single String variable.
        String value = "sunita";

        // Creating an empty String array of size 5.
        String[] array = new String[5];
        // Initially, each element in 'array' is null.

        // Creating a char array of size 5.
        char[] arr = new char[5];
        // To assign a character, use single quotes (for char values).
        arr[0] = 's'; // Correct: 's' is a char, whereas "s" is a String.

        // Assigning a String to an element of a String array is valid.
        array[0] = "c";

        // Creating a new String object using the new operator.
        // This is less efficient than using a literal, because it creates a new object even if "ravi" exists in the pool.
        String print = new String("ravi");
    }
}

 */