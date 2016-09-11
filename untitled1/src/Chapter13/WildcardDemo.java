package Chapter13;

/**
 * Created by test on 8/4/2016.
 */
class NumericFns1<T extends Number> {
    T num;

    NumericFns1(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericFns1<?> ob) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }

}

public class WildcardDemo {
    public static void main(String args[]) {
        NumericFns1<Integer> iOb =
                new NumericFns1<Integer>(6);
        NumericFns1<Double> dOb =
                new NumericFns1<Double>(-6.0);
        NumericFns1<Long> lOb =
                new NumericFns1<Long>(5L);
        System.out.println("Testing iOb and dOb.");
        if(iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
        System.out.println();
        System.out.println("Testing iOb and lOb.");
        if(iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}
