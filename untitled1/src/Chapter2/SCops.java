package Chapter2;

/**
 * Created by test on 6/30/2016.
 */
public class SCops {
    public static void main(String  args[]){
        int n = 10, d = 2, q;
        if (d != 0 && (n & d) == 0)
            System.out.println(d + " is a factor of " + n);
        d = 0;
        if (d != 0 && (n & d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}
