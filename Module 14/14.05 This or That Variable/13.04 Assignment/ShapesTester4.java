
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
import java.util.*;
public class ShapesTester4{
    public static void main(String[] args){
        Rectangle4 rect = new Rectangle4(12, 20);
        Box4 box1 = new Box4(4, 4, 4);
        Box4 box2 = new Box4(4, 12, 8);
        Cube4 cube1 = new Cube4(4);
        HyperRectangle4 hyperRectangle1 = new HyperRectangle4(3, 4, 5, 6);
        HyperCube4 hyperCube1 = new HyperCube4(5);
        
        System.out.println("My shapes: \n");
        System.out.println(rect);
        System.out.println(box1);
        showEffectBoth(box2);
        System.out.println(hyperRectangle1);
        System.out.println(hyperCube1);
        System.out.println();
        
        System.out.println("Test for equality: \n");
        if(box1.equals(cube1)){
            System.out.println(box1.toString() + " IS the same size as " + cube1.toString());
        }else{
            System.out.println(box1.toString() + " is NOT the same size as " + cube1.toString());
        }
        if(box2.equals(cube1)){
            System.out.println(box2.toString() + " IS the same size as " + cube1.toString());
        }else{
            System.out.println(box2.toString() + " is NOT the same size as " + cube1.toString());
        }
    }

    public static void showEffectBoth(Rectangle4 r){
        System.out.println(r);
    }

}
