package array_list.com;
import java.util.ArrayList;
public class Swap2Numbers {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        swap(list,0 ,3);

    }
public static void swap(ArrayList<Integer>list,int firstIndex,int secondIndex){
int temp = list.get(firstIndex);
list.set(firstIndex,list.get(secondIndex));
list.set(secondIndex,temp);//you don't have to use .get because .get is used to find the value at a specific index
// but temp value stores value at a specific index.
    System.out.println(list);
}
}
