/**
 * Created by bhavtosh on 3/27/16.
 */

import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("/Users/bhavtosh/Desktop/Bhavtosh Rath/File_IO/read_data");
        int n = fis.available();
        System.out.println(n);

        byte b[] = new byte[n];

        int data = fis.read(b);
        System.out.println(data);

        String s = new String(b);
        System.out.println(s);

        fis.close();
    }
}
