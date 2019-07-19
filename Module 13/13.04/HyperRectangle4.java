/**
 * This class defines a HyperRectangle4 object by extending Box4
 * and including a length4 variable
 * 
 * The toString method has been added.
 *
 * @author Bhaskar Mishra
 * @version 09/20/2018
 */
public class HyperRectangle4 extends Box4{
    // Length of hyperrectangle along the 4th dimension
    int length4;
    
    // Constructor for objects of class Box
    public HyperRectangle4(int length1, int length2, int length3, int length4){
        // call superclass
        super(length1, length2, length3);
        
        this.length4 = length4;
    }

    // String to display when object is printed.
    public String toString(){
        return "HyperRectangle: " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + this.length4;
    }
    
    public int getLength4(){
        return this.length4;
    }
    
    public boolean equals(HyperRectangle4 rect){
        return (getLength() == rect.getLength() && getWidth() == rect.getWidth() && getHeight() == rect.getHeight() && getLength4() == rect.getLength4());
    }
}
