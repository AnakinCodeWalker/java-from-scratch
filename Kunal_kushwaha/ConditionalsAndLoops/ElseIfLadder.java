package ConditionalsAndLoops;
// here the control will only check the  else if condition
// when the if condition becomes wrong.

// but when you put any if condition in your program then it will check all the
// if condition and evaluate the result to true or false
//  dont use multiple if  instead of it use else-if()
/*
public class ElseIfLadder {
    public static void main(String[] args) {
        int age = 99 ;
        if(age == 99){

            System.out.println("dead ");
        }
        if(age<= 99) // this condition is going to be checked does not matter
            // above one is correct or wrong.
            System.out.println("age is 99");
        else if (age == 30) { // this will only be checked above if condition are
            // evaluated to be false.
            System.out.println("young");
        }else {
            System.out.println("not sure");
        }
    }
}
*/
// using the break keyword.
// break keyword can be used only if there is a block of loop or a switch case is present.
public class ElseIfLadder{
    public static void main(String[]args){
        // using the break keyword with the if statement.
        // when break is encountered  inside the block then the control goes
        // out of the block.
      int i = 0 ;
        while(i<2){
        if(true){
            System.out.println("executed the 1st if");
            i++ ;
            break ;  // as soon as it hits the break keyword it control exits the loop body.

        }if(true){ // this will not execute even though the condition is true.
            //because before this break will be encountered  and control goes out of
//                the body.
            System.out.println("executed in 2nd if" );
        }
      i++ ;
        }
    }
}