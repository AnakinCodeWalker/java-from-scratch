package Oop;
// when ever a new object is being created it goes inside constructor
// this is replaced with reference variable internally

// you can note have two classes of same name in the package
public class Constructors {
    public static void main(String[] args) {
        // if you have 100 fields in your class will you do it like this
        // each time ?
        // reference_variable.field = value ;
// write the same code as you used to do in  methods .

        // when you call  constructor with different parameters it will look for it and call it accordingly
        Human student  = new Human("kunal kushwaha" ,34 , 97.6f); // passing the value like we do in methods , constructor is also a method.
        Human student2 = new Human() ; // constructor overloading.
        Human student3 = new Human("Aanish" , 56);
        // printing the value of the objects we have created.
        System.out.println(student.marks);
        System.out.println(student.name);
        System.out.print(student.roll);
        System.out.println("\n");
        System.out.println(student2.marks+" "+student2.name+" "+student2.roll);

        System.out.println(" "+student3.name+" "+student3.roll+" "+student3.marks);
        // one thing i like you to notice over here i am not passing the value of marks so it is going to be like
        // do we have the marks over here no its not  so ok let's just print the default one that is going to be 0.0

    }
}
class Human {
    String name;
    int roll;
    float marks;

    Human(String name , int roll , float marks) { //this.name will be replaced with the value you are passing to.
        // same thing as methods .
        this.name = name; // previously we were doing it like this reference variable . field = value now
        //  reference variable is replaced with this keyword nothing new over here
        this.roll = roll;
        // internally it automatically replaces it  reference variable with this keyword
        this.marks = marks;

    }
    Human(String name ,int roll){
        // in case of the same variable name you have to use ths keyword here
        this.name = name ; // if you dont put this over here compiler will get confused like hey which variable are you talking about.
        // here you have mentioned this so this,roll is replaced with Student3.roll = the roll u're passing
        this.roll = roll;
    }
    Human(){ // non parameterized constructor
      this.name = "ravi " ; // here we have no parameters in it so when we call a constructor with no parameter it is going to call this one.
        this.roll = 57;
        this.marks = 87.9f ;
    }

    }