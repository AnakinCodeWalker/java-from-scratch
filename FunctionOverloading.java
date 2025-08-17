public class FunctionOverloading {
    // when two or more methods with the same name exists in our code 
    // but with variable parameters(arguments) this is called method overloading.
    // Method overloading is a feature in Java that allows a class to have more
    //  than one method with the same name, but with different parameter lists 
    //  (i.e., different types, numbers, or orders of parameters).
    //  It enables methods to perform similar but slightly varied tasks.

    // public class FunctionOverloading {
        // Method overloading allows multiple methods with the same name but different parameters.
        // This example demonstrates three versions of the "sum" method.
    
        public static void main(String[] args) {
            // Calling different overloaded methods
            sum();                 // Calls the version with no parameters
            sum(5);                // Calls the version with one parameter
            sum(6, 7);             // Calls the version with two parameters
        }
    
        // Version 1: No parameters
        static void sum() {
            int a = 5;
            int b = 5;
            int sum = a + b;
            System.out.println("compile time polymorphism");

            System.out.println("Sum (no parameters): " + sum);
        }
    
        // Version 2: One parameter
        static void sum(int a) {
            int b = 5;
            int sum = a + b;
            System.out.println("compile time polymorphism");

            System.out.println("Sum (one parameter): " + sum);
        }
    
        // Version 3: Two parameters
        static void sum(int a, int b) {
            int sum = a + b;
            System.out.println("compile time polymorphism");
            System.out.println("Sum (two parameters): " + sum);
        }
    }
 
    
    