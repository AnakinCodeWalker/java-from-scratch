package lets_digest ;
import java.util.ArrayList;

public class ArraylistInJava {

    public static void main(String[]args){
// list interface is a part of java.util package
//  extends collection framework
//  and list  extends collection so it contains all the methods of collection
//  and if something implement list then it should implement all the methods of  list. (like arraylist . linkedlist , stack , queue)
    

// when to use :- 
// 1. when you want to store an ordered collection of elements(objects).
// 2. when you want to store duplicate elements.

// 3. index based access like an array.


// when not to use :-  
// 1. when you want to store un-ordered collection of elements(objects).

// 2. when you want to store unique elements.

// now the code starts here
 
// normal array 
/*int[] arr = new int[5] ;
Arrays.fill(arr  , 10);

for(int i : arr){
System.out.println(i);
}

*/
// ArrayList.
/* 

// creating an arraylist
ArrayList<Integer> list  = new ArrayList<>();

//  here the size of the array list is  0  becuase we have not added any element to it.
// but the intial capactity of the array list is 10.


// List is parent class of arraylist
// so   we can write it like this : List<Integer> list = new ArrayList<Integer>();


// integer is the generic here.
// we use the generic to make it type safe.
// methods in list.

//  add
list.add(2); // add method add the element at the end of the list.
list.add(3);
list.add(4);
list.add(78);
list.add(34);

System.out.println("original list : "+list);
/* 
//  to  get element from a particular index like we used to do in array 

// .get(index) method
// we can use :
// .get(index) ; // get method returns the element at the given index.
System.out.println("element at index 2 : "+list.get(2));

// .size() method
//  to get the size of the list 
//  we can use the .size() method

System.out.println("size of the list : "+list.size());
//returns the size of the list


// prints the element of the list : while doing some formatting internally its calling the
// .toString() method
 System.out.println("element in the list : "+list);


System.out.println("element in the list (using for each loop): ");
 for(int i : list){  // printing the list using for each loop
     System.out.println(i);

 }

 //  list.contains() method
//  list.contains() method returns true if the element is present in the list
// it takes the element as an argument.

System.out.println("contains 4 : "+list.contains(4));
// will return true if element is persent in the list else false.

 */

// list.remove() method
// list.remove() method removes the element from the list.
// it takes the index as an argument.

/* 
System.out.println("element removed : "+list.remove(2));//removes the element at index 2.
System.out.println("list after removing : "+list);
//list.add(index , element) method :
// it takes two arguments index and element.
// it will add the element at the given index.
//  and  all the elements after it will be shifted to the right.
list.add(2 ,100);
System.out.println("list after adding element :  "+list) ;
// list.set() method
// to replace element at specific index.
list.set(1, 50) ;// here the set method takes two arguments index and element
// it will replace the element at the given index with the given element.
System.out.println("list after replacing the element : "+list);
*/

ArrayList<Integer> list  = new ArrayList<>();
// we know that when the arraylist is  is about to full then it increases its capacity by 50%.
// initial capacity of the arraylist is 10.
//  when no capacity is specified then the default capacity is 10.
// 
System.out.println(list.size());

//capacity of an ArrayList increases automatically 
// when needed — but not with every add operation. It only grows when
//  the current capacity is full.

//  so the intial capacity of the arraylisy is 0
// Even though it looks like it might be 10, it's actually
//  initialized with an empty array (elementData = {}),
//  meaning capacity is 0 until you add something.

//  when you intialize it first time then it intiializes with default capacity is 10
//The first time you add an element, it initializes
//  to a default capacity of 10.

// When you add the 11th element → boom! it resizes
//  it resizes the capacity with 1.5x of its current capacity

// It’s efficient most of the time, but if you know you’ll store
// lots of elements, you can avoid resizing by setting initial capacity:

// You can also manually set capacity like:
// new ArrayList<>(20);
// now it will have capacity of 20
// and only resizes when it reaches its full capacity.
// ArrayList<String> list = new ArrayList<>(100); // avoids resizing







// to find the data type of the variable in objects you can do it like this :

System.out.println(list.getClass().getName());
// output : java.util.ArrayList
// for primitive you can not directly call the method .getClass().getName()
// but you can do it like this :


int x = 6 ;
System.out.println(((Integer)(x)).getClass().getName());
// you have to wrap up the primitive with its object int -> Integer.


}

}