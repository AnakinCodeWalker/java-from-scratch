// Type conversion can be of two type 

// for the type conversion ot happen there are two neccessary conditons:-
// 1. both of the types should be compatible with each other
// 2. the destination type must be greater than the source type.


// 1. implicit conversion :- widening conversion
//  this  is called correcion.
// this is done implicitly by the jvm 
// there is no risk of data loss in this type of conversion.

/*
public class TypeConversion {

    public static void main(String[]args){
        System.out.println("Type Conversion in java ");
int num = 5 ;  //(Source type) // here the source type is smaller than the destination type so the jvm will perform an implicit conversion.

float x = num ; //(Destination type) 
System.out.println(x);
    }
}
    */


//  2.Narrowing conversion (type conversion) :- 
// this is done by the programmers 
// explicitly conversion done by the programers 
// risk of the data loss in this type of conversions.

public class TypeConversion {

    public static void main (String[]args){
float Value = 45.6f ;   //  it can lead to data loss during narrowing conversion, e.g., converting 45.6f to int results in truncation of the decimal part.
        int num = (int)(Value); // explicitly conversion of float data into integer type.(data loss is possible here.)
 System.out.println(num);     // possible risk of data loss in this type ofconversions.
 //
    }
}