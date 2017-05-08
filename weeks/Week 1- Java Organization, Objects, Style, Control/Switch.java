// Switch.java
// Mutually exclusive cases implemented with a *switch* construct in Java

// How would this be done with *if* statements instead?
// Would the ifs be nested or non-nested, and would it make a difference?

// What happens if one or more of the "break" statements are removed?
// When would you want to remove a break, if ever?
// Why should a "default" case always be part of a switch?

public class Switch {

public static void main(String[] args) {
    int i;
    if (args.length != 0) {
        i = Integer.valueOf(args[0]); // get the integer value of the String args[0]
        switch (i) {  // i must be a scalar valued expression; char will also work
        case 0: System.out.println("Your number is 'zero'");
                break;  // the breaks are normally always needed
        case 1: System.out.println("Your number is 'one'");
                break;
        case 2: System.out.println("Your number is 'two'");
                break;
        case 3: System.out.println("Your number is 'three'");
                break;
        case 4: System.out.println("Your number is 'four'");
                break;
        case 5: System.out.println("Your number is 'five'");
                break;
        default: System.out.println("The number is ouside of the range 0 - 5");//一定要有一个default!
        }
    } // if
}  // main method
}  // Switch class
