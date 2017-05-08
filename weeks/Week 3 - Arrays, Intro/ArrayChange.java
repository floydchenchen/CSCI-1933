// ArrayChange.java
// Passing an object (array) and scaler to a method and making
// changes within the method

// To confirm that you are understanding Java's parameter passing,
// contrast the passing of an array to a method with the passing of 
// a scalar to a method (the original value of a scalar that is 
// passed cannot be modified by the method, but arrays passed can 
// be modified by the method).
// Note that scalers as well as objects may be modified within methods,
// buy only modifications made to objects will apply to the original
// values in the calling method.

// Note the use of the "length" instance variable for arrays

public class ArrayChange {

    public static void main(String[] args) {

    int a[] = {1, 2, 3, 4, 5};
    int n = 0;

    System.out.println();
    System.out.println("Value of n to start is: " + n);
    System.out.println("Array values to start...");
    
    for (int i = 0; i < a.length; i++)
        System.out.println("  index: " + i + "     value is: " + a[i]);

    increment(a, n);  // increment each value in the array

    System.out.println();
    System.out.println("Value of n after increment is: " + n);
    System.out.println("Array values after increment...");

    for (int i = 0; i < a.length; i++) 
        System.out.println("  index: " + i + "     value is: " + a[i]);

    }  // main method

    public static void increment(int[] x, int value) {

    value++;
    for (int i = 0; i < x.length; i++)
        x[i]++;

    }  // increment method
       
}  // ArrayChange

