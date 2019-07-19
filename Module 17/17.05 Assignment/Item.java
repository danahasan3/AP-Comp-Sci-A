
/**
 * Implementation class for item in store
 *
 * @author Bhaskar Mishra
 * @version 5/4/2019
 */
public class Item{
    private String name;
    private int productNumber;
    private double price;
    private int quantity;
    
    public Item(String name, int productNumber, double price, int quantity){
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName(){
        return name;
    }
    
    public int getProductNumber(){
        return productNumber;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public Item getCopy(){
        return new Item(name, productNumber, price, quantity);
    }
    
    public String toString(){
        return String.format("%15s%17d%15s%15d", name, productNumber, "$" + String.format("%.2f", price), quantity);
    }
}
