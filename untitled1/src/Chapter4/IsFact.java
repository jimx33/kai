package Chapter4;

/**
 * Created by test on 6/30/2016.
 */
class Factor{
    boolean isFactor(int a, int b){
        if ((b%a) == 0) return true;
        else return false;
    }
}

public class IsFact {
    public static void main(String args[]){
        Factor x = new Factor();
        if (x.isFactor(2, 20)) System.out.println("2 is factor");
        if (x.isFactor(3, 20)) System.out.println("This won't be displayed");
    }

}
