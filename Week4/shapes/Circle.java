package shapes;

public class Circle extends Shapes  {

        private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        double pi = 3.14;
        return this.radius * pi * this.radius;
    }

    @Override
    public double computePerimeter() {
        double pi = 3.14;
        return 2*pi*this.radius;
    }

    @Override
    public String getName() {
        return " of the circle ";
    }

    @Override
    public void enlarge(double factor) {

    }

    public String toString () {
        String i="";
    return i + "Circle[radius = " + radius + "]";
}
}


