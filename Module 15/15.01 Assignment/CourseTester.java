
/**
 * Tester Class for 4 course classes
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */

import java.util.ArrayList;

public class CourseTester{
    public static void main(String[] args){
        Trigonometry trig = new Trigonometry();
        IntroToLogic logic = new IntroToLogic();
        Economics econ = new Economics();
        APCompSci comp = new APCompSci();
        
        trig.createAssignment(4);
        logic.createAssignment(7);
        econ.createAssignment(2);
        comp.createAssignment(1);
        
        ArrayList<Homework> courses = new ArrayList<Homework>();
        courses.add(trig);
        courses.add(logic);
        courses.add(econ);
        courses.add(comp);
        
        printCenter("My Homework Reading To-Do", 40, true);
        printRepeated("-", 40, true);
        for(Homework course : courses){
            System.out.println(course.toString());
        }
    }
    
    /**
     * Prints string surrounded by space characters such that the original is at the center
     * @param str string that needs to be centered
     * @param fieldWidth amount of characters in which the string needs to be centered
     * @param newLine whether or not to add \n character at the end of the string
     */
    private static void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    /**
     * Prints a certain string repeatedly
     * @param str string that needs to be repeated
     * @param times number of times the string needs to be repeated
     * @param newLine whether or not to print a \n character at the end
     */
    private static void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
}
