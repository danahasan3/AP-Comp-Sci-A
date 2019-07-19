
/**
 * Tester class for Student class
 *
 * @author Bhaskar Mishra
 * @version 4/7/2019
 */

import java.util.ArrayList;

public class Tester{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>(12);
        students.add(new Student("Bhaskar", new int[]{100, 100, 100, 100, 100}));
        students.add(new Student("Michael", new int[]{100, 100, 100, 99, 100}));
        students.add(new Student("Sami", new int[]{100, 50, 100, 50, 100}));
        students.add(new Student("Jaeivan", new int[]{70, 70, 70, 70, 70}));
        students.add(new Student("Corgi", new int[]{9999, 9999, 9999, 9999, 9999}));
        
        printTable(students);
        System.out.println();
        
        System.out.println("<< Changing Jaeivan's name to Brooke >>\n");
        replaceName(students, "Jaeivan", "Brooke");
        printTable(students);
        System.out.println();
        
        System.out.println("<< Changing Corgi's Q5 grade to 9998 >>\n");
        replaceGrade(students, "Corgi", 5, 9998);
        printTable(students);
        System.out.println();
        
        System.out.println("<< Replacing Brooke with Pedro (has all 0's) >>\n");
        replaceStudent(students, "Brooke", "Pedro", new int[]{0, 0, 0, 0, 0});
        printTable(students);
        System.out.println();
        
        System.out.println("<< Inserting Jaeivan with previous grades before Pedro >>\n");
        insertBefore(students, "Pedro", "Jaeivan", new int[]{70, 70, 70, 70, 70});
        printTable(students);
        System.out.println();
        
        System.out.println("<< Deleting Sami >>\n");
        delete(students, "Sami");
        printTable(students);
        System.out.println();
    }
    
    public static void printTable(ArrayList<Student> students){
        printCenter("Gradebook", 60, true);
        printRepeated("-", 60, true);
        System.out.printf("%10s%10s%10s%10s%10s%10s%n", "Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        printRepeated("-", 60, true);
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
    
    public static void replaceName(ArrayList<Student> students, String currentName, String newName){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(currentName)){
                students.get(i).setName(newName);
                break;
            }
        }
    }
    
    public static void replaceGrade(ArrayList<Student> students, String name, int quizNumber, int newGrade){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(name)){
                students.get(i).setQuiz(quizNumber, newGrade);
                break;
            }
        }
    }
    
    public static void replaceStudent(ArrayList<Student> students, String find, String name, int[] quizScores){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(find)){
                students.set(i, new Student(name, quizScores));
                break;
            }
        }
    }
    
    public static void insertBefore(ArrayList<Student> students, String find, String name, int[] quizScores){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(find)){
                students.add(i, new Student(name, quizScores));
                break;
            }
        }
    }
    
    public static void delete(ArrayList<Student> students, String name){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(name)){
                students.remove(i);
                break;
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
