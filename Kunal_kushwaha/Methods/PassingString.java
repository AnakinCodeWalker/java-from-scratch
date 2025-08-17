package Methods;

public class PassingString {
    public static void main(String[] args) {
        System.out.println(greet("Pream"));
        // here you are calling the method greet and passing the value pream as a parameter
        // so pream is going to be stored in the name variable
        // now after return statement hits it is going to print
//        hello my name is pream
    }
    public static String greet(String name){ // here this method is going to return a string value
        //it is going to take string value as a parameter
        return "hey my name is "+name ;
        //here you are returning the String with pream.
    }
}
