package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
class X {
    int a;

    X(int i) {
        a = i;
    }
}

class Y extends X {
    int b;
    Y(int i, int j) {
        super(j);
        b = i;
    }
}

class SupSubRef {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);
        x2 = x;
        System.out.println("x2.a: " + x2.a);
        x2 = y;
        System.out.println("x2.a: " + x2.a);

        x2.a = 19;

    }
}
