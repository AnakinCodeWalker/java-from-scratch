package Methods;
import java.util.Arrays ;
public class ValueOfReference {
    // here value of the reference is passed it means the copy of the reference is passed and
//    now the reference variable inside the method is also pointing to the original object
//     and any change made by via reference variable of the method will affect the original object.
    public static void main(String[] args) {
         String name = "ramdhari singh" ;
    int [] arr = { 1 ,2,3 ,4, 5};
         greeting(name);

        System.out.println(name);
        System.out.println(Arrays.toString(arr));// array before modification
        modifying(arr);
        System.out.println(Arrays.toString(arr)); // array after modification
    }
//    this is true change made via reference variable affects the original object but here
//     the original object is going to change because
    //  here i am not changing the original object i am just creating a  new object and
    // reference it through the reference variable

   public static void greeting(String name){
        name = "kabir das" ;
        // at first name was pointing to the ramdhari singh and now it is pointing to the
//       other object .
       System.out.println(name);
    }
    public  static   void modifying(int [] arr){
        arr[0] = 99 ; // this will change the original object because here you are making
//         changes via the reference variable and we know change made by reference variable will
//        affect the original object.

        // in previous example we were creating a new object not modifying the original one
    }

}
