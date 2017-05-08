
// BSearch2.java
// Recursive Binary Search method with complexity counter

public class BSearch2 {

    static int count;  // complexity counting only
 
    // search returns the index where the target is found or -1 if not found
    // 'a' is array to be searched (already sorted into increasing order
    // 'first' is the index of the first element present in the array
    // 'last' is the index of the last element present in the array
    // 'target' is the integer we hope to find

    public static int search(int[] a, int first, int last, int target) {
        count++;  // complexity counting only
        int middle;
        if (first > last)
          return -1;  // not found
        else {
          middle = (first + last) / 2;
          if (target == a[middle])
            return middle;  // found
          else if (target < a[middle]) 
                 return search(a, first, middle - 1, target););// it is important to be middle-1, cuz a[middle] is already checked
               else return search(a, middle + 1, last, target);// it is important to be middle+1, cuz a[middle] is already checked
        }
    }  // search method

    public static void main(String[] args) {
        int r = (int) Math.round(10000 * Math.random());
        int[] a = new int[r];
        System.out.println();
        System.out.println("Size of array is: " + r);

        int base = -200;
        a[0] = (int) (10 * Math.random());
        for (int i = 1; i < r; i++) 
            a[i] = a[i - 1] + (int) (10 * Math.random()) ;
        int lookup = (int) Math.round(15000 * Math.random());

        System.out.println(lookup + " found at: " + search(a, 0, r-1, lookup));
        System.out.println("Complexity is: " + count);
        System.out.println();
    }  // main method
}  // BSearch2 class 
