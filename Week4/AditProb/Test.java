package AditProb;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(1, 3);

        MyCircle c1 = new MyCircle(2, 4, 6);
        MyCircle c2 = new MyCircle(p1,3);



        System.out.println(c2.getArea());
        System.out.println(c1.getArea());


        //System.out.println(p1);
        p1.setX(6);
        p1.setY(4);
        System.out.println(p1);

        p2.setX(p1.getX() - 1 + p1.getY());
        p2.setY(p1.getY() + 5 - p1.getX());

        System.out.println(p2);

        MyPoint[] points = new MyPoint[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint();
        }

        System.out.println("Distance is " + p1.distance(p2));
        System.out.println("Distance is " + p1.distance(2, 8));
        System.out.println("Distance is " + p2.distance(p1));

        for (int i = 0; i < points.length; i++) {
            Scanner s = new Scanner(System.in);
            System.out.print("enter number");
            int a = s.nextInt();
        }





    }

}
