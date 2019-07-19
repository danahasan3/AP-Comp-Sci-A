
 /**
 * This class defines a basic Terrain.
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */

public class Terrain{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w){
        // initialize instance variables
        length = l;
        width = w;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }
    
    public String toString(){
        return String.format("Land has dimensions %d X %d", length, width);
    }
}
