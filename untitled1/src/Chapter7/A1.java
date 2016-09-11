package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
class A1 {
    int i, j;
    A1(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
    }
}
class B1 extends A1 {
    int k;
    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}
class Override {
    public static void main(String args[]) {
        B1 subOb = new B1(1, 2, 3);
        subOb.show(); // this calls show() in B
    }
}

