package array_list.com;
import java.util.ArrayList;
public class Reverse_List {
    public static void main(String[]args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.addFirst(5);
        list.addLast(2);
        System.out.println(list.get(2)); //print the element at the index
        list.set(0,99); //to replace an element at a index ,move all the element toward right

        System.out.println("Original list : "+list);
        System.out.print("reverse list :");
        System.out.print("[ ");
        for (int i =list.size()-1;i>=0;i--)
            System.out.print(list.get(i)+" ");
        System.out.println("]");
        System.out.println(" ");
        for (Integer integer : list) //enhanced for loop.
            System.out.print(integer + " ");
        System.out.println(" ");
        list.removeFirst();
        list.remove(1);
        System.out.print("[ ");
        for(int i =0 ; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.print(" ]");
    }
}
