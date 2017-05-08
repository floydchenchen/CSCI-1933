package interfaces;

// IntClass.java
// This class implements the Int1 and Int2 interfaces

// While Java allows implementation of more than one interface, only one class
// may be extended.  
// Since interfaces are limited to only abstract methods and static constants,
// there is no ambiguity to resolve with multiple interface implementation

// All implementations of methods from interfaces must be public and have 
// the same signature

public class IntClass implements Int1, Int2 {

    public void printTwice(String s) {
        System.out.println(s + s);
        System.out.println("Value of MAX: " + Int1.MAX + 
                           "; Value of MAX: " + Int2.MAX);
    }

    public void printWord(int n) {
        switch(n) {
            case 0: System.out.println("zero");
                    break;
            case 1: System.out.println("one");
                    break;
            case 2: System.out.println("two");
                    break;
            case 3: System.out.println("three");
                    break;
            case 4: System.out.println("four");
                    break;
            case 5: System.out.println("five");
                    break;
            default: System.out.println("number not in range 0 - 5 inclusive");
        }
    }

    public void printValue(String s) {
        if (s.toLowerCase().compareTo("zero") == 0)
          System.out.println(0);
        else if (s.toLowerCase().compareTo("one") == 0)
          System.out.println(1);
        else if (s.toLowerCase().compareTo("two") == 0)
          System.out.println(2);
        else if (s.toLowerCase().compareTo("three") == 0)
          System.out.println(3);
        else if (s.toLowerCase().compareTo("four") == 0)
          System.out.println(4);
        else if (s.toLowerCase().compareTo("five") == 0)
          System.out.println(5);
        else System.out.println("String value not in range 0 - 5 inclusive"); 
    }

}  // IntClass class
