package ConditionalsAndLoops;

public class IfElse {
    /*
 if(boolean expression which return true or false){
     if true execute this
}
else{
 do this
}

     */
    // code
    public static void main(String[] args) {
        float age = 17.99f ;
        if(age >= 18){
            System.out.println("meow");
        }else{
            System.out.println("cat is sad ! ");
            age+=1 ;
        }
        System.out.println(age); //18.99
    }

}
