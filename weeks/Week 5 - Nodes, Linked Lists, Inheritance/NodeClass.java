// NodeClass.java
// A *simplified* sample node class for use with higher order data 
// structures that create lists of nodes.  
// NodeClass uses Object data.
// You may modify this class (or rename it) for use with other data
// structures as we proceed with the course.

public class NodeClass {
  
    // constructors
    
    public NodeClass() {}

    public NodeClass(Object o, NodeClass link) {
        data = o;
        next = link;
    }

    // selectors

    public Object getData() {
        return data;
    }

    public void setData(Object o) {
        data = o;
    }

    public NodeClass getNext() {
        return next;
    }

    public void setNext(NodeClass link) {
        next = link;
    }

    // instance variables

    private Object data;
    private NodeClass next;

}  // NodeClass class
