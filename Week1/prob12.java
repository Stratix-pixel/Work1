import java.util.Scanner;

public class prob12 {

    public static void main(String[] args) {
        //lab1, prob12

        double a,b,c;

        double r1, r2, delta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number: ");

        a = sc.nextDouble();

        System.out.print("Please enter the second number: ");

        b = sc.nextDouble();

        System.out.print("Please enter the third number: ");

        c = sc.nextDouble();

        System.out.println("We have the quadratic equation: "+ a +"x^2 + "+ b +"x + "+c);

        delta = (b*b) - (4*a*c);

        System.out.println(Math.round((delta * 100))/100);

        double rr = r1 = r2 = -b/(2*a);

        double rrr = (r1 = (- b + Math.sqrt(delta))/(2*a));
        double rrr1 = (r2 = (- b - Math.sqrt(delta))/(2*a));


        System.out.println(delta == 0.0 ?  "Roots are : " + Math.round((r1 * 100))/100 + " , " + Math.round((r2 * 100))/100 :
                (delta > 0) ? "Roots are : " + Math.round((r1 * 100))/100 + " , " + Math.round((r2 * 100))/100 :
                        "Roots are imaginary");



    }
}