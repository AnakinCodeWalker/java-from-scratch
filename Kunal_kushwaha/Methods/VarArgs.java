package Methods;

import java.util.Arrays;

public class VarArgs {
    // you can pass variable length argument in the method
    // suppose you dont know the number of args you need to pass in the method you can use
    // var args

    // so the thing about var args is internally they are stored like an array
    // based on the data type of the argument like  var args of integer then array is of type int
    //if var args of type of string then internally they are going to be stored in an array of string

    // the length of the array varies upon the number of arguments
    // suppose you created a var args but not initialized it
//    .. then in that case array is going to be empty.

    // var args should always be in the  method as a last argument.


    // instead of using  ...v you can other variable name also like p oe whatever it's
    // just a naming convention.

    // if you try to  put multiple var args in a method this will give you an error.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(num(2 ,3, 4,5 , 6,7, 10,9)));

        System.out.println(Arrays.toString(str("pream" , "prince")));
        System.out.println(Arrays.toString(empty()));

        num(23 , "prem" , true ,false , true , true , false);
        // here you can see that num is also showing the compile time polymorphism or
        // method overloading (we have method already  but with only var args in it.)
    }
    public static int[]num(int...v){ // this will create an array of integer and store
//        the args in it
        return v ;
    }
    public static String[]str(String...v){
//         this will create an array of String an store the value in  it.
        return v ;
    }
    public static int[]empty(int...v){ // this will create an empty array of integer
//because i am not passing anything into it.
        return v ;
    }

    // not allowed cases in var args..
//    1. var args are only allowed as the last argument
    public static void num(  int value ,String value2,boolean...v){ // this will create an array of boolean and store
//        the args in it
//        multiple type of args can be passed in the method
// and the order in which they are passed is very important
// if you change the order this will give you an error , you can not change the order.

    }
    /*
    //2. more than one var args
    public static void mix(int...v , String...s){
        system.out.println("this will give you an eror") ;
        // you can not have 2 var args in a method
    }
    //3. in between var args
    public static void middle(int x , int ...p , int y){
        System.out.println("you can not also have var args in between ");
        // because how the compile will  know that var args ended here and you are  passing
        // the next type of arguments

     */
    // i hope till now you have that knowledge that you know
    // the values should be passed in the order of the args

  /*
   // funny(2 , "meow");
    // the order in which variable are passed and arguments are present
    // does not match at all it will give  an error.
    public static void funny( String voice  , int a ){
      */

        /* one last thing i like to mention is if you are  passing  a parameter then you
        should pass the vlaue of it as well and vice versa .. if not so it will give you
        an error.
   */

    }

