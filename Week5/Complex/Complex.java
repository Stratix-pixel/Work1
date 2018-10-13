package Complex;

public class Complex {
    private double real, imag;
    public static final Complex ZERO = new Complex(0,0);
    public static String s = "staticField";


    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real)
    {
        this(real,0);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public Complex add(Complex a) {
        return new Complex(this.real + a.real, this.imag + a.imag);
    }

    public Complex negate(){
        return new Complex(-1*this.real, -1*this.imag);
    }

    public Complex multiply(Complex z) {
        if (this.imag == 0. || z.getImag() == 0.) {
            return new Complex(this.real*z.getReal());
        }
        return new Complex(
                (this.real*z.getReal()) - (this.imag* z.getImag()),
                (this.real*z.getImag()) + (this.imag* z.getReal()));
    }

    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex that = (Complex) x;
        return (this.real == that.real) && (this.imag == that.imag);
    }

    @Override
    public String toString() {
        return "Complex{" +
                 + real +
                ", " + imag +
                "i}";
    }

    public static Complex create(double real, double imag){
        return new Complex(real,imag);
    }

    public static Complex createzero(){
        s = "zero";
        return ZERO;
    }

}


