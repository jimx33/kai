package Chapter12;

/**
 * Created by test on 8/3/2016.
 */
public class Quadratic {
    public static void main(String args[]) {

        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
