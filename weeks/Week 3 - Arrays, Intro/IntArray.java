// IntArray.java
// Useful methods for one-dimensional integer arrays
// Showing basic array declaration, access, updating

// All these methods are static.  Two of these methods, equal()
// and clone(), are methods that could get inherited from Object.  How
// do you think the versions of these methods given here differ from
// the inherited ones?  In other words, would the programmer be just as
// well off with the inherited equal() and clone() when working with
// integer arrays, or would the versions presented here be superior?
// Note: the inherited versions are non-static, but these versions
// here are static.  Why?


public class IntArray {

    // make and return an identical but separate copy of an integer array
    public static int[] clone(int[] original) {
        int copy[] = new int[original.length];
        for (int i = 0; i < copy.length; i++)
            copy[i] = original[i];
        return copy;
    }
    //两个integer array必须有一样的长度

    // copy contents of first integer array to second integer array
    public static void copy(int[] first, int[] second) {
        int len = Math.min(first.length, second.length);
        for (int i = 0; i < len; i++)
            second[i] = first[i];
    }

    // determine if two integer arrays are identical
    public static boolean equal(int[] one, int[] two) {
        boolean ident = true;
        if (one.length == two.length)
          for (int i = 0; i < one.length; i++) {
              if (one[i] != two[i])
                ident = false;
          }
        else ident = false;
        return ident;
    }

    //test program
    public static void main(String[] args) {

    int a[] = {1, 2, 3, 4, 5};
    int b[] = a;  // points to above array to begin
    int c[] = {1, 3, 5, 7, 9, 11, 13, 15};

    a[1] = 1000;

    System.out.println();
    System.out.println("Arrays to start--a, b, c,");
    ArrayPrint.arrayPrint(a);
    System.out.println();
    ArrayPrint.arrayPrint(b);
    System.out.println();
    ArrayPrint.arrayPrint(c);
    System.out.println();

    System.out.println("a equal a: " + equal(a, a));
    System.out.println("a equal b: " + equal(a, b));
    System.out.println("a equal c: " + equal(a, c));
    System.out.println();

    System.out.println("Arrays after copy(a, c)--a, b, c,");
    copy(a, c);
    ArrayPrint.arrayPrint(a);
    System.out.println();
    ArrayPrint.arrayPrint(b);
    System.out.println();
    ArrayPrint.arrayPrint(c);
    System.out.println();

    System.out.println("Arrays after b = clone(c)--a, b, c,");
    b = clone(c);  // be now gets new space
    ArrayPrint.arrayPrint(a);
    System.out.println();
    ArrayPrint.arrayPrint(b);
    System.out.println();
    ArrayPrint.arrayPrint(c);
    System.out.println();

    System.out.println("a equal a: " + equal(a, a));
    System.out.println("a equal b: " + equal(a, b));
    System.out.println("a equal c: " + equal(a, c));

    }  // main method

}  // IntArray class
