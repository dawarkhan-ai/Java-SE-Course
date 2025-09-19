package packages.problems.ecomerce.services;

import packages.problems.ecomerce.models.Product;
import packages.problems.ecomerce.utils.Logger;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private List<Product> cart = new ArrayList<>();

    public void addToCart(Product product) {
        cart.add(product);
        Logger.log("Adder to cart: " + product.getName());
    }

    public List<Product> getCartItems() {
        return cart;
    }
}
