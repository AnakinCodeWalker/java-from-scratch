package stack.com;
import java.util.Stack;
public class StackUsingCollections {
    public static void main(String[] args) {
        Stack<Integer>list = new Stack<>();
        list.add(1);
        list.add(2);
        list.add(3);
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
        System.out.println(list.pop()); // in predefined it throws an exception if the stack is empty and you
        // try to pop an element from the stack
        System.out.println(list.isEmpty());

    }
}
