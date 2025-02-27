
/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class OvalCylinder2 extends Oval2{
    // instance variables
    private int h;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h){
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        this.h = h;
    }

    public int getHeight(){
        return this.h;
    }
    
    public String getName(){
        return "Oval Cylinder";
    }
}