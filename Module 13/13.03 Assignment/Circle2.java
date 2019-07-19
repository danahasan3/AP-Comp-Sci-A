
/**
 * This class defines a Circle object.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int r;

    // Constructor for objects of class Circle
    public Circle2(int x, int y, int r){
        // initialize instance variables
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getRadius(){
        return this.r;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter(){
         return "center is at (" + this.x + ", " + this.y + ")";
    }
    
    public String getName(){
        return "Circle";
    }
}