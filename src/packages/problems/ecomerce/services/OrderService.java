package packages.problems.ecomerce.services;

import packages.problems.ecomerce.models.Product;
import packages.problems.ecomerce.models.User;
import packages.problems.ecomerce.utils.Logger;

import java.util.List;

public class OrderService {
    public void placeOrder(User user, List<Product> products) {
        Logger.log("Placing order for user: " + user.getUsername());
        for (Product p : products) {
            Logger.log(" - " + p.getName() + ": $" + p.getPrice());
        }
        Logger.log("Order placed successfully.\n");
    }
}
