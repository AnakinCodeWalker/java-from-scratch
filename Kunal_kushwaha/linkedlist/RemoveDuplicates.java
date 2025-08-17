package linkedlist;
import java.util.LinkedList;
public class RemoveDuplicates {
    public static void main(String[] args) {
        LL node = new LL();
        //adding elements to the list
        node.addFirst(1);
        node.addFirst(2);
        node.addFirst(3);
        node.addFirst(3);
        node.addFirst(3);
        node.addFirst(4);
        node.display();
        node.removeDuplicates(); //this method will internally remove the duplicate from the list and then call the
        //display method to print the new list.


    }
}
