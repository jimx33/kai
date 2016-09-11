package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
class TwoDShape6 {
    private double width;
    private double height;
    
    TwoDShape6() {
        width = height = 0.0;
    }
    
    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }
    
    TwoDShape6(double x) {
        width = height = x;
    }
    
    TwoDShape6(TwoDShape6 ob) {
        width = ob.width;
        height = ob.height;
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle6 extends TwoDShape6 {
    private String style;

    Triangle6() {
        super();
        style = "none";
    }

    Triangle6(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle6(double x) {
        super(x);
        style = "filled";
    }
    
    Triangle6(Triangle6 ob) {
        super(ob);
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle6 is " + style);
    }
}
class Shapes7 {
    public static void main(String args[]) {
        Triangle6 t1 =
                new Triangle6("outlined", 8.0, 12.0);

        Triangle6 t2 = new Triangle6(t1);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
