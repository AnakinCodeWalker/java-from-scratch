// binary search question 3




// given a character array letters that is sorted in non descending order
//    and a character target return the smallest character in the array that is larger than target.

//letters = [c, f, j]  target = a , output = c
// target = c output = f
                          // target = z output  = a // letters wrap around.


// CODE KA MATHS JO BTAYA HAI USSEY LIKHNA HAI
public class Solution {

    public static void main(String[]args){
        Solution object = new Solution() ;
        System.out.println(object.getTarget()) ;
    }
    public char getTarget() {
        char[] letters = {'c', 'e','f', 'j'};
        int start = 0;
        int end = letters.length - 1;
        char target = 'g';
        if (target >= letters[end]) {  // z >= j return
            return letters[start];  // c letters[start]
        } else {
            while (start <= end) {   //
                int mid = start + (end - start) / 2;

                if (target < letters[mid]) { // f <= z
                    end = mid - 1;          //
                } else {
                    start = mid + 1;
                }
            }

            return letters[start];


        }
    }
}
