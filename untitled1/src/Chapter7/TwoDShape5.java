package Chapter7;

/**
 * Created by test on 7/7/2016.
 */
class TwoDShape5 {
    private double width;
    private double height;

    TwoDShape5() {
        width = height = 0.0;
    }

    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape5(double x) {
        width = height = x;
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

class Triangle5 extends TwoDShape5 {
    private String style;
    Triangle5() {
        super();
        style = "none";
    }
    Triangle5(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle5(double x) {
        super(x);
        style = "filled";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle5 is " + style);
    }
}

class ColorTriangle5 extends Triangle5 {
    private String color;
    ColorTriangle5(String c, String s,
                  double w, double h) {
        super(s, w, h);
        color = c;
    }
    String getColor() { return color; }
    void showColor() {
        System.out.println("Color is " + color);
    }
}
class Shapes6 {
    public static void main(String args[]) {
        ColorTriangle5 t1 =
                new ColorTriangle5("Blue", "outlined", 8.0, 12.0);
        ColorTriangle5 t2 =
                new ColorTriangle5("Red", "filled", 2.0, 2.0);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}