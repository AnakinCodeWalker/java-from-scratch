public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String oddStr = "pream";
        String evenStr = "banana";
        int value = middle(oddStr ,evenStr);
    }
public static int middle(String oddStr , String evenStr){
int value = -1 ;
//System.out.println(oddStr.length());
int midValue = oddStr.length()/2 ;
System.out.println("middle index : "+midValue+ " middle character : "+oddStr.charAt(midValue));
// code to find the index and the element is done
// now you have to initialize two pointer  to iterate at the string for checking longest substring

int pointer = oddStr.length()/2;
    System.out.println(oddStr.charAt(pointer));
//    System.out.println();
return pointer -1 ;
}
}