package LK3;
import java.util.*;

abstract class Product {

    private String productId;
    private String name;
    private double price;
    private int stockQuantity;
    
    public Product() {

    }

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    
    public abstract double calculateDiscount();
    
    public void getProductInfo() {
        System.out.println("ID Produk : " + productId);
        System.out.println("Nama      : " + name);
        System.out.println("Harga     : " + price);
        System.out.println("Stok      : " + stockQuantity);
    }

    // Overloading di method ini
    public void updateStock(int quantity) {
        stockQuantity += quantity;
    }

    public void updateStock(int quantity, String reason) {
        stockQuantity += quantity;
        System.out.println("Update stok karena: " + reason);
    }
}
