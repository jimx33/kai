package Chapter2;

/**
 * Created by test on 6/30/2016.
 */
public class CastDemo {
    public static void  main(String args[]) {
        double x = 10.0, y = 3.0;
        byte b;
        int i;
        char ch;
        i = (int) (x/y);
        System.out.println("Integer outcome of x / y: " + i);
        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);
        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);
        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);

    }
}
