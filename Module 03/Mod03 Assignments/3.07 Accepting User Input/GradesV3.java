
/**
 * Program that calculates total points and average grade of a student
 *
 * @author Bhaskar Mishra
 * @version 6/11/2018
 */
import java.util.Scanner;

public class GradesV3{
    static int numTests = 0;
    static int testGrade = 0;
    static int totalPoints = 0;
    static double average = 0.0;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = in.next();
        name += in.nextLine();
        System.out.print("How many tests do you want to average?: ");
        int totalTests = in.nextInt();
        int[] testScores = new int[totalTests];
        System.out.println();
        
        for(int i = 1; i <= totalTests; i++){
            System.out.print("Enter Test Score " + i + " (0-100): ");
            testScores[i - 1] = in.nextInt();
        }
        System.out.println();
        
        for(int i = 0; i < totalTests; i++){
            updateTestData(testScores[i]);
        }
        System.out.print("\n" + name +", your total score is " + totalPoints + " and your average test score is " + average);
    }
    
    static void updateTestData(int newTestGrade){
        testGrade = newTestGrade;
        numTests++;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
    }
}
