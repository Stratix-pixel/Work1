import java.util.Scanner;

public class prob7 {

    public static void main(String[] args) {
        //lab1, prob7

        int number,res;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");

        number = sc.nextInt();

        boolean interval = (number >= 0) && (number < 1000);


        System.out.println(interval ? "The number " + number + " is in the [0-1000] interval" : "The number " + number + " is not in the desired interval [0-1000] ");

        res = number % 2;


        System.out.println( (res != 0 ? 0 :
                (!interval) ? "The number is not in interval" :
                        (res == 0) ? 1 :
                                ""));

    }

}
