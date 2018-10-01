
import java.util.Arrays;

public class lab3 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        //a = increaseSize(a,1);
        a = insertAt(a, 1, 7);
        //a = deleteAt(a, 2);
        print(a);
    }


    public static int[] increaseSize(int[] x, int newCapacity) {
        int[] y = new int[newCapacity];
        for (int i = 0; i <= x.length - 1; i++) {
            y[i] = x[i];
        }
        return y;
    }

    public static int[] insertAt(int[] x, int index, int value) {
        x = increaseSize(x, x.length+1);
        int[] y = new int[x.length];
        for (int j = 0; j < y.length-1; j++) {
            y[j] = x[j];
        }
        for (int i = y.length-1; i >= index; i--) {
            y[i] = y[i-1];
        }
        y[index]= value;
        return y;
    }


    public static int[] deleteAt(int[] x, int index) {
        int[] z =new int[x.length-1];
        for (int i = index; i < x.length-1; i++)
        {
                x[i] = x[i+1];
        }
        for(int j = 0; j < z.length; j++){
            z[j] = x[j];
        }
        return z;
    }


    public static void print(int[] x) {
        System.out.println(Arrays.toString(x));
    }

}