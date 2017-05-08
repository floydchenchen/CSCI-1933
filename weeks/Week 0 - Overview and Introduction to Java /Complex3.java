
// Complex3.java
// A complex number class 
// When a constructor is included, the default constructor goes away.
// It is usually a good idea to re-implement the default constructor.

public class Complex3 {

    private double realPart = 0;  
    private double imaginaryPart = 0;

    public Complex3(double a, double b) {
        realPart = a;
        imaginaryPart = b;
    }

    // accessor methods

    public void setRealPart(double value) {
        realPart = value;
    }

    public void setImaginaryPart(double value) {
        imaginaryPart = value;
    }

    public double getRealPart() {
        return realPart;
    }
   
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // operators

    public void addComplex(Complex3 c) {
        realPart = realPart + c.getRealPart();
        imaginaryPart = imaginaryPart + c.getImaginaryPart();
    }

    public void subtractComplex(Complex3 c) {
        realPart = realPart - c.getRealPart();
        imaginaryPart = imaginaryPart - c.getImaginaryPart();
    }

}  // Complex3 class
