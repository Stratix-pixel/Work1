package week44;

import java.util.List;

public class Cart {
    Customer customer;
    List<Product> products;
    List<PercentageDiscount> percentageDiscounts;
    List<FixedDiscount> fixedDiscounts;

    public double totalPrice() {
        double totalPrice = 0;

        for (Product p : products){
            totalPrice += p.getPrice();
        }

        return totalPrice;
    }

    public double getTOtalPriceAfterPercentage(){
        double totalPercentage = 0;
        if (percentageDiscounts.size() == 0){
            return totalPrice();
        }
        for (PercentageDiscount pd : percentageDiscounts){
            totalPercentage += pd.calculateDiscount(totalPrice());
        }
        return totalPercentage;
    }

    public double getTOtalPriceAfterFixedPercentageAndPercentage(){
        double totalDiscountedPrice = 0;
        if (fixedDiscounts.size() == 0){
            return getTOtalPriceAfterPercentage();
        }
        for (FixedDiscount fd : fixedDiscounts){
            totalDiscountedPrice += fd.calculateDiscount(getTOtalPriceAfterPercentage());
        }
        return totalDiscountedPrice;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public void removedProduct(Product p){
        products.remove(p);
    }

}
