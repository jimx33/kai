package Chapter2;

/**
 * Created by test on 6/30/2016.
 */
public class SideEffects {
    public static void main(String args[]){
        int i = 0;
        if (false & ( ++i < 100))
            System.out.println("This won't be displayed");
        System.out.println("If statement executedL " + i);
        if (false && (++i < 100))
            System.out.println("This won't be displayed");
        System.out.println("If statement executed: " + i);
    }
}
