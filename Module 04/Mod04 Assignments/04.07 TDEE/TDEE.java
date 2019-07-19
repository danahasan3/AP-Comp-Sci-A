
/**
 * Calculate the total daily energy expenditure (TDEE) of an individual given BMR, gender, and activity level
 *
 * @author Bhaskar Mishra
 * @version 6/18/2018
 */

import java.util.Scanner;

public class TDEE{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.next();
        name += sc.nextLine();
        
        System.out.print("Enter your BMR: ");
        double BMR = Double.parseDouble(sc.next());
        sc.nextLine();
        
        System.out.print("Enter your gender (M/F): ");
        String gender = sc.next();
        sc.nextLine();
        
        System.out.println();
        System.out.println("Select your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        
        System.out.print("Enter the letter corresponding to your activity level: ");
        String activityLevel = sc.next();
        sc.nextLine();
        
        double activityFactor = 0.0;
        if(gender.equalsIgnoreCase("M")){
            if(activityLevel.equalsIgnoreCase("A")){
                activityFactor = 1.0;
            } else if(activityLevel.equalsIgnoreCase("B")){
                activityFactor = 1.3;
            } else if(activityLevel.equalsIgnoreCase("C")){
                activityFactor = 1.6;
            } else if(activityLevel.equalsIgnoreCase("D")){
                activityFactor = 1.7;
            } else if(activityLevel.equalsIgnoreCase("E")){
                activityFactor = 2.1;
            } else if(activityLevel.equalsIgnoreCase("F")){
                activityFactor = 2.4;
            } else{
                System.err.println("\nThis option does not exist.");
                return;
            }
        } else{
            if(activityLevel.equalsIgnoreCase("A")){
                activityFactor = 1.0;
            } else if(activityLevel.equalsIgnoreCase("B")){
                activityFactor = 1.3;
            } else if(activityLevel.equalsIgnoreCase("C")){
                activityFactor = 1.5;
            } else if(activityLevel.equalsIgnoreCase("D")){
                activityFactor = 1.6;
            } else if(activityLevel.equalsIgnoreCase("E")){
                activityFactor = 1.9;
            } else if(activityLevel.equalsIgnoreCase("F")){
                activityFactor = 2.2;
            } else{
                System.err.println("\nThis option does not exist.");
                return;
            }
        }
        
        double TDEE = BMR * activityFactor;
        
        System.out.println('\n');
        System.out.println("Your results:");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Gender: %s\n", gender.toUpperCase());
        System.out.printf("BMR: %.2f calories\n", BMR);
        System.out.printf("Activity Factor: %.1f\n", activityFactor);
        System.out.printf("TDEE: %.2f calories\n", TDEE);
    }
}
