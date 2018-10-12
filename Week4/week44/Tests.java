package week44;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        List<Product> myProducts = new ArrayList<>();
        Product p1  = new Product(1231,"World of Warcraft",23.2,"DigitalGame","N/A");
        Product p2  = new Product(1233,"Call of Duty",45.2,"DigitalGame","N/A");
        myProducts.add(p1);
        myProducts.add(p2);
        myProducts.add(p1);
        myProducts.remove(p2);
        List<PercentageDiscount> Discount = new ArrayList<>();
        List<FixedDiscount> fixDiscount = new ArrayList<>();
        Address alexAddress = new Address("Socola","Romania", "Iasi","Fragile");
        myCart.customer = new Customer("Achirei","Alex", 1910813, alexAddress);
        myCart.products = myProducts;
        myCart.fixedDiscounts = fixDiscount;
        myCart.percentageDiscounts = Discount;
        double price = myCart.getTOtalPriceAfterFixedPercentageAndPercentage();
        System.out.println(price);

    }
}
