package week44;

public class FixedDiscount implements Discount{
    public double discount;

    @Override
    public double calculateDiscount(double price) {
        return 0;
    }

    public FixedDiscount(double discount) {
        this.discount = discount;
    }
}
