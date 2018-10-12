package shapes;

public class MyRectangle extends Shapes {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public MyRectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ']';
    }

    @Override
    public double computeArea() {
        return (a.distance(b)) * (b.distance(c));
    }

    @Override
    public double computePerimeter() {
        return 2 * ((a.distance(b)) + (b.distance(c)));
    }

    @Override
    public String getName() {
        return " of the rectangle ";
    }

    @Override
    public void enlarge(double factor) {

    }
}
