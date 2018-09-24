public class lab2prob11 {
    public static void main(String[] args) {

        int[] a = {59, 2, 4, 49, 56, 121, 596, 56, 333, 13};

        int[] sorted = mergeSorts(a);
        System.out.print("The sorted array is : " + sorted);

    }

    private static  int[] mergeSort(int[] myArray) {

        int n = myArray.length;
        int[] leftSubArray;
        int[] rightSubArray;

        if (n % 2 == 0) {
            leftSubArray = new int[n/2];
            rightSubArray = new int[n/2];
        }
        else {
            leftSubArray = new int[n/2];
            rightSubArray = new int[n/2+1];
        }

        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                leftSubArray[i] = myArray[i];
            }
            else {
                rightSubArray[i-n/2] = myArray[i];
            }
        }

        leftSubArray = mergeSort(leftSubArray);
        rightSubArray = mergeSort(rightSubArray);

        return merge(leftSubArray, rightSubArray);
    }


    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length+right.length];

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

            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];

            for(int i = 0; i < elementsInA1; i++)
                arr1[i] = array[i];

            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = array[i];

            arr1 = mergeSorts(arr1);
            arr2 = mergeSorts(arr2);

            int i = 0, j = 0, k = 0;
            while(arr1.length != j && arr2.length != k)
            {
                if(arr1[j] < arr2[k])
                {
                    array[i] = arr1[j];
                    i++;
                    j++;
                }
                else
                {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }
            while(arr1.length != j)
            {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while(arr2.length != k)
            {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return new StringBuffer(array).toString();
    }

}

