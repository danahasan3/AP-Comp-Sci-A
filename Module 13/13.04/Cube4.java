/**
 * This class defines a Cube4 object by extending Box4
 * but changing the constructor such that it takes one side length
 * and applies it to all 3 dimensions.
 * 
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Cube4 extends Box4{
    // Constructor for objects of class Box
    public Cube4(int length){
        // call superclass
        super(length, length, length);
    }

    // String to display when object is printed.
    public String toString(){
        return "Cube: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
