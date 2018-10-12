package shapes;

public abstract class Shapes {

    public abstract double computeArea();

    public abstract double computePerimeter();


    public abstract String getName();

    public abstract void enlarge(double factor);

    public boolean isLargerThan(Shapes shape) {

        System.out.println("Area" + this.getName() + " " + this.computeArea());
        System.out.println("Area" + shape.getName() + " " + shape.computeArea());
        if(this.computeArea()>shape.computeArea())
        {
            System.out.println("Area" + this.getName() + " is larger than" + shape.getName());
            return true;
        }
        else{
            System.out.println("Area" + shape.getName() + " is larget than " + this.getName());

            return false;}

    }
}











