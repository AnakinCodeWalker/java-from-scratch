///*
//❌ Why if (num == 0 || 2) is invalid:
//num == 0 → ✅ boolean
//
//2 → ❌ just an integer (not a condition)
//
//|| expects: boolean || boolean — but gets boolean || int → compile-time error
//
//🔑 Rule to Remember:
//❗ In Java, you cannot use plain values like 2 or "hello" in a condition unless you're explicitly comparing them or evaluating them in a way that results in a boolean.
//Ask Yourself: "Does it return true or false?"
//If the operator returns anything other than boolean, you can't use it directly in a conditional.
//
//✅ You can use only these in conditional :
//
//Comparison operators: ==, !=, <, >, <=, >=
//
//Logical operators: &&, ||, !
// */
//public class PrimeOrNot {
//    public static void main(String[] args) {
//        System.out.println(primeOrNot(37));
//    }
//
//    public static int  primeOrNot(int num) {
//        if(num == 0 ||num==2) {
//            return num;
//        }
//        int i = 2  ;
//        for( ; i < num ; i+=1 ){
//
//            if(i%num==0){
//                return false ;
//            }
//    }
//    return true ;
//    }
//
//}
