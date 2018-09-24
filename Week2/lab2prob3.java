import java.util.Arrays;

/**
 Write a function that receives two sorted arrays and returns a new sorted array with elements from both arrays.
 Tip: this is called the merge algorithm
 */
class P3 {
    public static void main(String[] args) {
        int[] numbers1 = {5, 8, 12, 54, 89, 101, 103};
        int[] numbers2 = {1, 8, 9, 10, 13, 55, 73, 100, 101, 102, 103, 104, 105};

        int[] merged = mergeSortedArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(merged));

    }

    private static int[] mergeSortedArrays(int[] numbers1, int[] numbers2) {
        int index1 = 0;
        int index2 = 0;

        // allocate a new array of length equal to the sum of the lengths of the two arrays
        int[] result = new int[numbers1.length + numbers2.length];
        int indexResult = 0;

        // keep moving indexes in both arrays until one of the array runs out of numbers
        while(index1 < numbers1.length && index2 < numbers2.length) {

            // copy from either the first array or from the second and increase the according index
            if(numbers1[index1] < numbers2[index2]) {
                result[indexResult] = numbers1[index1];
                indexResult++;
                index1++;
            } else {
                result[indexResult] = numbers2[index2];
                indexResult++;
                index2++;
            }
        }

        // check which of the arrays still has numbers left and assign it to the "remaining" variable
        int[] remaining;
        int indexRemaining;
        if(index1 < numbers1.length) {
            remaining = numbers1;
            indexRemaining = index1;
        } else {
            remaining = numbers2;
            indexRemaining = index2;
        }

        // copy the remaining numbers
        while(indexRemaining < remaining.length) {
            result[indexResult] = remaining[indexRemaining];
            indexResult++;
            indexRemaining++;
        }

        // return the resulting array
        return result;
    }
}