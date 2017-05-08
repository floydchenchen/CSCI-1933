
// Complex3App.java

// This driver program uses the Complex3.java class.
// The variables within Complex3 canNOT be accessed directly 
// because they have now been declared as private within Complex3.  
// So, access to the information within Complex3 objects is done
// via the accessor methods (see Complex3.java).

// Note: this main driver would be very nice inside the Complex3.java
// class as a test driver, thus eliminating the need for this separate
// file and class.  However, the use of a separate file shows how a
// class from another file can be utilized externally.

public class Complex3App {
  
    public static void main (String[] args) {

        Complex3 c1, c2;
        double realSum, imaginarySum;
  
        c1 = new Complex3(0, 0);  // create an instance of Complex
        c2 = new Complex3(0, 0);  // create another instance of Complex

        c1.setRealPart(1.0);  
        c1.setImaginaryPart(2.0);
        c2.setRealPart(3.0);
        c2.setImaginaryPart(4.0);

        c1.addComplex(c2);  // perform addition, result in c1

        // one option uses local variables realSum and imaginarySum

        realSum = c1.getRealPart();
        imaginarySum = c1.getImaginaryPart();
  
        System.out.println("Sum is: " + realSum + " + " + imaginarySum +
            "i");
     
        // alternatively, without using the local variables

        System.out.println("Sum is: " + c1.getRealPart() + " + " +
            c1.getImaginaryPart() + "i"); 
    }  // main

}  // Complex3App class
