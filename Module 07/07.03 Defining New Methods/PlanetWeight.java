/**
 * Determine the surface gravity on each planet in our solar system
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PlanetWeight{
    static double modifiedWeight(double W, double sg){
        return (W * sg)/9.8;
    }
    
    static void dispData(String[] planets, double[] sg, double[] W){
        printCenter("My Weight on the Planets", 50, true);
        printRepeated("-", 50, true);
        System.out.printf("%15s%15s%20s%n", "Planet", "Gravity", "Weight (lbs)");
        printRepeated("-", 50, true);
        for(int i = 0; i < 8; i++){
            System.out.printf("%15s%15.2f%20.2f%n", planets[i], sg[i], W[i]);
        }
    }
    
    static void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    static void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws IOException{
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);
        
        double[] surfaceGravity = new double[8];
        for(int i = 0; i < 8; i++){
            surfaceGravity[i] = sc.nextDouble();
        }
        
        sc.close();
        sc = new Scanner(System.in);
        
        System.out.print("How much do you weigh: ");
        double weight = sc.nextDouble();
        
        double[] newWeights = new double[8];
        for(int i = 0; i < 8; i++){
            newWeights[i] = modifiedWeight(weight, surfaceGravity[i]);
        }
        
        dispData(planets, surfaceGravity, newWeights);
    }
}
