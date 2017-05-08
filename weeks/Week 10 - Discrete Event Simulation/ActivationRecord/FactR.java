
public class FactR {

    // static system stack
    public static Stack1 s = new Stack1();

    public static int returnedValue;  // global return method return value

    public static void main(String args[]) {

        s.push(new FactRecord(3));

        while(!s.isEmpty()) 
        {  // system loop goes until stack is empty
            ((FactRecord) s.top()).run();
        }  // end system loop

        // display final return value, if any
        System.out.println("Final Value is: " + returnedValue + "\n");
    }  // main method

}  // FactR class
