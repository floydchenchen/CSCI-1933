/**
 * Created by bhavtosh on 3/27/16.
 */

import java.io.*;

class FileReaderDemo {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("/Users/bhavtosh/Desktop/Bhavtosh Rath/File_IO/read_data");
        BufferedReader br = new BufferedReader(fr);
        String s;

        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}