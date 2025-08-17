package hashmap.com;
import java.util.HashMap;
public class HashmapOperations {
    public static void main(String[]args){
        // creating a Hashmap.
        HashMap <String,Integer> map = new HashMap<>();
        //HashMap <key,value> reference variable = new HashMap<>();
        //1. put - used to insert a value in HashMap.
        // constant time operation(Amortized)
        // if key is existing then updates the value
        map.put("India",750);
        map.put("us",550);
        map.put("china",730);
        // printing the HashMap.
        System.out.println(map);//can print in any order, order is not fixed
        //2.to get an element of a specific key, we use the get method
        //again amortized constant time.
        //takes a key and return a value of that key if key is not present, then return null value.
  map.get("china"); // will return value of that key
  map.get("russia"); // will return null

//    3.containsKey() takes a key returns true or false based on the key is present or not.
        //again amortized constant time.
        System.out.println(map.containsKey("India")); // true
    // 4.similar to that, we have containsValue() :- checks if the value is there or not
        System.out.println(map.containsValue(500));//returns true or false
    //5.remove() :- takes key as input and check remove that key value pair
        //and returns the value
        // if you try to remove a non-existing value from the map it returns null then
        System.out.println(map.remove("India"));
        System.out.println(map.remove("India"));//should return null now
  //6.isEmpty():- check whether the hashmap is empty or not.
        System.out.println(map.isEmpty());
    //7.size():- to find the size of the HashMap.
        System.out.println(map.size());//return the size of the map.
        //8.clear() :- clears the hashmap. return nothing
        map.clear();
    }
}

