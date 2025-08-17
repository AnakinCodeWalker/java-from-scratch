package linkedlist ;



public class LL {
    // now do the head and tail part.
    private Node head; //creating them public gives an error why ?
    private Node tail;
    private int size; //to keep track length of the LinkedList,

    //setting the value via constructor.
    LL() {
        this.size = 0; // initially the count value is 0
    }


    private class Node {
        // created two variables for the linked list
        private int value;
        private Node next;

        //now I need to initialize them.
        //via constructor
        public Node(int value) { // here it will contain the passed value when you create the object and pass it
            this.value = value;//this.value will be replaced with the value you are passing
        }

        public Node(int value, Node next) { // if you passed the next as well as the value of the linked list.
            this.value = value;
            this.next = next;
        }
    }

    //upto this part we are done for the node creation now when we call the object of this class an object will be created
// now we do the insertion at first of the linked list.
    public void addFirst(int value) {
        Node node = new Node(value);      // here it will create an object / node for the linked list each time it will
        // be called
        //it is taking a value from the method and this value passed to the constructor of the Node class.
        //this.value  = value (value you are passing from here.)

        // now creation part is done now i have to link node with the head.
//            2. linking hem together
        node.next = head;
        head = node;
        //3. if tail==null it means it is the first node that has been add to list
        if (tail == null) {
            tail = head; // in that case both tail and head will point to the same object.
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //remove duplicates method to remove the duplicates from the list.
    public void removeDuplicates() {
 Node temp = head ;
        while (temp != null&&temp.next!=null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp= temp.next;
            }
        }
            display(); //calling the display method in the end
    }
}
