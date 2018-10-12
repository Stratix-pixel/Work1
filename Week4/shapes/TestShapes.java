package shapes;

public class TestShapes {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        System.out.println(c1);
        c1.setRadius(3);
        System.out.println("Radius is: " + c1.getRadius());
        System.out.printf("Area of the circle is: %.2f ", c1.computeArea());
        System.out.print("\n");
        System.out.println("Perimeter of the circle is: " + c1.computePerimeter());
        System.out.print("\n");

        Triangle t1 = new Triangle(22, 21, 15 );
        System.out.println(t1);
        System.out.printf("Area of the triangle is: %.2f ", t1.computeArea());
        System.out.print("\n");
        System.out.println("Perimeter of the triangle is: " + t1.computePerimeter());
        System.out.println("Triangle is: " + t1.printType(22,26,10));
        System.out.print("\n");

        Point a = new Point(17, 26);
        Point b = new Point(38, 8);
        Point c = new Point(46, 27);
        MyTriangle t4 = new MyTriangle (a, b, c);
        System.out.println(t4);
        System.out.println("Side AB of the triangle is: " + a.distance(b));
        System.out.println("Side AC of the triangle is: " + a.distance(c));
        System.out.println("Side BC of the triangle is: " + b.distance(c));

        System.out.println("My triangle area is: " + t4.computeArea());
        System.out.println("My triangle perimeter is: " +t4.computePerimeter());
        System.out.print("\n");


        Rectangle r1 = new Rectangle(42, 18);
        System.out.println(r1);
        System.out.printf("Area of the rectangle is: %.2f ", r1.computeArea());
        System.out.print("\n");
        System.out.println("Perimeter of the rectangle is: " + r1.computePerimeter());
        System.out.print("\n");

        Point d = new Point(32, 26);
        Point e = new Point(33, 4);
        Point f = new Point(54, 3);
        Point g = new Point(53, 28);
        MyRectangle r2 = new MyRectangle(a,b,c,d);
        System.out.println(r2);
        System.out.println("Side AB of the rectangle is: " + d.distance(e));
        System.out.println("Side BC of the rectangle is: " + e.distance(f));
        System.out.println("Side DC of the rectangle is: " + f.distance(g));
        System.out.println("Side AD of the rectangle is: " + d.distance(g));
        System.out.printf("Area of the rectangle is: %.2f ", r2.computeArea());
        System.out.print("\n");
        System.out.println("Perimeter of the rectangle is: " + r2.computePerimeter());
        System.out.print("\n");


        System.out.print("Area of triangle t1 is: " + t1.computeArea());
        System.out.print("\n");
        System.out.printf("Area of circle c1 is: %.2f" , c1.computeArea());
        System.out.print("\n");
        boolean test = t1.isLargerThan(c1);



    }
}
