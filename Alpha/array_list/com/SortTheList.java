// using the comparator here to sort the list in the descending order
package array_list.com;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collection; this is different from collections
//RESEARCH ON THIS LATER
public class SortTheList {
    public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
//    list.add(1);
//    list.add(2);
//    list.add(3);
//    list.add(4);
//    list.add(5);
        // either run  a loop or add elements manually to the arraylist.
    for (int i =1; i<=5;i++){
        list.add(i);
    }
        System.out.println(" ");
        System.out.println("original list : " +list);
        //sorting the list.
        System.out.println("list sorted in ascending order : ");
        Collections.sort(list); // this will sort the list in ascending order.
        System.out.println(list);
        //to arrange the list in descending order, we have to use
        System.out.println("list sorted in descending  order ");

        // list.sort(Collections.reverseOrder());//both these lines are same
        Collections.sort(list,Collections.reverseOrder());// in descending order
        // via comparator
        System.out.println(list);
    }

}
