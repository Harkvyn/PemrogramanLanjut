package LK3;
//[not finished yet]
import java.util.ArrayList;
public class Transaction{
    private String transactionId;
    ArrayList<Product> items = new ArrayList<Product>();
    int totalItems;
    
    //constructor
    public Transaction(String transactionId){
        this.transactionId = transactionId;
    }
    
    //getter
    public String getTransactionId(){
        return transactionId;
    }
    public double processSale(){
        double totalHarga = 0;
        
        //proses
        
        return totalHarga;
    }
    //method overloading
    public void addItem(Product item){
        
    }
    public void addItem(Product item,int quantity){
        totalItems += quantity;
    }
}

