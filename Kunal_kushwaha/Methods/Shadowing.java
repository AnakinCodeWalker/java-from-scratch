package Methods;

// whatever defined in the upper block can be accessed  in the inner blocks
// // whatever defined in the Inner block can not  be accessed  in the outer blocks
// // whatever defined in the Inner block can be redefined in the outer blocks

// java does not allows shadowing in nested blocks

// concept of shadowing..

public class Shadowing {
    // so whatever variable is going to be initialized here can be accessed anywhere
    // in this program
   // this is the outermost block so it can be accessed in the inner blocks also
  static   int high = 90 ; // so the thing to use something inside of the main
    // you have to either make it static or make the object to access them.
static  int num = 1 ;
    public static  void main(String[] args) {
        int value  = 5 ;
        // whatever is written over here can be available for  all the scopes that are
        // going be present in this block.
        int a = 99 ;
        System.out.println(high); //90
        System.out.println("another example : "+num);
int num ; // it is declared so it is going to shadow the static variable

//        System.out.println(num); // it is going to say that the variable is not initialized .
        // so the thing i wanna tell you that the shadowing scope of a variable start when it
        // it is declared not when it is initialized
        num = 56 ;
        // now when you try to  print it will print give you 56 in this scope
        // when you try to access it outside this scope it will print 1
        // and remaining rules are same as high variable ...
        int high = 40;
//      now when you try to access modify high it is going to do with 40.
        System.out.println(high); //40
        {
            System.out.println(high);
        }

        {
            // i can  access a here also .
//            System.out.println(a);
            System.out.println(high); // since this block is inside the
//            main() method so internal high  is shadowing  the static high
        }
        {
//            int high
//            can not do it because of the rules of the scoping
//                outer variable can not  be initialized inside a inner block
//but inner block variable can be initialized in outside scope
        }
hello();
    }

public static void hello(){
//        a = 99 ;  since this method is outside the block of the main method
    // you can not access the variable  here .
    System.out.println("static variable inside method : "+high)  ;//90
    // defined  in the outermost block so can be accessed from anywhere.
int high = 100 ;
// shadowing the static variable
    // now whenever you try to access high it is going to give you 100 instead of 90
    // because it is shadowed

    System.out.println("shadowing in method "+high); //100
    {
        int x = 5 ;
    }
    {
        int x = 6 ;

    }
//    System.out.println(x);
    }
}
