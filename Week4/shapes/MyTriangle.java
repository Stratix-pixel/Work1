package shapes;

public class MyTriangle extends Shapes {

    private Point x;
    private Point y;
    private Point z;

    public MyTriangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public Point getZ() {
        return z;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ']';
    }


    @Override
    public double computeArea() {
        double p = (x.distance(y)+ x.distance(z) + y.distance(z))/2;
        double area = Math.sqrt((p*(p-(x.distance(y))) * (p-x.distance(z))) * (p-y.distance(z)));
        return area;
    }



    @Override
    public double computePerimeter() {
        return x.distance(y)+ x.distance(z) + y.distance(z);
    }

    @Override
    public String getName() {
        return " of the triangle ";
    }

    @Override
    public void enlarge(double factor) {

    }


}
