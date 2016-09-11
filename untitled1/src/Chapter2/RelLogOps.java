package Chapter2;

/**
 * Created by test on 6/30/2016.
 */
public class RelLogOps {
    public static void main(String args[]){
        int i = 10, j = 11;
        boolean b1 = true, b2 = false;
        if (i <  j) System.out.println("i < j");
        if (i <=  j) System.out.println("i <= j");
        if (i !=  j) System.out.println("i != j");
        if (i == j) System.out.println("This won't execute");
        if (i >=  j) System.out.println("This won't execute");
        if (i >  j) System.out.println("This won't execute");

        if (b1 & b2) System.out.println("This won't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println(" b1 | b2 is true");
        if (b1 ^ b2) System.out.println(" b1 ^ b2 is true");
    }
}
