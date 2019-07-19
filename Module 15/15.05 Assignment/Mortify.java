
/**
 * Mortify MTG Card
 *
 * @author Bhaskar Mishra
 * @version 2/17/2019
 */
public class Mortify extends MTGCard{
    public Mortify(String name, double cost){
        super(name, cost);
    }
    
    public String flavorText(){
        return "Many who cross Sorin's path come down with a sudden and fatal case of being-in-the-way-of-a-millennia-old-vampire.";
    }
}
