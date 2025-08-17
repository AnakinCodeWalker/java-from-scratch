package Oop;
// . operators binds the instance variable with the reference variable
public class ClassesAndObject {
    public static void main(String[] args) {
        Student kunal = new Student(); // gonna create an object
        System.out.println(""+kunal.name); // it will give null because the
        // bydefault value of object before initializing them is null.
        kunal.name = "kunal kushwaha"; // initializing the field of the object we have created
        kunal.rollno = 34;// accessing the field and initializing to some value
        kunal.marks = 97.6f;
        // but it try to access some value that is not present in the class it is going to give you an error
//        kunal.salary = 45_0000 ; // error
        
        
        System.out.println(" "+kunal.name+ "\n "+kunal.marks+"\n "+kunal.rollno);
      
        System.out.println(kunal); // will print some address and random value
    }
}
     class  Student { // either you need to make it static or move outside the main class.
        String name ;
        int rollno ;
        float marks ;
    }
    // if something is not initialized and you try to access them if they are present in the object they are going
// to print the by default value of it

