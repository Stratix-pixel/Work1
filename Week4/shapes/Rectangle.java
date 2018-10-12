package shapes;

public class Rectangle extends Shapes{
   private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double computeArea() {
        return a * b;
    }

    @Override
    public double computePerimeter() {
        return 2 * (a+b);
    }

    @Override
    public String getName() {
        return " of the rectangle ";
    }

    @Override
    public void enlarge(double factor) {

    }

    public String toString () {
        String i = "";
        return i + "Rectangle[ length = " + b + ", width = " + a + " ]";
    }
}
