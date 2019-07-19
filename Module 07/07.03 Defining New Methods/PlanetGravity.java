/**
 * Determine the surface gravity on each planet in our solar system
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PlanetGravity{
    static double SG(double G, double M, double r){
        return (G * M)/Math.pow(r, 2);
    }
    
    static double kmToM(double dist){
        return dist * 1000;
    }
    
    static void dispData(String[] planets, double[] M, double[] D, double[] sg){
        printCenter("Planetary Data", 66);
        printRepeated("-", 66, true);
        System.out.printf("%15s |%15s |%15s |%15s%n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        printRepeated("-", 66, true);
        for(int i = 0; i < 8; i++){
            System.out.printf("%15s |%15.1f |%15.5g |%15f%n", planets[i], D[i], M[i], sg[i]);
        }
    }
    
    static void saveData(double[] sg) throws IOException{
        PrintWriter pw = new PrintWriter(new File("data.txt"));
        for(int i = 0; i < 8; i++){
            pw.println(sg[i]);
        }
        pw.close();
    }
    
    static void printCenter(String str, int fieldWidth){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s%n", str, "");
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
        double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double[] mass = {3.30E23, 4.869E24, 5.972E24, 6.4219E23, 1.900E27, 5.68E26, 8.683E25, 1.0247E26};
        final double G = 6.67E-11;
        
        double[] surfaceGravity = new double[8];
        
        for(int i = 0; i < 8; i++){
            surfaceGravity[i] = SG(G, mass[i], kmToM(diameter[i] / 2));
        }
        
        dispData(planets, mass, diameter, surfaceGravity);
        saveData(surfaceGravity);
    }
}
