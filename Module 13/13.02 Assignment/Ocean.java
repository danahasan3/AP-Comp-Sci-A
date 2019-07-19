 /**
 * This class defines a basic Ocean.
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */

public class Ocean extends Terrain{
    private int depth;
    
    public Ocean(int l, int w, int d){
        super(l, w);
        this.depth = d;
    }
    
    public int getDepth(){
        return depth;
    }
    
    public String toString(){
        return String.format("Ocean Land has dimensions %d X %d X %d", getLength(), getWidth(), depth);
    }
}
