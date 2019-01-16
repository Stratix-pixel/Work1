package Project;

import java.math.*;
import java.util.Map.*;
import java.util.*;

public class CartExample {

    public static void main(String[] args) throws Exception {
        BoardGame game1 = new BoardGame("Catan", "Teuber Klaus", "Multiple award-winning game, great appeals to non-gamers and gamers alike.", BigDecimal.valueOf(59.90));
        Chair chair = new Chair("Furniture Chair Mid Black", "Super Furniture", BigDecimal.valueOf(64.29));

        Cart cart = new Cart();
        cart.add(game1, 1);
        cart.add(chair, 2);

        System.out.println(cart);

        cart.add(game1, 3);

        System.out.printf("Game: %s, Quantity: %d, Cost: %f%n", game1.getName(), cart.getQuantity(game1), cart.getCost(game1));

        System.out.println(cart);

        cart.remove(chair, 3);

        cart.remove(chair, 1);

        System.out.printf("Total Quantity: %d%n", cart.getTotalQuantity());
        System.out.printf("Total Price: %f%n", cart.getTotalPrice());

        BoardGame game2 = new BoardGame("Dixit", "Alan Moon", "The game that took the board game world by storm since 2004, Ticket to Ride opens up a franchise of games, easy to learn but strategic and tactical, accessible to new gamers yet interesting and fun for all.", BigDecimal.valueOf(69.90));

        cart.remove(game2);

        cart.add(game2, 1);

        Set<Saleable> products = cart.getProducts();
        System.out.println("Current products in shopping cart:");
        for (Saleable product : products) {
            System.out.println(product.getName());
        }

        cart.remove(game1);

        System.out.println("Current products and quantities in shopping cart:");
        for (Entry<Saleable, Integer> productQuantityEntry : cart.getItemWithQuantity().entrySet()) {
            System.out.printf("Product: %s, Quantity: %d%n", productQuantityEntry.getKey().getName(), productQuantityEntry.getValue());
        }

        cart.update(chair, 5);

        System.out.println(cart);

        cart.remove(game2, 1);
        System.out.println(cart);

        cart.clear();
        System.out.println(cart);

    }

}