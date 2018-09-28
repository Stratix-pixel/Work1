import java.util.Scanner;

public class lab2prob9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int decimal = sc.nextInt();
        System.out.println("Please enter a base: ");
        int base = sc.nextInt();

        String toBase = "The number " + decimal + " in base " + base + " is: " + reverseString(decimalToBase(decimal, base));
        System.out.println(toBase);

    }

    private static String decimalToBase(int decimal, int base) {

        String res = "";

        int rem;
        while (decimal > 0) {
            rem = decimal % base;
            decimal /= base;
            if (base >= 10) {
                if (rem == 10)
                    res += 'A';
                else if (rem == 11)
                    res += 'B';
                else if (rem == 12)
                    res += 'C';
                else if (rem == 13)
                    res += 'D';
                else if (rem == 14)
                    res += 'E';
                else if (rem == 15)
                    res += 'F';
                else
                    res += rem;
            } else
                res += rem;
        }
        return res;
    }

    private static String reverseString(String s) {

        char[] chars = s.toCharArray();
        String inputs = "";

        for (int i = chars.length-1; i>=0; i--) {
            inputs += chars[i];
        }
        return inputs;
    }
}

