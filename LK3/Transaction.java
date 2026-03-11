/**
 *
 * @author Abraham
 */
package LK3;


import java.util.ArrayList;
public class Transaction{
    private String transactionId;
    ArrayList<Product> items = new ArrayList<>();
    int totalItems=0;
    
    //constructor
    public Transaction(String transactionId){
        this.transactionId = transactionId;
    }
    
    //getter
    public String getTransactionId(){
        return transactionId;
    }
    //method
    public double processSale(){
        double totalHarga = 0;
        
        //proses
        for (Product item : items){
            //                     harga asli - diskon
            totalHarga += (item.getPrice() - item.calculateDiscount());
        }
        return totalHarga;
    }
    //method overloading
    public void addItem(Product item){
        items.add(item);
        totalItems+=1;
        //Mengurangi jumlah stock sebesar 1 (nama setter belum pasti)
        item.setStockQuantity( item.stockQuantity()-1);
    }
    public void addItem(Product item,int quantity){
        items.add(item);
        totalItems += quantity;
        //Mengurangi jumlah stock sebesar int quantity (nama setter belum pasti)
        item.setStockQuantity( item.stockQuantity() - quantity);
    }
}
