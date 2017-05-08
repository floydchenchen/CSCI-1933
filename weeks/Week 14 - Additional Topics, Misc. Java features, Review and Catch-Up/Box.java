// Box.jva
// Simple automatic boxing and unboxing example

public class Box {
  
    public static void main(String[] args) {
        Integer i = new Integer(5);
        int j = 100;
        int result;

        result = i + j;
        System.out.println("The result is: " + result);
        i = j;
        System.out.println("The value of i is: " + i);
    }
}
