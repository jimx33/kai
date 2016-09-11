package Chapter5;

/**
 * Created by test on 7/1/2016.
 */
public class ShowBits {
    public static void main(String args[]) {
        int t;
        byte val;
        val = 123;
        for(t=128; t > 0; t = t/2) {
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
