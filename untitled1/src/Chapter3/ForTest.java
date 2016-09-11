package Chapter3;

/**
 * Created by test on 6/30/2016.
 */
public class ForTest {
    public static void main(String args[])
        throws java.io.IOException{
        int i;
        System.out.println("Press s to stop.");
        for (i = 0; (char) System.in.read() != 's'; i++)
            System.out.println("Pass #" + i);
    }
}
