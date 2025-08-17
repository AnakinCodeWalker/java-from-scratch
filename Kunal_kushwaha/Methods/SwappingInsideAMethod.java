package Methods;
// so what happened here it changes the  value inside the method but the original primitives are
// not changed because  for primitives copy of the value is passed
// like they have their own value and change made by them will not affect the original value
public class SwappingInsideAMethod {
    public static void main (String []args){
        int num1 = 4 , num2 = 5 ;
        swap(num1 , num2);
        System.out.println(num1 + "  " +num2);

    }
    public static void swap(int a , int b){
        int temp = a ; // inside the method the values are changed but the thing is a copy of
//        the value is passed for primitives so it will change the original object
          a = b ;
        b = temp ;
        System.out.println(a); // you can clearly see that the value is changed inside the method
        System.out.println(b);// but it changes the copy of the value not the original object.
    }
}

// for objects there is value  of reference is passed  , so a change made by the  method variable
// will get reflected inside the original object