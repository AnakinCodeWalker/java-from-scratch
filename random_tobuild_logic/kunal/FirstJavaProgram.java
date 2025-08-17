package kunal;

public class FirstJavaProgram {
    public static void main(String[] args) {
// dont understand why is this showing an error.
//        System.out.println(args[0]);
//        int rollno = 67 ;
//        String name = "Pream" ;
//        float marks = 45.9f ; // you have to add an f over here
//        double largeFloatingValues = 45.342425 ;
//        long bigIntegerValue = 9282829114L ; // need to add L  for long integer value
//   boolean check = true ;
//   boolean value = false ;



//        int num = 45 ;
//        num.

//   num is the primitive here so it will not provide
//        any additional functionalities.


//        question how to write something with comma
//        use underscore in place of  , they are replaced with comma
//        double num  = 3_378_45;
//        int num = 234_232_453;
//        System.out.println(num);

//        floating point error
//        sometimes when we try to print big floating values
//                it rounds off the result
//        this is called the floating point error.
        float   num = 242.2352345f;
        System.out.println(num);// here the result is going to be round off
// that is known as floating point error.

        // type conversion..(implicit conversion)
//         happens when following conditions are met
//        1. both the type should be compatible
//        2. destination should be greater than source.
     //   float value = num + 23.6f ;
//        System.out.println("example  of implicit conversion : "+value);
//
        //        type casting explicit.
// lets say you want to store the integer value into a byte value
//        you have to convert them explicitly.
//        compressing the bigger value into a smaller value.
        System.out.println("example of narrowing conversion.");

//        int num1 = (int)(24234.5f); // this is an example of narrowing conversion.
//     System.out.println(num1);
// another example of explicit type conversion.
       // one thing to notice when you convert the
//  value into byte value explicitly it will modulo  the value with 256.
//      this happens because even after casting
//     can you store a value greater  than 256 if the capacity is 256
//   so it stores the modulo between the value you are casting  and 256.

//REMEMBER THE RANGE IS 256
//         AND MAXIMUM VALUE YOU CAN STORE IN BYTE IS 127
//        byte val = (byte) 355;
//          355 % 256 = 99

//        System.out.println(val);
//        long num  = 96342242532532L ;
//        System.out.println( (byte)num);


//      Automatic type promotion in expression .
// when you try to perform an expression and store the
// value into int the whole expression in promoted to int type.

 //

 //       expression
byte number = 40 ; // range of byte is 256 and
        // maximum value i can store is -127 to 127
//byte number2 = 127 ;
        byte number2 = 50 ;
byte number3 = 100 ;
   int value1 = (number*number2) / number3;
//    wrong example : byte value2 = number2+number ; // this will be automatically converted into the int and how can you store something
//        in byte if it is bigger than byte (here even 50 + 100) sum of number + number2 is less than 127 but you can
//        not put them into a byte because it is  converted into int implicitly.
//but for constant value if the  result is less than 128 then it can be stored into byte.
byte  constant = 100 + 25 ; // this will give an error or not converted into int but if you use variable
// it will be converted into int.
//        System.out.println(constant);
//
//        System.out.println("showing the use of type promotion in expression :");
//        System.out.println(value1);
//        System.out.println(value2);

//        for char value they are changed to their respective ascii values .
        int ascii = 'a' ;
        System.out.println("Printing the ascii value of character using the int (type promotion) : "+ascii);

//RULES OF TYPE PROMOTION :
        //all the byte short or char value are converted into integer value.
        // all the expression is evaluated into highest value in the expression.
// smaller one are converted into maximum in the expression.
byte b = 42 ;
char c = 'a' ;
short s = 1024 ;
int  i = 50000 ;
float f  = 5.67f ;
double d = 0.1234 ;
double result = (f*b)+(i / c) - (d-s) ;
// this line is used to get the result of the whole expression one by one.
        System.out.println((f*b)+ " " +(i / c)+ " " + (d-s));
        System.out.println(result);
//        UNICODE VALUE WHAT ARE THEY SEARCH ON THEM.

    }
}
