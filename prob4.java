import java.util.Scanner;

public class prob4 {

    public static void main(String[] args) {
            //lab1, prob4

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius: ");

            double radius = sc.nextDouble();
            double pi = 3.14159265359;

            double area = pi * (radius * radius);
            System.out.println("The area of circle is: " + area);

            double circumference = pi * 2 * radius;
            System.out.println("The circumference of the circle is: " + circumference);

        }

}
