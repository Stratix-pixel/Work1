import java.util.Scanner;

public class prob9 {

    public static void main(String[] args) {
        //lab1, prob9

        int x,y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number: ");

        x = sc.nextInt();

        System.out.println("Please enter the second number: ");

        y = sc.nextInt();

        boolean interval = (x >= 13 && x <= 89) && (y >= 13 && y <= 89);


        int firstx = x/10;
        int secondx = x%10;

        int firsty = y/10;
        int secondy = y%10;



        System.out.println( interval ? "The numbers are " + x + " and " + y : "Numbers are not in the desired interval [13-89]");

        int digit = (firstx == firsty) ? firstx :
                        ((firstx == secondy) ? firstx :
                            ((secondx == firsty) ? secondx :
                                ((secondx == secondy) ? secondx : -1)));


        boolean number = (x == y);


        System.out.println( number && interval ? "The numbers are equal " : "");

        System.out.println( digit != -1  && interval ? "The numbers have a common digit " + digit :
                (!interval) ? "Numbers not in interval " :
                        ((!interval) && (digit != 1)) ? "Numbers are not in interval but they have a digit in common" :
                            (digit == -1) ? "Numbers have no common digit" :
                                            "");


    }
}
