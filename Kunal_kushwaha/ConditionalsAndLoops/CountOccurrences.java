package ConditionalsAndLoops;
// so basically you have to  count occurrence of a digit
// you can do it many ways :
//1. you can either convert the number into a String and iterate over it
//using the charAt(i) method . here is is the index.
// this approach takes O(n) space and time converting number in String and comparing
//2. you can perform it via modulo or division
// this takes only O(n) time and constant space.
public class CountOccurrences {
    public static void main(String[] args) {
/*
//        1. charAt(i) method :
        int num = 1385757979;
// first convert the number to  a String
        String val = (num + ""); // number converted to string
        System.out.println(val);
        // now iterate and count the occurrence
        int i = 0;
        int count = 0;
        char target =  '7' ;
        while (i < val.length()) {
            if ( val.charAt(i) == target) {
                count += 1;
            }
            i += 1;
        }
        System.out.println("occurrence of "+target+" is "+count);
    }
}
//1. use == when you want to compare the value of primitives since here you
//are comparing the character  with the target which is primitive type so it
// will work like a comparator

//2. when you are comparing objects like String  and wanna see if they point to same reference or not
//3. use the .equals method when you want to compare two strings entirely
// it does not work like you are comparing part of a string take 1 argument only
/*
Use == for comparing primitive types (int, char, etc.) because it compares the actual values.

Use .equals() for comparing objects (like String) because it compares the content/values inside the objects.

Use == on String only if you're comparing references (e.g., checking if two strings point to the same object in memory)
* */

        // now using the Second method
        // key point : when you do modulo with 10 it returns the last digit
//        : when you divide a number by 10 it deletes the last number
        int num = 1385757979 ;
        int target = 7 ;
        int count = 0 ;
        while(num > 0){ // running a while loop until number becomes less than 0
             int compare  = num % 10 ; // storing the last digit of number
        if(compare == target){ // comparing last digit with number
            count+=1 ;// increasing the count if the occurrence is found
        }
        num = num /10 ;// repeatedly removing the last digit of the number
        }
//        System.out.println("number is "+num);
        System.out.println("count of "+target +" is : "+count);
        // printing the count of the number.

    }
}
