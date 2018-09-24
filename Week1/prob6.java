import java.util.Scanner;

public class prob6 {

    public static void main(String[] args) {
        //lab1, prob6

        int i,f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the centimeters of the person: ");

        double centi = sc.nextDouble();

        double inch = (centi % 30.48)/2.54;
        double feet = centi/30.48;

        i = (int)inch;
        f = (int)feet;

        System.out.printf("The imperial height of the person is " + f +" feet " + i + " inches");


    }

}
