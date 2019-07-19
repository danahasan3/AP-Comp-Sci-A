
/**
 * Class to test CarV8 class
 *
 * @author Bhaskar Mishra
 * @version 7/30/2018
 */

public class CarV8Tester{
    public static void main(String[] args){
        final int numCars = 10;
        
        //Create CarV8 objects
        CarV8[] cars = new CarV8[numCars];
        for(int i = 0; i < numCars; i++){
            cars[i] = new CarV8(Math.floor(Math.random() * 100), Math.floor(Math.random() * 10));
        }
        
        //Calculate Average/Minimum/Maximum
        double minDist = Double.MAX_VALUE;
        double minDistKm = Double.MAX_VALUE;
        double maxDist = Double.MIN_VALUE;
        double maxDistKm = Double.MIN_VALUE;
        double averageDist = 0;
        double averageDistKm = 0;
            
        for(int i = 0; i < numCars; i++){
            double dist = cars[i].calcDist();
            double distKm = cars[i].calcDist("km");
            
            minDist = min(minDist, dist);
            maxDist = max(maxDist, dist);
            averageDist += dist / numCars;
            minDistKm = min(minDistKm, distKm);
            maxDistKm = max(maxDistKm, distKm);
            averageDistKm += distKm / numCars;
        }
        
        //Print Results
        printCenter("Car Distance Calculator", 100, true);
        printRepeated("-", 100, true);
        System.out.printf("%25s%25s%25s%25s%n", "Speed (mph)", "Time (hrs)", "Distance (mi)", "Distance (km)");
        for(int i = 0; i < numCars; i++){
            System.out.print(cars[i].toString());
        }
        printRepeated("-", 100, true);
        System.out.printf("%67s%7.2f%25.2f%n", "Minimum:", minDist, minDistKm);
        System.out.printf("%67s%7.2f%25.2f%n", "Maximum:", maxDist, maxDistKm);
        System.out.printf("%67s%7.2f%25.2f%n", "Average:", averageDist, averageDistKm);
    }
    
    private static void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    private static void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
    
    private static double max(double a, double b){
        return a > b ? a : b;
    }
    
    private static double min(double a, double b){
        return a < b ? a : b;
    }
}
