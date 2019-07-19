
/**
 * Class to test CarV7 class
 *
 * @author Bhaskar Mishra
 * @version 7/28/2018
 */

public class CarV7Tester{
    public static void main(String[] args){
        final int numCars = 10;
        
        //Create CarV7 objects
        CarV7[] cars = new CarV7[numCars];
        for(int i = 0; i < numCars; i++){
            cars[i] = new CarV7(Math.floor(Math.random() * 100), Math.floor(Math.random() * 10));
        }
        
        //Print Results
        printCenter("Car Distance Calculator", 100, true);
        printRepeated("-", 100, true);
        System.out.printf("%25s%25s%25s%25s%n", "Speed (mph)", "Time (hrs)", "Distance (mi)", "Distance (km)");
        for(int i = 0; i < numCars; i++){
            System.out.printf("%25.2f%25.2f%25.2f%25.2f%n", cars[i].getSpeed(), cars[i].getTime(), cars[i].calcDist(), cars[i].calcDist("km"));
        }
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
}
