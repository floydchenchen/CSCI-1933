// Example 27
// Queue Application using Q1 or Q2

public class QApp {

    public static void main(String[] args) {

//        Q1 q = new Q1();
//        Q2 q = new Q2(2);
        Q2 q = new Q2(); 
     
        if (q.length() == 0)
          System.out.println("The queue is empty");
        else System.out.println("The queue is not empty");

        q.add(new String("A"));
        System.out.println("A added - Q Length is: " + q.length());
        q.remove();
        System.out.println("A removed - Q Length is: " + q.length());
        q.add(new String("B"));
        System.out.println("B added - Q Length is: " + q.length());
        q.add(new String("C"));
        System.out.println("C added - Q Length is: " + q.length());
        q.add(new String("D"));
        q.add(new String("E"));

        System.out.println("Remove: " + q.remove().toString());
        System.out.println("- Q Length is: " + q.length());
        System.out.println("Remove: " + q.remove().toString());
        System.out.println("- Q Length is: " + q.length());
        System.out.println("Remove: " + q.remove());
        System.out.println("- Q Length is: " + q.length());
        System.out.println("Remove: " + q.remove());
        System.out.println("Remove: " + q.remove());
        System.out.println("Remove: " + q.remove());
        System.out.println("Remove: " + q.remove());
        q.add(new String("F"));
        System.out.println("Remove: " + q.remove());

        if (q.length() == 0)
          System.out.println("Queue is empty");
        else System.out.println("Queue is not empty");

        q.remove();

        if (q.length() == 0)
          System.out.println("Queue is empty");
        else System.out.println("Queue is not empty"); 

    }  // main method

}  // QApp class
