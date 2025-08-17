package ConditionalsAndLoops;
// use a for loop when you know the number of iteration you have to perform
// use a while loop when you dont know the number of iterations
// use a do while loop when you want to perform an action at least 1 time.
public class WhileLoop {
    public static void main(String[] args) {
        /*
        while(condition){
        // body
        // increment or decrement the iteration variable.
        }
         */
        int i  = 1 ;
        while (i <= 5){ //will run from 1 to 5
            System.out.print(i + " "); // goes inside and perform the code
    i+=1 ; // increases the value of counter variable
    }
    }
}
