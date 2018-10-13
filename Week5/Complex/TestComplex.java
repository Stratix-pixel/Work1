package Complex;

public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(2,4);
        Complex c2 = new Complex(1,2);
        Complex c3 = new Complex(1,2);

        System.out.println("Add :" + c1.add(c2));
        System.out.println("Negation: " + c1.negate());
        System.out.println("Multiplication :" + c1.multiply(c2));
        System.out.println("Equals :" + c3.equals(c2));




    }
}
