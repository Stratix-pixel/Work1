package AditProb;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint () {
        this(0,0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "The point has the coordinates (" + x + "," + y + ")";
    }


    public double distance(int x, int y) {
        int xx = this.x - x;
        int yy = this.y - y;
        return Math.sqrt(xx*xx + yy*yy);
    }

    public double distance (MyPoint another) {
        int xx = this.x - another.x;
        int yy = this.y - another.y;
        return Math.sqrt(xx*xx + yy*yy);
    }

}
