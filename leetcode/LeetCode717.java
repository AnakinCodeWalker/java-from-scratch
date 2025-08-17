// https://leetcode.com/problems/1-bit-and-2-bit-characters/submissions/1605376845
// WRONG HAI LEETCODE PR submit krke dekhe thai..


public class LeetCode717 {
    public static void main(String[] args) {
/*
* We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character
 must be a one-bit character.



Example 1:

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:

Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.
* */

        int[] nums ={0};
      boolean value =  LeetCode717.isOneBitCharacter(nums);
        System.out.println(value);
    }
    public static boolean isOneBitCharacter(int[] bits) {

        if(bits.length == 1){
            // if only one element is present and that element is  0 return true.
            if (bits[bits.length -1]==0)    return true ;
            //bits[bits.length-1] =bits[1-1] =bits[0]--> 0
        }
for( int i : bits){
    if(bits[bits.length-1]==bits[bits.length-2]){
        return true ;
    }
}
return false ;    }
}
