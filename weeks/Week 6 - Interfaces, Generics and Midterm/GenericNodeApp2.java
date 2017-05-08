package generics;

// GenericNodeApp2.java

// Updated version of GenericNodeApp - 3/2016

// Driver Application for the GenericNode class
// Includes two examples--list of Doubles (using wrapper class) and
//                      --list of Data Records (see Record.java)

public class GenericNodeApp2 {

    public static void main(String[] args) {

        // list made from GenericNode of Doubles
        GenericNode<Double> start = new GenericNode<Double> (new Double(0), null);

        for (int i = 1; i <= 5; i++) {
            start.addInOrder2(new GenericNode<Double> ((double) i, null), start);
        }

        System.out.println("\nUsing non-static print from header:");
        start.printFrom();
        System.out.println("\nUsing static printList from header:");
        GenericNode.printList(start);

        System.out.println();
        
        // re-set and try with a data record

        // list made from GenericNode of Record 
        GenericNode<Record> start2 = new GenericNode<Record> (new Record(), null);
        
        start2.addInOrder2 (new GenericNode<Record> (new Record("John", "A", "Doe"), null),
                            start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("John", "C", "Doe"), null),
                            start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("John", "B", "Doe"), null),
                            start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("Mary", "A", "Doe"), null),
                            start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("Ann", "A", "Apple"), null),
                            start2);
       
        System.out.println("\nUsing non-static print from header:"); 
        start2.printFrom();
        System.out.println("\nUsing static print from header:"); 
        GenericNode.printList(start2);

        System.out.println();
    }
}  // GenericNodeApp2
