 /**
 * This class defines a basic Forest.
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */

public class Forest extends Terrain{
    private int trees;
    
    public Forest(int l, int w, int trees){
        super(l, w);
        this.trees = trees;
    }
    
    public int getTrees(){
        return trees;
    }
    
    public String toString(){
        return String.format("Forest Land has dimensions %d X %d and has %d trees", getLength(), getWidth(), trees);
    }
}
