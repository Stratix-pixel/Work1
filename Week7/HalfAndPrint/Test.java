package HalfAndPrint;

public class Test {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Print print = new Print();

        System.out.println("The array is: ");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            print.evaluate(myArray[i]);
        }

        System.out.print("\n");
        System.out.println("The elements halved from the array look like this: ");
        Function halve = new Half();

        Compute compute = new Compute();

        int[] myArray2 = compute.divideArray(myArray, halve);

        for (int i = 0; i < myArray.length; i++) {
            print.evaluate(myArray2[i]);
        }

    }
}
