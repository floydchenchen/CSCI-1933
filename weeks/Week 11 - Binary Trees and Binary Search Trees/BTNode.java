// BTNode.java
// Binary Tree Node
// Updated Fall 2016

// Binary Tree Node (BTNode.java) is a general instantiable class for a 
// Binary Tree of Objects
// NO particular ORDERING of nodes is implied
// This class is instantiated for EACH node in a Binary Tree
// How would this be updated to allow for generic data in each node?

// Each node consists of:
//   * data Object 
//   * left branch 
//   * right branch
// Either or both the left and right branches of a node can be null
// In addition to the constructor, several accessor methods are included
// which are similar to those discussed/written in lecture

// Several Binary Tree Methods similar to those developed in lecture
// are also included; some are implemented twice--both recursively and
// iteratively

// No wrapper class is used, but this BTNode class can be used as the 
// underlying tree structure for a Binary Search Tree (see class BST2.java).

// The data field in BTNode is Object, but this can be easily changed to
// a generic type such as was done with the stack and queue implmentations.

public class BTNode {

  // constructor

    public BTNode(Object d, BTNode l, BTNode r) {
        data = d;
        left = l;
        right = r;
    }

  // selectors

    public BTNode getLeft()   { return left; }
    public BTNode getRight()  { return right; }
    public Object getData()   { return data; }

  // modifiers

    public void setLeft(BTNode l)   { left = l; }
    public void setRight(BTNode r)  { right = r; }
    public void setData(Object d)   { data = d; }

    public void display() {
      // display "this" node and its immediate children, if any 

        System.out.print("data = " + data);
        if (left != null)
            System.out.print(", left child = " + left.getData());
        if (right != null)
            System.out.print(", right child = " + right.getData());
        System.out.println();
    }

    public String toString() {
      // data conversion

        return data.toString();
    }

  // general Binary Tree methods

    public int getMaxDepth() {
      // recursive getMaxDepth -- returns depth starting from current node

        if ((left == null) && (right == null))
            return 0;
        else if (left == null)
            return (1 + right.getMaxDepth());
        else if (right == null)
            return (1 + left.getMaxDepth());
        else
            return (1 + (int) Math.max(left.getMaxDepth(),
                                       right.getMaxDepth()));
    }

    public BTNode removeRightMost() {
      // removes right most node and returns modified (smaller) tree

        if (right == null)
            return left;
        else {
            setRight(right.removeRightMost());
            return this;
        }
    }

    public BTNode removeLeftMost() { 
      // removes left most node and returns the new (smaller) tree

        if (left == null)
            return right;
        else {
            setLeft(left.removeLeftMost());
            return this;
        }
    }

    public Object getLeftMostDataR() {
      // recursive getLeftMostData method
      // returns the left most Object found under this node

        if (left == null)
            return data;
        else
            return left.getLeftMostDataR();
    }

    public Object getLeftMostDataI() {
      // iterative getLeftMostData method
      // returns the left most Object found under this node

        Object ans;
        if (left == null)
            ans = data;
        else {
            BTNode ptr = left;
            while (ptr.getLeft() != null) 
                ptr = ptr.getLeft();
            ans = ptr.getData();
        }
        return ans;
    }

    public Object getRightMostDataR() {
      // recursive getRightMostData method
      // returns the right most Object found under this node

        if (right == null)
            return data;
        else
            return right.getRightMostDataR();
    }

    public Object getRightMostDataI() {
      // iterative getRightMostData method
      // returns the right most Object found under this node

        Object ans;
        if (right == null)
            ans = data;
        else {
            BTNode ptr = right;
            while (ptr.getRight() != null) 
                ptr = ptr.getRight();
            ans = ptr.getData();
        }
        return ans;
    }

  // instance variables

    private Object data;
    private BTNode left;
    private BTNode right;

}  // BTNode.java
