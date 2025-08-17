package array_list.com;

import java.util.ArrayList;
//the internal arraylist size can vary.
//creating a multidimensional arraylist and iterating over them via various methods
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i); //table of 1
            list2.add(i * 2); // table of 2
            list3.add(i * 3); // table of 3
        }
        //adding the list into main list
        mainlist.add(list);
        mainlist.add(list2);
        mainlist.add(list3);
        list2.remove(2);
        list2.remove(3);
//1.
//        //using a simple for loop to iterate on the  main_arraylist and printing the arraylist elements.
//        for(int i=0 ; i<mainlist.size();i++)
//            System.out.println(mainlist.get(i)); // this will work fine because each index contains a list on its own

//        //2. using a nested loop
        for (int i = 0; i < mainlist.size(); i++) {//first iterating on the main_list
            ArrayList<Integer> currlist = mainlist.get(i); // at each index this will contain the current list of the  main arraylist
            System.out.print("[ ");
            for (Integer integer : currlist) // now this will print the current list of the main list.
                System.out.print(integer + " ");
            System.out.print("]");
            System.out.println(" ");
        }

//        // 3.this will also print the main-list elements because at each index of the main list there is an element present on it
//        for(ArrayList<Integer> i : mainlist)
//            // here the data type will ArrayList<Integer> because we are iterating on the data type of arraylist
//            System.out.println(i);

////4.printing the main list directly.
//System.out.println(mainlist);
    }
}
