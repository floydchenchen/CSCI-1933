// BSTRremove

// A recursive binary search tree remove method

// Modified from a similar method written by Alec Shinomiya
// Uses a helper method that is tail-recursive
// Assumes BTNode.java with various instance and accessor methods 
// discussed in lecture such as getRightMostData()
// This version works on Objects (not generics) and uses 
// toString() on the data to determine ordering
// Fall 2016


    public boolean remove(Object d) {
      // recursive remove (uses removeHelper below)
        System.out.println("HERE");

        if (root==null)
          return false;
        else return removeHelper(root, null, d);
    }


    public boolean removeHelper(BTNode ptr, BTNode parent, Object d)  {
      // recursive remove

        if (ptr == null)           // CASE 0: not found, tree unchanged
            return false;

        if (ptr.getData().toString().compareTo(d.toString()) == 0) {  // item found, so remove it

          if (ptr.getLeft() == null) {  // no left branch
            if (ptr == root)       // CASE 1: found at root
                root = root.getRight();
            else {                 // CASE 2: found but not at root
                if (ptr == parent.getLeft())
                    parent.setLeft(ptr.getRight());
                else
                    parent.setRight(ptr.getRight());
            }
          }
        else {                     // CASE 3: found, and left branch exists
            ptr.setData(ptr.getLeft().getRightMostData());
            ptr.setLeft(ptr.getLeft().removeRightMost());
        }

        return true;
        }
        else if (ptr.getData().toString().compareTo(d.toString()) > 0)
               return removeHelper(ptr.getLeft(), ptr, d);
        else return removeHelper(ptr.getRight(), ptr, d);
    }
