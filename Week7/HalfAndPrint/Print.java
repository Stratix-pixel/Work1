package HalfAndPrint;

public class Print implements Function{

    @Override
    public int evaluate(int val) {
        System.out.print(val + " ");
        return val;
    }

}
