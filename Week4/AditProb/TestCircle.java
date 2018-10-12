package AditProb;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,1);
        MyCircle c1 = new MyCircle(2, 4, 6);
        MyCircle c2 = new MyCircle(p1,3);



        System.out.println(c2.getArea());
        System.out.println(c1.getArea());



    }
}
