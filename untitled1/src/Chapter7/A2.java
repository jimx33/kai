package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
public class A2 {
    int i, j;
    A2(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;
    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Overload2 {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show("This is k: ");
        subOb.show();
    }
}