package Chapter10;

/**
 * Created by test on 7/27/2016.
 */
import java.io.*;

public class ShowFile {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {

            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}
