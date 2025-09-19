package packages.problems.ecomerce;

import packages.problems.ecomerce.models.Product;
import packages.problems.ecomerce.models.User;
import packages.problems.ecomerce.services.CartService;
import packages.problems.ecomerce.services.OrderService;
import static packages.problems.ecomerce.utils.Logger.log;

public class App {
    public static void main(String[] args) {
        User user = new User("john_doe");
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("House", 25.0);

        CartService cart = new CartService();
        cart.addToCart(product1);
        cart.addToCart(product2);

        OrderService order = new OrderService();
        order.placeOrder(user, cart.getCartItems());

        log("E-commerce sumulation complete.");
    }
}
