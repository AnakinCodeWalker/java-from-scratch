
//        System.out.println(Arrays.toString(newName));
// this will create a string a join each character separated by comma

public  class ReverseOfaString {
    public static void  main(String[]args){
        String name = "Akbar" ;
        // note we can not directly perform any operation on
        // string because it is Immutable
        // we need to convert the String into a char arr and perform
        // operation on it.
        // then reconvert it into original String.

        System.out.println("The original string before reversal :"+name);
       char [] reverse = name.toCharArray();
       char temp ;
       int j = reverse.length-1 ; // using length not length() because
                             // reverse is char[] arr not string.
        for(int i   = 0 ;  i < j ; i++){ // loop will terminate when the
            // value of j become greater than i
            temp  = reverse[i];  // logic to swap.
            reverse[i] = reverse[j];
            reverse[j] = temp ;
            j-- ; // using the second pointer
        }
        System.out.println("String after reversal : "+  new String(reverse));
// using the new String() to convert the char[] reverse into String.

    }
}