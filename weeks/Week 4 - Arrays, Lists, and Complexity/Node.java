// Node.java
// Linked List Node First Attempt 

// A starting point for a Node class
// What methods should be part of a Node class and what methods would 
// be better as part of a higher order class called List?
// Should there be any static methods?

public class Node {

    public Node(double initData, Node initLink) {
        data = initData;
        next = initLink;
    }
        
    public void display() {
        System.out.println("  " + data);
    }

    public void setData(double newData) {
        data = newData;
    }

    public void setNext(Node newLink) {
        next = newLink;
    }

    public double getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void printFrom() {
        display();
        if (getNext() != null)
          getNext().printFrom();
    }

    public static void printList(Node begin) {
        Node ptr = begin;
        while (ptr != null) {
            ptr.display();
            ptr = ptr.getNext();
        }
    } 

    // method to add a new Node to the list such that larger data
    // items are at the front of the list, but does it work?

    public static void addInOrder(Node newItem, Node list) {
        if (list == null) {
          newItem.setNext(null);
          list = newItem; 
        }
        else if (newItem.getData() > list.getData()) {
          newItem.setNext(list);
          list = newItem;
        }
        else {
          Node ptr = list.getNext();
          Node trailer = list;
          while (ptr != null && newItem.getData() < ptr.getData()) {
            ptr = ptr.getNext();
            trailer = trailer.getNext();
          }
          newItem.setNext(ptr);
          trailer.setNext(newItem);
        }
    }  

    // second attempt at method to add a Node to the list such that 
    // larger data items are at the front of the list;
    // this method assumes the list is "headed"

    public static void addInOrder2(Node newItem, Node list) {
        Node ptr = list.getNext();
        Node trailer = list;
        while (ptr != null && newItem.getData() < ptr.getData()) {
          ptr = ptr.getNext();
          trailer = trailer.getNext();
        }
        newItem.setNext(ptr);
        trailer.setNext(newItem);
    }

    private double data;
    private Node next;
 
}  //  Node.java
