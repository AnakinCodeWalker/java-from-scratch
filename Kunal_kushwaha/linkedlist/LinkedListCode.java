package linkedlist;
// CODE IS REMAINING FOR OTHER TYPE OF LINKED LIST
// while creating the object why you created the object of this class and not the other one
public class LinkedListCode { // why made this class as public
    private Node head; //why made them in other separate class and not in the single class
    private Node tail;
    int size ;

   public LinkedListCode() {
        this.size = 0;
    }
public   void insertAtFirst(int value){  // here i have created a method which take a value as an args
       Node node = new Node(value); // here i have created a new node and pass the value of the method
node.data = value ; //data will be the value you are passing
node.next = head;// interchanging the positions so head can be at the first place
head = node ;
}
// and why keep this inside the private class

     private class Node { // why made another class as private
       // can not it just be done in a single class ?
        private int data;
        private Node next;

        // two constructor one for only when  data is provided
       public Node(int data) { //why made the constructor as public ?
            this.data = data;
        }

        //when both data and next is provided as well
      public   Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}

