package Chapter12;

/**
 * Created by test on 8/3/2016.
 */
public class AutoBox {
    public static void main(String args[]) {
        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        System.out.println(i + " " + iOb); // displays 100 100
    }
}
