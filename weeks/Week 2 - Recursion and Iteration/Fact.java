// Fact.java
// Factorial class with both iterative and recursive factorial methods

// Note all methods are static so there is nothing to instantiate.
// This class in only used to group the various factorial implementations
// together; it is not intended as an example of object oriented design.

// Repetition algorithms can be recursive or iterative; they can be
// implemented with either recursive or iterative constructs, in any combination.
// This yields four combinations.  Three are given below.  Which is missing?

public class Fact {

    // recursive algorithm version 
    public static int rFactorial(int n) {
        if (n == 0)
          return 1;
        else return n * rFactorial(n - 1);
    }

    // iterative algorithm version with helper method
    public static int iFactorial(int n) {
        // start state
        // count = 0
        // partial = 1
        // invariant:  partial = count!

        return factIter(n, 0, 1);
    }

    // helper function for iFactorial above
    public static int factIter(int n, int count, int partial) {
        // invariant:  partial = count!
        if (count == n)
          return partial;
        else return factIter(n, count + 1, (count + 1) * partial);
    }

    // iterative agorithm version using Java iteration construct

    public static int iCFactorial(int n) {
        int count = 0, partial = 1;

        while (count < n) {  // invariant:  partial = count!
            count++;
            partial = partial * count;
        }
        return partial;
    }

    // main driver method to test the factorial methods above
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Recursive fact(0): " + rFactorial(0));
        System.out.println("Recursive fact(1): " + rFactorial(1));
        System.out.println("Recursive fact(2): " + rFactorial(2));
        System.out.println("Recursive fact(3): " + rFactorial(3));
        System.out.println();
        System.out.println("Iterative-rec fact(0): " + iFactorial(0));
        System.out.println("Iterative-rec fact(1): " + iFactorial(1));
        System.out.println("Iterative-rec fact(2): " + iFactorial(2));
        System.out.println("Iterative-rec fact(3): " + iFactorial(3));
        System.out.println();
        System.out.println("Iterative-construct fact(0): " + iCFactorial(0));
        System.out.println("Iterative-construct fact(1): " + iCFactorial(1));
        System.out.println("Iterative-construct fact(2): " + iCFactorial(2));
        System.out.println("Iterative-construct fact(3): " + iCFactorial(3));
        System.out.println();
    }
}  // Fact class
