
// StackGenApp.java
// Application using Stack1Gen or Stack2Gen implementation of the StackGen Interface
// Since both Stack1Gen and Stack2Gen implement the same interface, it makes no
// difference which implementation is used.
// Making a simple change to the variable declaration for the stack will allow
// changing between the StackGen implementations.

public class StackGenApp {

    public static void main(String[] args) {

        Stack1Gen <Object> s = new Stack1Gen <Object> ();  // linked list stack implementation
//        Stack2Gen <Object> s =  new Stack2Gen <Object> ();  // array stack implementation
    
        System.out.println();
        if (s.isEmpty())
          System.out.println("The stack is empty");
        else System.out.println("The stack is not empty");

//        s.pop();  // should produce an Exception

        System.out.println("Top to start is: " + s.top());  // should be null

        s.push(new String("hello"));
        s.push(new Double(7.1));
        s.push(new String("abc"));

        System.out.println("Pop: " + s.pop().toString() + ";  New top: " +
            s.top().toString());
        System.out.println("Pop: " + s.pop().toString() + ";  New top: " +
            s.top().toString());
        System.out.println("Pop: " + s.pop().toString() + ";  New top: " +
            s.top());

        System.out.println("New top: " + s.top());
        System.out.println();
 
    }  // main method

}  // StackGenApp class
