import java.util.Scanner;

public class lab2prob10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number in base 2: ");
        String binary = sc.nextLine();

        int toDecimal = binaryToDecimal(binary);
        System.out.println("The number itself is : " + toDecimal);
    }


    private static int binaryToDecimal(String numberInBinary) {
        int res = 1, binary = 0;
        char binaryDigits = '1';
        char[] charArray = numberInBinary.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == binaryDigits) {
                binary += res;
            }
            res *= 2;
        }
        return binary;
    }

    //Alta metoda care primeste reprezentarea binara ca int in loc de string

    private static int binaryToDecimal2(int binary) {
        int i = 0, n = 0;
        while (binary != 0) {
            n += (binary % 10) * Math.pow(2, i);
            binary /= 10;
            i++;
        }
        return n;
    }

}

