package Chapter3;

/**
 * Created by test on 6/30/2016.
 */
public class KbIn {
    public static void main(String args[])
        throws java.io.IOException{
        char ch;
        System.out.print("Press a key followed by ENTER: ");
        ch = (char) System.in.read();
        System.out.println("Your key is " + ch);
    }
}
