package interfaces;

// IntApp.java
// This application uses the IntClass class that implements the 
// Int1 and Int2 interfaces

public class IntApp {

    public static void main(String[] args) {

        IntClass o = new IntClass();  // using default constructor

        // Note that constants (static) from the interfaces are not 
        // instantiated in the IntClass, so we access the constants
        // directly from the interfaces where they are defined;
        // this is *unlike* static class variables which *can* be
        // referenced with the instance.var notation
        System.out.println("\nValue of MAX: " + Int1.MAX);
        System.out.println("Value of MAX: " + Int2.MAX + "\n");

        System.out.print("printWord(3): ");
        o.printWord(3);

        System.out.print("\nprintValue(\"four\"): ");
        o.printValue("four");

        System.out.print("\nprintTwice(\"Twice\"): ");
        o.printTwice("Twice");
        System.out.println();

    }  // main method

}  // IntApp class
