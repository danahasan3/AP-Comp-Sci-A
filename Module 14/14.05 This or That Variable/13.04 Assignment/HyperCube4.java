/**
 * This class defines a HyperCube4 object by extending HyperRectangle4
 * but changing the constructor such that it takes one side length
 * and applies it to all 4 dimensions.
 * 
 * The toString method has been added.
 *
 * @author Bhaskar Mishra
 * @version 09/20/2018
 */
public class HyperCube4 extends HyperRectangle4{
    // Constructor for objects of class Box
    public HyperCube4 (int length){
        // call superclass
        super(length, length, length, length);
    }

    // String to display when object is printed.
    public String toString(){
        return "HyperCube: " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + getLength4();
    }
    
    
}
