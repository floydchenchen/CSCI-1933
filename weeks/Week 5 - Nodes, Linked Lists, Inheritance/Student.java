
// Student.java
// Simple Inheritance class
// Inherits the 'first' and 'last' public fields from Person.java

public class Student extends Person {

    public Student() {};

    public Student(int ident, String maj) {
        id = ident;
        major = maj;
    }

    private int id;  // available only in Student - no inheritance
    protected String major;  // available in Student and any Student subclass
}
