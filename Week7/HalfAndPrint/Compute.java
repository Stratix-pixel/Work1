package HalfAndPrint;

public class Compute {

    public int[] divideArray(int[] intsArray, Function func) {
        int[] result = new int[intsArray.length];

        for (int i = 0; i < intsArray.length; i++) {
            result[i] = func.evaluate(intsArray[i]);
        }
        return result;
    }

}
