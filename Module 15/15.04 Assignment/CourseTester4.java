
/**
 * Tester Class for 4 course classes
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */

import java.util.ArrayList;

public class CourseTester4{
    public static void main(String[] args){
        Trigonometry4 trig = new Trigonometry4();
        IntroToLogic4 logic = new IntroToLogic4();
        Economics4 econ = new Economics4();
        APCompSciA4 comp = new APCompSciA4();
        
        trig.createAssignment(4);
        logic.createAssignment(7);
        econ.createAssignment(2);
        comp.createAssignment(4);
        
        ArrayList<Homework4> courses = new ArrayList<Homework4>();
        courses.add(trig);
        courses.add(logic);
        courses.add(econ);
        courses.add(comp);
        
        printCenter("My Homework", 80, true);
        printRepeated("-", 80, true);
        for(Homework4 course : courses){
            System.out.println(course.toString());
        }
        System.out.println("\n");
        
        printCenter("Comparing My Homework", 80, true);
        printRepeated("-", 80, true);
        String[] comparisons = new String[]{"less pages to read than", "the same number of pages as", "more pages to read than"};
        for(Homework4 course1 : courses){
            for(Homework4 course2 : courses){
                if(!course1.getType().equals(course2.getType())){
                    System.out.printf("%s has %s %s%n", course1.getType(), comparisons[course1.compareTo(course2)+1], course2.getType());
                }
            }
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
