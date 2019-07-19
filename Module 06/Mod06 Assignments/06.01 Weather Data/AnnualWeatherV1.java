/**
 * Annual Weather description:
 * 
 * @author Bhaskar Mishra
 * @version 6/29/2018
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1{
    public static void main (String [ ] args){
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        
        System.out.print("Choose Temperature System (F for Farenheit - C for Celcius): ");
        boolean celcius = in.next().equalsIgnoreCase("C");
        in.nextLine();
        
        System.out.print("Choose Precipitation Units (I for Inches - C for Centimeters: ");
        boolean centimeters = in.next().equalsIgnoreCase("C");
        in.nextLine();
        
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        
        String city = "Apalachicola";
        String state = "FL";
        double [] temperature = {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};
        double [] precipitation = {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};
        
        //String city = "Daytona Beach";
        //String state = "FL";
        //double [] temperature = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};
        //double [] precipitation = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};
        
        if(celcius){
            for(int i = 0; i < temperature.length; i++){
                temperature[i] = (temperature[i] - 32) * (5.0/9);
            }
        }
        
        if(centimeters){
            for(int i = 0; i < precipitation.length; i++){
                precipitation[i] *= 2.54;
            }
        }
        
        String tempLabel = celcius ? "C" : "F";
        String precipLabel = centimeters ? "cm." : "in.";
    
        double avgTemp = 0;
        double totalPrecipitation = 0;
        
        //Processing - calculate average temperature and total precipitation
        for(int i = 0; i < temperature.length; i++){
            avgTemp += temperature[i];
            totalPrecipitation += precipitation[i];
        }
        avgTemp /= temperature.length;
        
        //Output: display table of weather data including average and total
        System.out.println();
        printCenter("Weather Data", 50);
        printCenter("Location: " + city +", " + state, 50);
        System.out.printf("%-10s%-20s%-20s%n", "Month", "Temperature (" + tempLabel + ")", "Precipitation (" + precipLabel + ")");
        printRepeated("*", 50, true);
        for(int i = 0; i < temperature.length; i++){
            System.out.printf("%-10s%-20.1f%4.1f%16s%n", month[i], temperature[i], precipitation[i], "");
        }
        printRepeated("*", 50, true);
        System.out.printf("%14s%20s", String.format("Average: %.1f", avgTemp), String.format("Annual: %.1f", totalPrecipitation));

    }
    
    private static void printCenter(String str, int fieldWidth){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s%n", str, "");
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
