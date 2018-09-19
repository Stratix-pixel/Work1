public class prob2 {

    public static void main(String[] args) {
        //lab1, prob2

        double a = 6.6;
        double b = 13.9;
        double c = 7.1;

        boolean isTriangle = (a + b) > c || (a + c) > b || (b + c) > a;

        boolean isRightAngle = (a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (c*c) + (b*b) == (a*a);

        System.out.println("The lines form a triangle " + isTriangle);
        System.out.println("The lines form a right triangle " + isRightAngle);


    }

}