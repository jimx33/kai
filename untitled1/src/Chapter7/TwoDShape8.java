package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
abstract class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    TwoDShape8() {
        width = height = 0.0;
        name = "none";
    }
    TwoDShape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    TwoDShape8(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShape8(TwoDShape8 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
    abstract double area();
}
class Triangle8 extends TwoDShape8 {
    private String style;
    Triangle8() {
        super();
        style = "none";
    }
    Triangle8(String s, double w, double h) {
        super(w, h, "Triangle8");
        style = s;
    }
    Triangle8(double x) {
        super(x, "Triangle8");
        style = "filled";
    }
    Triangle8(Triangle8 ob) {
        super(ob);
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle8 is " + style);
    }
}
class Rectangle1 extends TwoDShape8 {
    Rectangle1() {
        super();
    }
    Rectangle1(double w, double h) {
        super(w, h, "Rectangle1");
    }
    Rectangle1(double x) {
        super(x, "Rectangle1");
    }
    Rectangle1(Rectangle1 ob) {
        super(ob);
    }
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth() * getHeight();
    }
}
class AbsShape {
    public static void main(String args[]) {
        TwoDShape8 shapes[] = new TwoDShape8[4];
        shapes[0] = new Triangle8("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle1(10);
        shapes[2] = new Rectangle1(10, 4);
        shapes[3] = new Triangle8(7.0);
        for(int i=0; i < shapes.length; i++) {
            System.out.println("object is " +
                    shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
