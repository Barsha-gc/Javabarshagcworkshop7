package javaweek7;

import java.util.HashMap;

public class ShoppingCart {

    private HashMap<Product, Integer> cartItems = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        cartItems.put(product, quantity);
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public void calculateTotalPrice() {
        System.out.println("Total price calculated");
    }

    public void viewCartItems() {
        System.out.println("Cart items displayed");
    }
}
