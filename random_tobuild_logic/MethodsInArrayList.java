import java.util.ArrayList ;

import java.util.Collections ; // because I am using collections.sort(list) method
// you can read moreon arraylist on vs code lets digest file or in intellij also
// kuch method baki jaise conversion from array to list and vice versa
/*
add(i , e)
add(e)
addFirst(e)
addLast(e)

get(i)
set(i , e)

clear()

collections.sort(list)

remove(i)

indexOf(e)

isEmpty() //return true or false
 contains(e) //return true or false
 */
public class MethodsInArrayList {
    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>() ;
        System.out.println(list.isEmpty()) ;// returns if a list is empty or not
    list.add(4); //add element to the end of the list and move all the element towards left .
    list.add(9);
    list.remove(1); // takes index of element to remove
        System.out.println(list.set(0 , 99 )); // it replaces the element of the specific index with provided index
        System.out.println("An element is replace via set method"+list);

        for (int element : list) {
            System.out.println(element);
//            System.out.println(list.get(element)); // this line will give  error because get take index as an argument
            // and element is the element itself not the index
        }
            System.out.println("99  Present : " + list.contains(99)); // return true if an element is present
            list.addFirst(0);
            list.add(99);
            list.add(73);
            System.out.println("element is added at first : " + list);
            list.addLast(99);
        System.out.println("element is added at last : " + list);

        Collections.sort(list); // using sort method of the collections to sort the list
        System.out.println("list is sorted using collections.sort(object) "+list);
            System.out.println("element is added at last : " + list);
            System.out.println("first occurrence of 99 : "+list.indexOf(99));
            //  this method returns index of first occurrence if element is present and -1 if not present }
        System.out.println("element removed from the list is : "+list.remove(4)); // remove the element at that index and return it
       list.clear();//removes all the element from the list  , the list will become empty  when the method returns



        }
        }



