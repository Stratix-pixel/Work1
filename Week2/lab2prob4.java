

public class lab2prob4 {
    public static void main(String[] args) {

        double[] arrayOfDoubles = {5, 8, 0, 1.254, 89, 101, -124};
        String array = convertToString(arrayOfDoubles);
        System.out.println(array);
    }

    private static String convertToString(double[] arrays) {

        String result = "";
        String temp;
        result = "[";
        for (int i = 0; i < arrays.length; i++){
            temp = String.format("%.2f",arrays[i]);
            if (i == arrays.length -1)
                result += temp;
            else{
                result += temp + ", ";
            }
        }
        result += "]";
    return result;
    }
}
