import java.util.Arrays;
public class lab2prob11 {
    public static void main(String[] args) {

        int[] a = {59, 2, 4, 49, 56, -13, 121, 596, 56, 333, 13};

        int[] sorted = mergeSorts(a);
        System.out.print("The sorted array is : " + Arrays.toString(sorted));

    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[index++] = left[i++];
            }
            else {
                result[index++] = right[j++];
            }
        }

        while (i < left.length) {
            result[index++] = left[i++];
        }

        while (j < right.length) {
            result[index++] = right[j++];
        }

        return result;
    }

    private static int[] mergeSorts(int array[]) {

        if(array.length > 1)
        {
            int elementsInA1 = array.length / 2;

            int elementsInA2 = array.length - elementsInA1;

            int array1[] = new int[elementsInA1];
            int array2[] = new int[elementsInA2];

            for(int i = 0; i < elementsInA1; i++)
                array1[i] = array[i];

            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                array2[i - elementsInA1] = array[i];

            array1 = mergeSorts(array1);
            array2 = mergeSorts(array2);

            int i = 0, j = 0, k = 0;
            while(array1.length != j && array2.length != k)
            {
                if(array1[j] < array2[k])
                {
                    array[i] = array1[j];
                    i++;
                    j++;
                }
                else
                {
                    array[i] = array2[k];
                    i++;
                    k++;
                }
            }
            while(array1.length != j)
            {
                array[i] = array1[j];
                i++;
                j++;
            }
            while(array2.length != k)
            {
                array[i] = array2[k];
                i++;
                k++;
            }
        }
        return array;
    }

}
