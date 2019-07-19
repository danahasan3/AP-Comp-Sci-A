
/**
 * Abstract class for all MTGCards
 *
 * @author Bhaskar Mishra
 * @version 2/17/2019
 */
public abstract class MTGCard implements Product{
    String name;
    double cost;
    
    public MTGCard(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCost(){
        return this.cost;
    }
    
    public abstract String flavorText();
}
