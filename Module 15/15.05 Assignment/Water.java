
/**
 * Abstract class for water
 *
 * @author Bhaskar Mishra
 * @version (ve
 */
public class Water implements Product, Comparable<Water>{
    String name;
    double cost;
    
    public Water(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCost(){
        return cost;
    }
    
    public int compareTo(Water water){
        if(this.cost < water.cost){
            return -1;
        }else if (this.cost == water.cost){
            return 0;
        }else{
            return 1;
        }
    }
}
