
// Scan.java
// Java IO example with Scanner class
// C's printf() used in this example instead of println()
// Scanner class used for "seamless" input without exception handling

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // create scanner instance
        int count = 0, n;
        String words;
 
        // printf on next line is like in C, can you re-write with println() ?
        System.out.printf("\nValue %d - Please enter an integer (^d to stop): ", ++count);
        while (s.hasNextInt())  {  // true if int more tokens in this Scanner instance 
            n = s.nextInt();  // only read when tokens present
            System.out.printf("You entered: %d\n\n", n);
            System.out.printf("Value number %d: - Please enter an integer: ", ++count);
        }
        System.out.printf("\nOK\n\n");  

        s = new Scanner(System.in);
        count = 0;
        System.out.printf("\nString %d - Please enter a string (^d to stop): ", ++count);
        while (s.hasNext())  {  // true if more string tokens in this Scanner instance 
            words = s.nextLine();  // only read when tokens present
            System.out.printf("You entered: %s\n\n", words);
            System.out.printf("Value number %d: - Please enter a string: ", ++count);
        }
        System.out.printf("\nOK\n\n");  
    }
}
