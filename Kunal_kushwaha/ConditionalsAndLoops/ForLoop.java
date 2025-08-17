package ConditionalsAndLoops;
import  java.util.ArrayList ;
public class ForLoop {
    /*
for(initialization ; condition ; increment or decrement){
    body of the loop.
    }
    */
    /*
    using arraylist
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);// creating an arraylist
        int i =1 ;
        for (; i <= 5;) {  // flow is have the check go to body increment.
          //  System.out.println(i);
        list.add(i); // add method to add the element in list at the end
        i+=1 ;
        }
        System.out.println(list);

    }
}*/
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i +  " ");
        }
    }
}