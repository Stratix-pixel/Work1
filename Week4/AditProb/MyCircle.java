package AditProb;

public class MyCircle {
    MyPoint center = new MyPoint(0,0);
    int radius;

    public MyCircle(int x, int y, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle @ (" + getCenterX() + "," + getCenterY() + ") radius=" + radius;
    }

    public double getArea() {
        return this.radius * Math.PI * this.radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

}
