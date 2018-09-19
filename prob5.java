import java.util.Scanner;

public class prob5 {

    public static void main(String[] args) {
        //lab1, prob5

        int conv;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the feet of the person: ");

        double feet = sc.nextDouble();

        System.out.print("Enter the inches of the person: ");

        double inch = sc.nextDouble();

        double f = feet * 30.48;
        double i = inch * 2.54;

        double sum = f + i;

        conv = (int)sum;

        System.out.println("The person has " + conv + " centimeters");

    }

}
