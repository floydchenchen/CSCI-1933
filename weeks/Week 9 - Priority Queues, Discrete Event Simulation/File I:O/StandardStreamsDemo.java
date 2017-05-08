/**
 * Created by bhavtosh on 3/27/16.
 */

import java.io.IOException;

public class StandardStreamsDemo {
    public static void main(String args[]){
        try {
            byte b[] = new byte[10];
            System.out.println("Enter any number:");
            System.in.read(b);
            System.err.print("error message");
            }
        catch(IOException e)
            {
            System.err.print(e);
            }
    }
}
