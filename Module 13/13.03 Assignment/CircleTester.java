
/**
 * Test Circles
 *
 * @author Bhaskar Mishra
 * @version 9/14/2018
 */

import java.util.ArrayList;

public class CircleTester{
    public static void main(String[] args){
        Circle2 circle = new Circle2(1, 1, 3);
        Circle2 cylinder = new Cylinder2(2, 3, 3, 5);
        Circle2 ovalCylinder = new OvalCylinder2(5, 8, 3, 2, 5);
        Circle2 oval = new Oval2(13, 21, 3, 2);
        
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(circle);
        circles.add(cylinder);
        circles.add(ovalCylinder);
        circles.add(oval);
        
        for(Circle2 circ : circles){
            showCenter(circ);
        }
    }
    
    static void showCenter(Circle2 circ){
        System.out.printf("For this %s the %s%n", circ.getName(), circ.getCenter());
    }
}
