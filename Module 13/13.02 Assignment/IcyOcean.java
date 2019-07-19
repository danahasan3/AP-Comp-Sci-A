 /**
 * This class defines a basic Icy Ocean.
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */

public class IcyOcean extends Ocean{
    private int icebergs;
    
    public IcyOcean(int l, int w, int d, int icebergs){
        super(l, w, d);
        this.icebergs = icebergs;
    }
    
    public int getIcebergs(){
        return icebergs;
    }
    
    public String toString(){
        return String.format("Icy Ocean Land has dimensions %d X %d X %d and has %d icebergs", getLength(), getWidth(), getDepth(), icebergs);
    }
}
