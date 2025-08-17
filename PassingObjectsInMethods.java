// Primitives are passed by the values  and objects are passed by reference.
// when you pass a primitive value the actual value is copied 
//( the method will now operate on the copied value  of the primitive  , not the original value.)

// when you pass an object the value of the refrence is passed.
//(when you pass the objects in methods you are actually passing the value  of refernece of the object not the actual object itself. )

/*  code 
 public class PassingObjectsInMethods {   // value will not swap  through this method.
    public static void main(String[]args){
        int a  = 2;
        int b = 9 ;
 swap(a , b );
 System.out.println("the value of a  is "+ a + " and b is "+b);
    }
    static void  swap(int a , int b){   // the copy of the actual value is passed.
       
int temp = a ; // the values will not be changed here . because copy of the orignal value value is passedd not  the actual value itself

a = b ;
b = temp ;
 
    }

}
 */

 /*
 code 
import java.util.Arrays;

public class PassingObjectsInMethods {  // this willl change the oroginal object beacuse
    //  value of the refrnece is passed and both of them are poinitng to  the same object
    //   in the heap memory (cange made by one variable will be shown  in another variable).
 
    public static void main(String[] args) {
    int [] arr ={1 , 2 ,3 ,4, 5};    
 change(arr); 
 System.out.println(Arrays.toString(arr)); 
}
 static void change (int[]nums){
 nums[0] = 99 ;
 }
 }

 */
