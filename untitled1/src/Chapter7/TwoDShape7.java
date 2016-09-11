package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
class TwoDShape7 {
    private double width;
    private double height;
    private String name;
    TwoDShape7() {
        width = height = 0.0;
        name = "none";
    }
    TwoDShape7(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    TwoDShape7(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShape7(TwoDShape7 ob) {
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
    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

class Triangle7 extends TwoDShape7 {
    private String style;
    Triangle7() {
        super();
        style = "none";
    }
    Triangle7(String s, double w, double h) {
        super(w, h, "Triangle7");
        style = s;
    }
    Triangle7(double x) {
        super(x, "Triangle7");
        style = "filled";
    }
    Triangle7(Triangle7 ob) {
        super(ob);
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle7 is " + style);
    }
}

class Rectangle extends TwoDShape7 {

    Rectangle() {
        super();
    }
    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }
    Rectangle(double x) {
        super(x, "rectangle");
    }
    Rectangle(Rectangle ob) {
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

class DynShapes {
    public static void main(String args[]) {
        TwoDShape7 shapes[] = new TwoDShape7[5];
        shapes[0] = new Triangle7("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle7(7.0);
        shapes[4] = new TwoDShape7(10, 20, "generic");
        for(int i=0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}