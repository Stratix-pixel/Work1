import java.util.Arrays;

public class lab2prob5 {
    public static void main(String[] args) {

        double[] array = {5, 8, 0, 1, 11, 254, 89, 101, -123};
        double[] arrays = oddArray(array);
        System.out.println(Arrays.toString(arrays));

    }

    private static double[] oddArray(double[] array) {
        int index2 = 0;

        double[] result = new double[array.length];
        int index = 0;


        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                result[i] = array[i];
                index2++;
            }

        }
        double[] finalResult = new double[index2];

        for (int  j = 0; j < result.length; j++){

            if (result[j] != 0){
                finalResult[index] = result[j];
                index++;
            }

        }
        return finalResult;
    }
}
