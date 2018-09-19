//import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        // lab1, prob1

        int a = 45;
        int b = 45;
        int c = 90;

        int s = a + b + c;


        System.out.println("Sum of angles: " + s);

        boolean ab = (s == 180) && (a == 90 || b == 90 || c == 90);

        System.out.println("Triangle test: " + ab );


    }

}
