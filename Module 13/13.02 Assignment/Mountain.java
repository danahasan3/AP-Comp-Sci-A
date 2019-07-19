 /**
 * This class defines a basic Mountain.
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */

public class Mountain extends Terrain{
    private int mountains;
    
    public Mountain(int l, int w, int mountains){
        super(l, w);
        this.mountains = mountains;
    }
    
    public int getMountains(){
        return mountains;
    }
    
    public String toString(){
        return String.format("Mountain Land has dimensions %d X %d and has %d mountains", getLength(), getWidth(), mountains);
    }
}
