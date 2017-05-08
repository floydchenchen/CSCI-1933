// Ragged.java
// Viewing a multidimensional array as an "array of arrays"
// "Ragged" 2-dimensional array example

// "rows" of 2-dimensional arrays need not be all the same length
// even though the base type (here int) must be the same for all
// the lowest level elements.

// Here, each element of the first dimension is an array of ints,
// but since the size of each row is not specified at declaration,
// the size of each row can be determined separately.

// each row of the array a will have its own length attribute


public class Ragged {

public static void main (String[] args) {
    int a[][]= new int[5][];  // second dimension left blank
    System.out.println();
    for (int i = 0; i < a.length; i++) {
        a[i] = new int[(int)Math.floor(10 * Math.random() + 1)];
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = (int) Math.floor(100 * Math.random() + 1);
            System.out.println("add [" + i + "][" + j + "] : " + a[i][j]);
        }
        System.out.println();
    }

    System.out.println("Sum of elements in array is " + sum_2d(a));
    System.out.println("The top dimension length is: " + a.length);
    for (int row = 0; row < a.length; row++)
        System.out.println("The length of row " + row + " is " + a[row].length);
    System.out.println();

}  // main method

public static int sum_2d(int [][] x) {
    int sum = 0;
    for (int row= 0; row < x.length; row++)
        for (int col = 0; col < x[row].length; col++)
            sum += x[row][col];
    return sum;
}  // sum_2d method

}  // Ragged class
