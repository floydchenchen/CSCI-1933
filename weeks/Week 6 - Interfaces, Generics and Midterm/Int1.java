package interfaces;

// Int1.java
// First interface of two to be implemented by IntClass.java
// See also IntApp.java

public interface Int1 {

    // ALL interface variables are final and static, so we do not specify
    int MAX = 10;

    // ALL interface methods are public, so we do not specify

    // abstract method 1
    void printWord(int number);

    // abstract method 2
    void printTwice(String s);

}


