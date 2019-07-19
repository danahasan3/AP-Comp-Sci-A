
/**
 * Tester class for Student class
 *
 * @author Bhaskar Mishra
 * @version 5/11/2019
 */

import java.util.ArrayList;

public class Tester{
    public static void main(String[] args){
        System.out.println("Students with letter grade and scores");
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Benjamin", "Grimm", new double[]{89.5, 78, 95, 63.5, 94}));
        students.add(new Student("Raven", "Darkholme", new double[]{88, 90.5, 100, 88.5, 90, 100}));
        students.add(new Student("Barbara", "Gordon", new double[]{100, 60.5}));
        //students.add(new Student("", "Error1", new double[]{2}));
        //students.add(new Student("Error2", "", new double[]{2}));
        //students.add(new Student("Error3", "Error3", new double[]{}));
        
        for(Student student : students){
            System.out.println(student);
        }
    }
}
