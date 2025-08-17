// methods are block of code defined inside a class.
//methods are just functions which are defined insdie the body of the class. 
// if you are creating a method of string type and retrurning another type of value it will five an error.
// ( the values of the actual argumetns are passed  to the fromal arguments.)
// Syntax :- Access specifier _ return type _ method name _ (Arguments(Formal_arguments))
//{
// method body
//}

// Methods are declared outside the main body but called throguh them.

/*public class MethodsIn {  //(void type method)
    public static void main(String[]args){
        System.out.println("code to represent method in java");
 greetings();
    }
//Access specifiers _ static keyword _ return type _ method name(parameters)
    public static  void greetings(){
      System.out.println("code to represent  void method in java");
      System.out.println("hello goodmorning ! ");
    }
}
*/ 

// method with return type of string value.
// retrunig a String value. 
/*
public class MethodsIn {
public static void main (String[]args){
 String  pleasure  = Greetings();
System.out.println(pleasure);
}
static String Greetings(){
String greets  = "Have a nice day";
 return greets ;

}
    
}
*/

/*
public class MethodsIn {

    public static void main(String[]args){
int value  = sum(5 , 7);  // method call + actual arguments
System.out.println(value);
    }
    //  method with arguments.
     public static int sum(int a  , int b){  // formal arguments( the values of the actual argumetns are passed  to the fromal arguments.)   
        int c  = a + b ;
        return c ;
     }
} */
