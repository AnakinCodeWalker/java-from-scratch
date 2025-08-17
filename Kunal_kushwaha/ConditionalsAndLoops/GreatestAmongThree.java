package ConditionalsAndLoops;
// assume that the greatest among three is the first number so
// after this we can check for the greatest and print it.
public class GreatestAmongThree {
    public static void main(String[]args){
        int a =50 ;
        int b = 100 , c =90 ;
        System.out.println("greatest among "+a+ " " +b+ "and "+c+"is : ");

//        1.. calling the Math.max(takes two args and return which is bigger one.)
                            //     this will take two args and find greatest among them
/*
        int greatest = Math.max(c, Math.max(a , b));
 // it takes two args one is new number(c) and other is greatest b/w previous two.
        System.out.println(greatest);

         */


//        2.
        //int max = a ;
//       if(b > max){
//           max = b ;
//
//        }  if (c > max) {
//          max = c ;
//
//       }
//        System.out.println(max);

        /*

        //3.

        if(a>= b && a >= c){
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }

         */
    }

}
