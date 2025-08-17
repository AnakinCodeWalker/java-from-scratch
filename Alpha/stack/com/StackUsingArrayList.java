package stack.com;

import java.util.ArrayList;


public class StackUsingArrayList {
    static class Stack{
static  ArrayList<Integer>list = new ArrayList<>();
public static boolean isEmpty(){
    return list.isEmpty(); // inbuilt method of stack which returns if any element is present on the stack or not.
    //or return list.size==0 ;
}
public static void push(int value){
    list.add(value);//will add the given element into the last in last as by-default
}
public static  int peek(){
    return list.getLast();// will take the last element of the list
//    or
// return list.get(list.size()-1);
}
public static int pop(){
    if (!list.isEmpty()){
       return list.removeLast();//removeLast() removes the last element and returns it
//    or
//        return list.remove(list.size()-1);
    }
    return -1;
}
    }
    public static void main(String[] args) {
        Stack.push(1);
Stack.push(2);
Stack.push(3);
Stack.push(4);



//        System.out.println(Stack.pop());
//        System.out.println(Stack.peek());
        while(!Stack.isEmpty()){ // repeatedly peek and then pop elements from the stack until its empty.
            System.out.println(Stack.isEmpty());
            System.out.println(Stack.peek())  ;
            Stack.pop();
        }
        System.out.println("trying to pop after stack is empty : "+Stack.pop());
        System.out.println("is stack empty : "+Stack.isEmpty());
    }
}

//public class StackUsingArrayList {
//    static class Stack{
//        static ArrayList<Integer>list= new ArrayList<>();
//     public  boolean isEmpty(){
//         return  list.isEmpty();
//     }
//     public void push(int data){
//         list.add(data);
//     }
//     public int peek(){
//         return list.getLast();
//     }
//     public int pop(){
//         if(!list.isEmpty())
//           return list.removeLast();
//    return -1;
//     }

//    }
//    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        while(!s.isEmpty()){
//            System.out.println( s.peek());
//            System.out.println(s.isEmpty());
//            s.pop();
//        }
//        System.out.println("no elements left : "+s.isEmpty());
//        System.out.println("trying to remove an element : "+s.pop());
//    }
//}
