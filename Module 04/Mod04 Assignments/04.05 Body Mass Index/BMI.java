/**
 * Calculate Body Mass Index (BMI) of an individual given their height and weight
 *
 * @author Bhaskar Mishra
 * @version 6/18/2018
 */

import java.util.Scanner;

public class BMI{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name (E.g. - John Watson): ");
        String firstName = sc.next();
        String lastName = sc.next();
        sc.nextLine();
        
        System.out.print("What is your height in feet/inches (E.g. - 5 10): ");
        int heightFeet = Integer.parseInt(sc.next());
        int heightInches = Integer.parseInt(sc.next());
        sc.nextLine();
        
        System.out.print("What is your weight in pounds (E.g. - 100): ");
        int weightLbs = Integer.parseInt(sc.next());
        sc.nextLine();
        
        double heightMeters = 0.3048 * heightFeet + 0.0254 * heightInches;
        double weightKilograms = 0.4536 * weightLbs;
        double BMI = weightKilograms / (heightMeters * heightMeters);
        String category;
        if(BMI > 29.9){
            category = "Obese";
        }else if(BMI > 25.0){
            category = "Overweight";
        }else if(BMI > 18.5){
            category = "Normal or Healthy Weight";
        }else{
            category = "Underweight";
        }
        
        System.out.println();
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.printf("Height (m): %.2f\n", heightMeters);
        System.out.printf("Weight (kg): %.2f\n", weightKilograms);
        System.out.printf("BMI: %.2f\n", BMI);
        System.out.println("Category: " + category);
    }
}
