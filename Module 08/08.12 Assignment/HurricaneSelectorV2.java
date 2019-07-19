import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Find all hurricanes that occured within a year range
 *
 * @author Bhaskar Mishra
 * @version 7/31/2018
 */
public class HurricaneSelectorV2{
    public static void main(String[] args) throws IOException{
        ///////////////////////////////////////////////////////////////////////////////
        //  Getting Data From File
        ///////////////////////////////////////////////////////////////////////////////
        
        File file = new File("hurricanedata.txt");
        String token;
        Scanner sc = new Scanner(file);
        
        ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>();
        
        while(sc.hasNextLine()){
            int year = sc.nextInt();
            String month = sc.next();
            int pressure = sc.nextInt();
            int windSpeed = sc.nextInt();
            String name = sc.next();
            hurricanes.add(new Hurricane(year, month, windSpeed, pressure, name));
        }
        
        sc.close();
        
        ///////////////////////////////////////////////////////////////////////////////
        //  Convert Wind Speed from Knots to MPH and calculate Hurricane Category
        ///////////////////////////////////////////////////////////////////////////////
        
        for(int i = 0; i < hurricanes.size(); i++){
            hurricanes.get(i).knotsToMPH();
            hurricanes.get(i).calcCategory();
        }
        
        ///////////////////////////////////////////////////////////////////////////////
        //  Get Range of Years
        ///////////////////////////////////////////////////////////////////////////////
        
        sc = new Scanner(System.in);
        
        System.out.print("Enter starting year: ");
        int yearStart = sc.nextInt();
        
        System.out.print("Enter ending year: ");
        int yearEnd = sc.nextInt();
        
        int indexStart = 0;
        boolean found = false;
        while(!found){
            if(hurricanes.get(indexStart).getYear() >= yearStart){
                found = true;
            }else{
                indexStart++;
                if(indexStart >= hurricanes.size()){
                    break;
                }
            }
        }
        
        if(found = false){
            System.err.println("There were no hurricanes in the given range");
            return;
        }
        
        int indexEnd = hurricanes.size() - 1;
        found = false;
        while(!found){
            if(hurricanes.get(indexEnd).getYear() <= yearEnd){
                found = true;
            }else{
                indexEnd--;
                if(indexEnd < 0){
                    break;
                }
            }
        }
        
        if(found == false){
            System.err.println("There were no hurricanes in the given range");
            return;
        }
        
        if(indexStart > indexEnd){
            System.err.println("Starting year is greater than ending year");
            return;
        }
        
        ///////////////////////////////////////////////////////////////////////////////
        //  Analyze Data
        ///////////////////////////////////////////////////////////////////////////////
        
        int totalCount = indexEnd - indexStart + 1;
        int totalCategory = 0;
        double totalWindSpeed = 0;
        int totalPressure = 0;
        int maxCategory = Integer.MIN_VALUE;
        double maxWindSpeed = Integer.MIN_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        int minCategory = Integer.MAX_VALUE;
        double minWindSpeed = Integer.MAX_VALUE;
        int minPressure = Integer.MAX_VALUE;
        int[] categoryCounts = {0, 0, 0, 0, 0};
        
        for(int i = indexStart; i <= indexEnd; i++){
            Hurricane h = hurricanes.get(i);
            
            totalCategory += h.getCategory();
            totalPressure += h.getPressure();
            totalWindSpeed += h.getWindSpeed();
            
            maxCategory = max(maxCategory, h.getCategory());
            maxPressure = max(maxPressure, h.getPressure());
            maxWindSpeed = max(maxWindSpeed, h.getWindSpeed());
            
            minCategory = min(minCategory, h.getCategory());
            minPressure = min(minPressure, h.getPressure());
            minWindSpeed = min(minWindSpeed, h.getWindSpeed());
            
            categoryCounts[h.getCategory() - 1]++;
        }
        
        double avgCategory = (double)totalCategory / totalCount;
        double avgPressure = (double)totalPressure / totalCount;
        double avgWindSpeed = (double)totalWindSpeed / totalCount;
        
        ///////////////////////////////////////////////////////////////////////////////
        //  Display Analysis
        ///////////////////////////////////////////////////////////////////////////////
        
        System.out.println();
        System.out.println(stringCenter(String.format("Hurricanes %d - %d", yearStart, yearEnd), 90, false));
        System.out.println();
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println(stringRepeated("=", 90, false));
        for(int i = indexStart; i <= indexEnd; i++){
            Hurricane h = hurricanes.get(i);
            System.out.println(h.toString());
        }
        System.out.println(stringRepeated("=", 90, false));
        System.out.printf("%s%-20.1f%6.1f%14s%6.2f%14s%n", stringCenter("Average:", 30, false), avgCategory, avgPressure, "", avgWindSpeed, "");
        System.out.printf("%s%-20d%4d%22.2f%14s%n", stringCenter("Minimum:", 30, false), minCategory, minPressure, minWindSpeed, "");
        System.out.printf("%s%-20d%4d%22.2f%14s%n%n", stringCenter("Maximum:", 30, false), maxCategory, maxPressure, maxWindSpeed, "");
        System.out.println("Summary of Categories:");
        for(int i = 0; i < 5; i++){
            System.out.printf("%6s %1d: %2d%n", "Cat", i + 1, categoryCounts[i]);
        }
    }
    
    private static String stringCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        return String.format("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    private static String stringRepeated(String str, int times, boolean newLine){
        String s = "";
        for(int i = 0; i < times; i++){
            s += str;
        }
        if(newLine){
            s += "\n";
        }
        return s;
    }
    
    private static int max(int a, int b){
        return a > b ? a : b;
    }
    
    private static double max(double a, double b){
        return a > b ? a : b;
    }
    
    private static int min(int a, int b){
        return a < b ? a : b;
    }
    
    private static double min(double a, double b){
        return a < b ? a : b;
    }
}
