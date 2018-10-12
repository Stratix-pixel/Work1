package shapes;

public class Triangle extends Shapes {
    double a,b,c;



    public Triangle (double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA (double a) {
        this.a = a;
    }

    public void setB (double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double computeArea() {
        double p = (a+b+c)/2;
        double area = Math.sqrt((p*(p-a) * (p-b) * (p-c)));//Heron's formula
        return area;
    }

    @Override
    public double computePerimeter() {
        return a+b+c;
    }

    @Override
    public String getName() {
        return " of the triangle ";
    }

    @Override
    public void enlarge(double factor) {

    }

    public String toString () {
        String i = "";
        return i + "Triangle[side a = " + a + ", side b = " + b + ", side c = " + c +" ]";
    }

    public String printType (double a, double b, double c) {
        String i = "";
        if (a==b && a==c && b==c) {
            i = "equilateral";
            return i;
        }
            if (a==b || a==c || b==c) {
               i= "isosceles";
               return i;
            } else i = "scalene";
            return i;

                }
            }




