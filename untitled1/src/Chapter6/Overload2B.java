package Chapter6;

/**
 * Created by test on 7/6/2016.
 */
public class Overload2B {
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }
    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}

class TypeConv2 {
    public static void main(String args[]) {
        Overload2B ob = new Overload2B();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}