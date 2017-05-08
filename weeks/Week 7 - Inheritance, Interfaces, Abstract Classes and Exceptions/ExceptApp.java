
// ExceptApp.java
// Application using our own extended Exception called DivBy0Exception

public class ExceptApp {
    
    public static double divide(double a, double b) // throws DivBy0Exception 
    // since this is an extension of RuntimeException, it is not a checked
    // Exception, so we can get by without listing it
    {
        try {
        if (b == 0.0)
          throw new DivBy0Exception("First throw from divide");
        }
        catch (DivBy0Exception e) {
            System.out.println("Exception caught and now throwing it again");
            throw new DivBy0Exception("Second throw from divide");
        }
        finally {
            System.out.println("We got to finally in divide");
        }
        System.out.println("We got past try sequence in divide");
        return a / b;
    }  // divide method

    public static void main(String[] args) {
        
        System.out.println();
        try { 
            System.out.println("7/2 is: " + divide(7.0, 2.0) + "\n");
            System.out.println("7/0 is: " + divide(7.0, 0.0) + "\n");
            System.out.println("7/3 is: " + divide(7.0, 3.0) + "\n");
        }
        catch (DivBy0Exception e) {
            System.out.print("Could not do divide--Reason: ");
            System.out.println(e.toString());
        }
        finally {
            System.out.println("We get here regardless of Exception");
        }
        System.out.println("Bottom line of main");

    }  // main method

}  // ExceptApp class
