package linkedlist.com;

// linked-list
public class LinkedListImplementation {
    public static int head;
    public static int tail ;
     private class Node{
         int data ;
         Node next ;
         Node(int data){
             this.data=data;
             this.next=null;
         }
         Node(int data,Node next) {
             this.data = data;
             this.next = next;
         }
     }
    public static void main(String[] args) {
//LinkedListImplementation ll = new LinkedListImplementation();
    }
}