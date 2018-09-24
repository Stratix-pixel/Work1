import java.util.Arrays;

public class lab2prob7 {
    public static void main(String[] args) {

        int[] array = {3, 6, 9, 10, 321, 941, -212, 0};
        int[] array2 = {0, 1, 2, 89, 101, 1003, 5604};
        System.out.println("The first array is: " + Arrays.toString(array));
        boolean sortedOrNot = isSorted(array);
        isTruePrint(sortedOrNot);
        System.out.println("The second array is: " + Arrays.toString(array2));
        boolean sortedOrNot2 = isSorted(array2);
        isTruePrint(sortedOrNot2);

    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void isTruePrint(boolean trueOrNot) {

        if (trueOrNot) {
            System.out.println("This array is sorted\n");
        }
        else {
            System.out.println("This array is not sorted\n");
        }

    }

}

