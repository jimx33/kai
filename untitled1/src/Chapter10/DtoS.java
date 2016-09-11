package Chapter10;

/**
 * Created by test on 7/27/2016.
 */

import java.io.*;

public class DtoS {
    public static void main(String args[]) {
        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
