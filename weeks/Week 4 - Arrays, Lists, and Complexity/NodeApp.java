// NodeApp.java
// Driver application example to test the Node class

// Four separate linked lists (ALL attempt to put LARGE values 
// at the START of the list)
// What works and what doesn't?  Why?

// * case 1: add smaller values to list first with addInOrder
// * case 2: add larger values to list first with addInOrder
// * case 3: add smaller values to list first with addInOrder2
// * case 4: add larger values to list first with addInOrder2

// Cases 1 & 2 do not assume a "headed" list, but cases 3 & 4 assume
// a headed list

public class NodeApp {

    public static void main(String[] args) {

        Node start = new Node(0.0, null);

        for (int i = 1; i <= 5; i++) {
            Node.addInOrder(new Node((double) i, null), start);
        }

        System.out.println("Additions get larger--addInOrder");
        System.out.println("Using non-static print:"); 
        start.printFrom();

        // re-set list
        start = new Node(0.0, null);

        for (int i = 5; i >= 1; i--) {
            Node.addInOrder(new Node((double) i, null), start);
        }

        System.out.println("Additions get smaller--addInOrder");
        System.out.println("Using non-static print:");
        start.printFrom();

        // re-set list
        start = new Node(0.0, null);

        for (int i = 1; i <= 5; i++) {
            Node.addInOrder2(new Node((double) i, null), start);
        }

        System.out.println("Additions get larger--addInOrder2");
        System.out.println("Using non-static print:");
        start.printFrom();

        // re-set list
        start = new Node(0.0, null);

        for (int i = 5; i >= 1; i--) {
            Node.addInOrder2(new Node((double) i, null), start);
        }

        System.out.println("Additions get smaller--addInOrder2");
        System.out.println("Using non-static print:");
        start.printFrom();
    }
}  // NodeApp.java
