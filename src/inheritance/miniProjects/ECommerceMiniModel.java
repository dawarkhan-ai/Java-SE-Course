package inheritance.miniProjects;

import java.util.*;

// Interfaces
interface Taxable {
    double calculateTax();
}

interface Shippable {
    String getShippingDetails();
}

// Abstract Class
abstract class Product implements Taxable, Shippable {
    String name;
    double price;
    String brand;

    Product(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println(name + " | " + brand + " | ₹" + price);
    }

    abstract double getDiscount();

    public double calculateTax() {
        return (price - getDiscount()) * 0.18;    // 18% GST
    }

    public String getShippingDetails() {
        return "Standard Delivery in 3-5 days";
    }
}


//Derived classes
class Electronics extends Product {
    int warrantyMonths;

    Electronics(String name, double price, String brand, int warrantyMonths) {
        super(name, price, brand);
        this.warrantyMonths = warrantyMonths;
    }

    double getDiscount() {
        return price * 0.10;  // 10% off
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String brand, String size) {
        super(name, price, brand);
        this.size = size;
    }

    double getDiscount() {
        return price * 0.05;  // 5% off
    }
}

class Grocery extends Product {
    String expiryDate;

    Grocery(String name, double price, String brand, String expiryDate) {
        super(name, price, brand);
        this.expiryDate = expiryDate;
    }

    double getDiscount() {
        return 0;          // No discount
    }
}

// Cart Class
class Cart {
    List<Product> items = new ArrayList<>();

    void addToCart(Product p) {
        items.add(p);
        System.out.println(p.name + " added to cart.");
    }

    void viewCart() {
        System.out.println("\n--- Cart Items ---");
        for (Product p : items) {
            p.displayInfo();
        }
    }

    void checkout() {
        System.out.println("\n--- Order Summanry ---");
        double total = 0, tax = 0;
        for(Product p : items) {
            double discount = p.getDiscount();
            double finalPrice = p.price - discount;
            double taxAmount = p.calculateTax();
            System.out.println(p.name + " -₹" + p.price + " - Discount: ₹" + discount);
            total += finalPrice;
            tax += taxAmount;
        }
        System.out.println("Total: ₹" + total);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Final Amount: ₹" + (total + tax));

        // Inner Class
        class Order {
            void placeOrder() {
                System.out.println("\n Order Placed Successfully!");
            }
        }
        Order order = new Order();
        order.placeOrder();
    }
}

// User Class
class User {
    String username;
    Cart cart;

    User(String username) {
        this.username = username;
        this.cart = new Cart();
    }

    void shop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, " + username + "!\n");

        // Sample Products
        Electronics e1 = new Electronics("iPhone 15", 80000, "Apple", 12);
        Clothing c1 = new Clothing("Levi's Jeans", 3000, "Levi's", "L");
        Grocery g1 = new Grocery("Basmati Rice", 1000, "IndiaGate", "31-Dec-2025");

        while(true) {
            System.out.println("\n1. View Products \n2. View Cart \n3. Checkout\n4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            if(ch == 1) {
                System.out.println("\n Available Products: ");
                System.out.println("1."); e1.displayInfo();
                System.out.println("2."); c1.displayInfo();
                System.out.println("3."); g1.displayInfo();
                System.out.print("Choose product to add to cart (1-3): ");
                int p = sc.nextInt();
                if (p == 1) cart.addToCart(e1);
                else if (p == 2) cart.addToCart(c1);
                else if (p == 3) cart.addToCart(g1);
            }  else if (ch == 2) {
                cart.viewCart();
            }   else if (ch == 3) {
                cart.checkout();
                break;
            }   else {
                System.out.println("Exiting. Thank you!");
                break;
            }
        }
    }
}

public class ECommerceMiniModel {
    public static void main(String[] args) {
        User u = new User("Rahul");
        u.shop();
    }
}
