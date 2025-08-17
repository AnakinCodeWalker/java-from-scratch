// in java random is a class  in the java.util package.
// it is used to generate pseudo random numbers of diffrent types 
// such as int , float , double , long and float

// it allows generating random numbers within a specified range
// last number is exculsive
// (1 - 11) --> will generate numbers between 1 to 10.

import java.util.Random ; // importing the random class

// the methods in random class is non static so you need to create
//object of it to use the methods of random class

//*****************  ALSO LOOK FOR MathClassIn.java 

public class RandomClassIn {
 public static void main(String[] args) {
    Random random = new Random(); // creating the random class object
    
    // it is not mandatory pass the starting range 
    // ending range will be exluded 
   
    // 1.
  int num = random.nextInt(3);
   System.out.println(num); // printing a random number (exlusive - 3)
    
  // 2.
  boolean Value  = random.nextBoolean();//will print true or false
    System.out.println(Value); // will print true or false only 
 
 }   
}
