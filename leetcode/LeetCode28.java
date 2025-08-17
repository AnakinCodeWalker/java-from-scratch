// NOT WORKING CORRECTLY
/*
public class LeetCode28{
public static void main(String[] args) {
String  haystack = "butsad" ;
String needle = "sad" ;
LeetCode28 object = new LeetCode28() ;
    System.out.println(object .strStr(haystack, needle) );

//    Output: 0
}
    public int strStr(String haystack, String needle) {
int index = -1 ; // initially taking index as -1
if(haystack.length() < needle.length()){ // if length is smaller return -1
    return  index ;
}else {
    int j = 0 ; // initialize j    = 0 , for checking the elements  of the needle String with other string
    for (int i = 0; i < haystack.length(); i++) { // loop will iterate until
        // the last index  of the string.

        if (haystack.charAt(i) == needle.charAt(j)) { // if both characters matches
            // then increase the j which is pointing to the needle String
j++ ;
        } else { // if character does not match up  we  will start again for the
            // needle String.
            j = 0 ;
        }
    if (j >  needle.length()-1){ // if j goes out of bound we come out of the loop
        break;
    }
    }
    if (j == 0 ){ // if j is j means no element matches then we will return -1
        return index ;
    }else if(j == 0) {
        index = i;        //  else we put the index value as neddle.length - j

    }
}
return  index ;
    }
}

 */