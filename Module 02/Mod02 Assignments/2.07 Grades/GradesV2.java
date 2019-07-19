
/**
 * Program that calculates total points and average grade of a student
 *
 * @author Bhaskar Mishra
 * @version 6/11/2018
 */
public class GradesV2{
    static int numTests = 0;
    static int testGrade = 0;
    static int totalPoints = 0;
    static double average = 0.0;
    
    public static void main(String[] args){
        updateTestData(95);
        updateTestData(73);
        updateTestData(91);
        updateTestData(82);
        updateTestData(99);
        updateTestData(98);
        updateTestData(97);
        updateTestData(96);
        updateTestData(94);
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
