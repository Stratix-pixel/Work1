

public class lab2prob1 {

    public static void main(String[] args) {

        int[] myArray = {39, -9, 10, 491, -89, 1003, 592, 0, 3, 1, 10};

        for (int i : myArray) {

            System.out.print(i + " ");
        }
        insertSort(myArray);
        System.out.println(" ");
        for (int i : myArray) {

            System.out.print(i + " ");
        }
    }

    private static void insertSort(int[] myArray) {
        for (int i = 1; i < myArray.length; i++) {
                int j = i-1;
                int currentElement = myArray[i];
                while (j >= 0 && currentElement < myArray[j]) {
                    myArray[j + 1] = myArray[j];
                    j--;

                }
                myArray[j+1] = currentElement;
            }

        }

    private static void insertSort2(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {

            int j = i+1;
            int currentElement = myArray[i];
            do {
                myArray[j + 1] = myArray[j];
                j--;

            } while (j >= 0 && currentElement < myArray[j]);

            myArray[j+1] = currentElement;
        }

    }

}


