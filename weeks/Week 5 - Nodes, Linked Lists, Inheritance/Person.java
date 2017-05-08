
// Person.java
// Simple class used to show inheritance

// This top-level class has no accessor methods and uses public attributes.
// Public attributes can be used and modified by external objects.
// A better implementation provides retricted access attribute variables
// and public accessor methods.  See Person2.java and inheriting classes. 

public class Person {
    
    public Person() {};

    public Person(String f, String l) {
        first = f;
        last = l;
    }
 
    public String first;
    public String last;
}
