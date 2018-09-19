import java.util.Scanner;

public class prob10 {

    public static void main(String[] args) {
        //lab1, prob10

        int x,y,p;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number: ");

        x = sc.nextInt();

        System.out.print("Please enter the second number: ");

        y = sc.nextInt();

        System.out.print("Please enter the number to divide: ");

        p = sc.nextInt();


        int res = (x % p == 0) ? (y / p) - (x / p) + 1 : (y / p) - (x / p);

        System.out.println(res);


    }

}
