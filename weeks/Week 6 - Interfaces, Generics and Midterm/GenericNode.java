package generics;
// GenericNode.java  

// Updated 3/2016
// Further improved linked list Node example that works on generic types rather 
// than Objects as the data field in the Node
// As in predecessors (Node, NewNode), addInOrder2 puts items in order from
// "largest" to "smallest" using toString() to determine order and uses a 
// *headed* list.

public class GenericNode<E> {  // Type parameter gives specific type (E) to be
                               // used within the class GenericNode.
                               // When referring to GenericNode within the class, use
                               // <E> after it since that is the effective name of the
                               // type.  The exception is on the constructor (see below)

    public GenericNode (E initData, GenericNode<E> initLink) {  // not intuitive, but <E>
                               // is NOT used in the constructor name
        data = initData;
        next = initLink;
    }

    // selectors and modifiers

    public void setData(E newData) {
        data = newData;
    }

    public void setNext(GenericNode<E> newLink) {
        next = newLink;
    }

    public E getData() {
        return data;
    }

    public GenericNode<E> getNext() {
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

    // generic method follows
    // Java generics detail: generic classes do not mean that generic
    // static methods can be used.
    // This is because the generic type is assigned to the scope of *instances* 
    // of the generic class--and different instances may have different types 
    // assigned through the generic type parameter.
    // Static methods are only in existance ONCE and therefore it makes no sense
    // for them to have the type of some instance of the generic class.
    // Below, printListi() *is* static, but it has its own generic type with a scope
    // that is limited to the method. 
    // This is emphasized by using a different type formal parameter <X>; 
    // Note that <E> could have been used, but it is likely to  be confusing since 
    // <E> is in a different (static) name scope from the <E> used as the generic
    // type of GenericNode.

    public static <X> void printList(GenericNode<X> begin) {
        GenericNode<X> ptr = begin.getNext();
        while (ptr != null) {
            ptr.display();
            ptr = ptr.getNext();
        }
    } 

    public void addInOrder2(GenericNode<E> newItem, GenericNode<E> list) {
        GenericNode<E> ptr = list.getNext();
        GenericNode<E> trailer = list;
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

    private E data;
    private GenericNode<E> next;

}  // GenericNode
