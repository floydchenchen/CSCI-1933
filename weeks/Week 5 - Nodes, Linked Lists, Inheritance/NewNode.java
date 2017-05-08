// NewNode.java
// Improved linked list Node example that uses a more general Object data field
// Other features remain the same, except that ordering is done by using
// the compareTo() method from String after using toString() to obtain a
// String representation of the data.
// A list of NewNodes is assumed to be headed

public class NewNode {

    public NewNode(Object initData, NewNode initLink) {
        data = initData;
        next = initLink;
    }

    // selectors and modifiers

    public void setData(Object newData) {
        data = newData;
    }

    public void setNext(NewNode newLink) {
        next = newLink;
    }

    public Object getData() {
        return data;
    }

    public NewNode getNext() {
        return next;
    }

    // methods

    public void display() {
        System.out.println(data.toString());
    }

    public void printFrom() {
        display();
        if (getNext() != null)
          getNext().printFrom();
    }

    public static void printList(NewNode begin) {
        NewNode ptr = begin.getNext();
        while (ptr != null) {
            ptr.display();
            ptr = ptr.getNext();
        }
    } 

    public static void addInOrder2(NewNode newItem, NewNode list) {
        NewNode ptr = list.getNext();
        NewNode trailer = list;
        while (ptr != null && 
               newItem.getData().toString().compareTo(ptr.getData().toString())
               < 0) {
          ptr = ptr.getNext();
          trailer = trailer.getNext();
        }
        newItem.setNext(ptr);
        trailer.setNext(newItem);
    }

    // instance data

    private Object data;
    private NewNode next;
 
}  // NewNode
