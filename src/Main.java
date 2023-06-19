import java.util.HashMap;
import java.util.Map;

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Product> inventory = new HashMap<>();

        // Adding products to the inventory
        Product product1 = new Product("01", "Washing Machine", 445.00);
        Product product2 = new Product("02", "Television", 910.00);
        Product product3 = new Product("03", "Electric Shaver", 329.00);

        inventory.put(product1.getId(), product1);
        inventory.put(product2.getId(), product2);
        inventory.put(product3.getId(), product3);

        // Display the total number of products in the inventory
        int totalProducts = inventory.size();
        System.out.println("Total number of products: " + totalProducts);

        // Display details of a specific product by providing its ID
        String productId = "02";
        Product product = inventory.get(productId);
        if (product != null) {
            System.out.println("Product details: " + product.getName() + " - Price: €" + product.getPrice());
        } else {
            System.out.println("Product not found with ID: " + productId);
        }

        // Remove a product from the inventory by providing its ID
        String productIdToRemove = "03";
        Product removedProduct = inventory.remove(productIdToRemove);
        if (removedProduct != null) {
            System.out.println("Product removed: " + removedProduct.getName());
        } else {
            System.out.println("Product not found with ID: " + productIdToRemove);
        }

        // Update the price of a product by providing its ID
        String productIdToUpdate = "01";
        double newPrice = 515.00;
        Product productToUpdate = inventory.get(productIdToUpdate);
        if (productToUpdate != null) {
            productToUpdate.setPrice(newPrice);
            System.out.println("Product price updated. New price: €" + productToUpdate.getPrice());
        } else {
            System.out.println("Product not found with ID: " + productIdToUpdate);
        }

        // Calculate and display the total value of the inventory (the sum of all product prices)
        double totalValue = 0.0;
        for (Product p : inventory.values()) {
            totalValue += p.getPrice();
        }
        System.out.println("Total value of the inventory: €" + totalValue);
    }
}