
/**
 * Write a description of class Spinner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Spinner{
    public static void main(String args[]){
        String[] colors = {"RED", "YELLOW", "GREEN", "BLUE"};
        for(int i = 0; i < 15; i++){
            int index = (int)(Math.random() * 4);
            System.out.println(i + ": " + colors[index]);
        }
    }
}