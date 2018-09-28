

public class lab2prob6 {
    public static void main(String[] args) {

        int[] array = {1, 4, 4, 4, 5, 7, 8, 7, 2, 2, 2, 2, 9, 9, 10};
        String arrays = consecutiveArray(array);
        System.out.println(arrays);

    }

    private static String consecutiveArray(int[] array) {
        int element=0;
        String result = "";

        for (int i = 0; i < array.length - 1; i++){
            if ( array[i] == array[i+1]){
                while (array[i] == array[i+1]) {
                    i++;
                }
                result += array[i] + ", ";
                element=result.length()-2;
            }
        }
        result = result.substring(0,element);
        return result;
    }

}

