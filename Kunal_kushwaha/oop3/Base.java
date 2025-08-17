package oop3;
// next, I am going to make a class which is going to extend this one so it can have these properties as well
public class Base {
    public static void main(String[] args) {
// creating objects
//        Baseclass box = new BaseClass();
//        BaseClass box2 = new BaseClass(4);
        BaseClass box3 = new BaseClass(199 ,200,400 );
//        System.out.println("box value via default constructor  : "+box.length +" " +box.width +" "+box.height);
//        System.out.println("box 2 values : "+box2.length +" " +box2.width +" "+box2.height);
//        System.out.println("box 3 values : "+box3.length +" " +box3.width +" "+box3.height);
ChildConstructor box4 = new ChildConstructor();
        System.out.println(box4.weight);
        ChildConstructor box5 = new ChildConstructor(2 , 3, 4 ,-1);
//        System.out.println();
//        System.out.println(box4.width);
//        System.out.println(box4.length);
        System.out.println(box5.length + "" +box5.weight + " "+box5.height + " "+box5.width);

        System.out.println(box3.length);
    }

}
class BaseClass {
    int length ;
    int width ;
    int height ;

    // instance variables are created now i am going to use the constructor
    public BaseClass(){ // constructor with no parameters in it
        this.length = -1 ;
        this.width = -1 ;
    this.height = -1 ;
    }
   public BaseClass(int value){ // constructor with parameters
        this.length = value ;
        this.width = value ;
        this.height = value ;
    }
   public BaseClass(int length , int width , int height){
        this.length = length ;
        this.width = width ;
        this.height = height ;
    }

    // one type of constructor is remaining:
    // copy constructor
}
