package LK3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hanif Maulana
 */
public abstract class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;
    
    public Product (String productId, String name, double price, int stockQuantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public double getPrice(){
        return price;
    }   
    public int stockQuantity(){
        return stockQuantity;
    }
    public abstract double calculateDiscount();
    
    
    //setter
    public void setProductId (String productId){
        this.productId = productId;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setPrice (double price){
        this.price = price;
    }
    public void setStockQuantity (int stockQuantity){
        this.stockQuantity = stockQuantity;
    }
    
    //getter
    public void getProductInfo(){
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Stock : " + stockQuantity);
    }
    
    //update stock
    public void updateStock(int quantity){
        stockQuantity += quantity;
    }
    
    //update stock + reason
    public void updateStock(int quantity, String reason){
        stockQuantity += quantity;
        System.out.println("Stock diupdate karena : " + reason);
    }
    
}
