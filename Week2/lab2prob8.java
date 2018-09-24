import java.util.Scanner;

public class lab2prob8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
    }

    private static String decimalToBinary(int decimal) {

        String binary = "";
        if (decimal <= 0) {
            System.out.println("The number needs to be positive");
        } else {
            while (decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal /= 2;
            }
            System.out.println("Binary is: " + binary);
        }
    return binary;
    }
}


