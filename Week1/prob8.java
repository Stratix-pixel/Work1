import java.util.Scanner;

public class prob8 {

    public static void main(String[] args) {
        //lab1, prob8

        int n1,n2,n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");

        n1 = sc.nextInt();


        System.out.println("The first number is : " + n1);

        System.out.println("Please enter the second number: " );

        n2 = sc.nextInt();


        System.out.println("The second number is : " + n2);

        System.out.println("Please enter the third number: " );

        n3 = sc.nextInt();

        System.out.println("The seconds value is : " + n3);


        boolean cond1 = ((n2 > n1) && (n3 > n2)) || (n2 < n1);

        System.out.println(cond1);

        //boolean cond2 = (n3 > n2) || (n2 < n1);

        //System.out.println(cond2);





    }

}
