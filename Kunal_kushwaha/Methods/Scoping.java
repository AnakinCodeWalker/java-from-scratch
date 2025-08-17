package Methods;
//1. method scope
//2. block scope
// 3. loop scope

// anything initialized outside can be accessed inside
// but anything initialized inside can not be accessed outside.
// anything if it is initialized once can not be reinitialized, but you can modify/updating the value
// inside block values can be reinitialized as well because outer scope doesn't know about inner scope so you can reinitialize them again outside .
// thats it .

/*
Method Scope
Variables declared in a method exist only during that method’s execution.

Block Scope
Any { … } forms a new inner scope.
Inner scopes can see outer‐scope variables; outer scopes cannot see inner‐scope variables.

Redeclaration vs. Reassignment
You can’t redeclare a variable in the same scope (e.g. int num = … twice).

You can reassign to an existing variable anywhere within its accessible scope.
 */
public class Scoping {
    public static void main(String[] args) {
/*
        //3. Scoping in the loops.
        int n =  5
        for (int i = 0; i < n; i += 1){
            System.out.println(i);
    }
//        System.out.println(i);// this will give me an error because i can not access the variable that is define inside the
        // loop , i can not access it outside the loop body.

 */
        int num = getNum();
        {
            int n = 5;
            for (int i = 0; i < n; i++) {
for (int j = 0 ; j< 5 ; j+=1){
    i = i+2 ; //
}
//j = 9 ;  // here you can't access j because  it is defined inside block
  //      int j = 1 ; //but if you define j outside you can do it
// here same goes for the loop whatever defined inside can not be access outside
                // whatever define outside can be accessed inside.
                       // whatever defined inside block can be redefined in outside block also
            }
        }
//        System.out.println(a); // trying to access a variable that is defined in block scope
        // it will give me an error , because variable is of block scope


        System.out.println(num);
        // one more thing i like to  mention is any instance block scope  variable can be accessed by method of that class.

        // values initialized inside a can be accessed in that block only
        // main ka block kai andr koi or block bnayega to usme access kr skta hai kuki ultimately
        // main block kai andr hai chota wla block
        // bada block kai andr  koi chota block hai to usme bada block ka value acess ho skta hai pr
        // chota block ka value uskey bahara bada block mai nhi ho skta hai .
        {
            int value = 90;
            {
                value = 56;
                int innerblock = 67;
            }
//            innerblock = 99 ; this will give an error
            // chota block ka value bada mai access nhi ho skta hai
            // but bada ka chota mai access ho skta hai
            System.out.println(value);
            // this will print the updated value .
        }
        random(); // calling the random method
        // you do realise one thing that method will get memory when it is called and the memory that is allocated
        // to the method is released once the method execution  is over.
        // for the scope
    }

    private static int getNum() {
        int num = 99;
        {



            //2 . all the comment inside are about the block scope.
            int a = 5; // this is initialised inside this block so it is accessible within
//            this block only
            // if  you try to print  it out-side the block or try to access it outside the block
            // it will give me an error.
            // the values initialised in this block will remain in this block only

//             if you try to reinitialize a variable that is already present in a block that
            // will give you an error
//             int num = 101 ; // will give an error because num is already defined in a block

            //  you can update the  predefined variable like :
            num = 10;
        }
        return num;
    }


    //    1. method scoping
    // the variables defined inside this method can be accessed only inside of this if you try to access them outside
    // it will give you an error.
   /*
    public static  void sort(){
        int number  = 902 ;
    }
//        System.out.println(number); //  this will give you an error because this is out of scope
    // you can not access a variable  outside a method that is defined inside a method
  */

    public static void random() {
        int a = 5;
        int b = 6;
        /*
        {
            int n = 5 ;
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
        }
        // NOTE : - whatever is in the inside scope has no idea regarding the outside scope so we can reinitialize them
        int n  =10 ;
        int i =  6 ;

         */
//    }
//}





    }
   // System.out.println(a) ; // this is going to give me an error because you are  trying to access a variable outside the method


}