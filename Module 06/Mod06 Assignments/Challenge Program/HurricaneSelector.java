
/**
 * PURPOSE: Calculate the average category, pressure, and wind speed of Atlantic hurricanes that
 *          have occured in a given year range.
 *
 * @author Bhaskar Mishra
 * @version 6/29/2018
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class HurricaneSelector{
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
            hurricanes.get(i).windSpeed *= 1.15078;
            double windSpeed = hurricanes.get(i).windSpeed;
            if(windSpeed <=95){
                hurricanes.get(i).category = 1;
            }else if(windSpeed <= 110){
                hurricanes.get(i).category = 2;
            }else if(windSpeed <= 129){
                hurricanes.get(i).category = 3;
            }else if(windSpeed <= 156){
                hurricanes.get(i).category = 4;
            }else{
                hurricanes.get(i).category = 5;
            }
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
            if(hurricanes.get(indexStart).year >= yearStart){
                found = true;
            }else{
                indexStart++;
                if(indexStart >= hurricanes.size()){
                    break;
                }
            }
        }
        
        if(found == false){
            System.err.println("There were no hurricanes in the given range");
            return;
        }
        
        int indexEnd = hurricanes.size() - 1;
        found = false;
        while(!found){
            if(hurricanes.get(indexEnd).year <= yearEnd){
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
            
            totalCategory += h.category;
            totalPressure += h.pressure;
            totalWindSpeed += h.windSpeed;
            
            maxCategory = max(maxCategory, h.category);
            maxPressure = max(maxPressure, h.pressure);
            maxWindSpeed = max(maxWindSpeed, h.windSpeed);
            
            minCategory = min(minCategory, h.category);
            minPressure = min(minPressure, h.pressure);
            minWindSpeed = min(minWindSpeed, h.windSpeed);
            
            categoryCounts[h.category - 1]++;
        }
        
        double avgCategory = (double)totalCategory / totalCount;
        double avgPressure = (double)totalPressure / totalCount;
        double avgWindSpeed = (double)totalWindSpeed / totalCount;
        
        ///////////////////////////////////////////////////////////////////////////////
        //  Display Analysis
        ///////////////////////////////////////////////////////////////////////////////
        
        System.out.println();
        printCenter(String.format("Hurricanes %d - %d", yearStart, yearEnd), 90, true);
        System.out.println();
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        printRepeated("=", 90, true);
        for(int i = indexStart; i <= indexEnd; i++){
            Hurricane h = hurricanes.get(i);
            System.out.printf("%-10d%-20s%-20d%4d%22.2f%14s%n", h.year, h.name, h.category, h.pressure, h.windSpeed, "");
        }
        printRepeated("=", 90, true);
        printCenter("Average:", 30, false);
        System.out.printf("%-20.1f%6.1f%14s%6.2f%14s%n", avgCategory, avgPressure, "", avgWindSpeed, "");
        printCenter("Minimum:", 30, false);
        System.out.printf("%-20d%4d%22.2f%14s%n", minCategory, minPressure, minWindSpeed, "");
        printCenter("Maximum:", 30, false);
        System.out.printf("%-20d%4d%22.2f%14s%n%n", maxCategory, maxPressure, maxWindSpeed, "");
        System.out.println("Summary of Categories:");
        for(int i = 0; i < 5; i++){
            System.out.printf("%6s %1d: %2d%n", "Cat", i + 1, categoryCounts[i]);
        }
        
        ///////////////////////////////////////////////////////////////////////////////
        //  Write Summary Statistics To New Text File
        ///////////////////////////////////////////////////////////////////////////////
        
        PrintWriter writer = new PrintWriter(new File("summary.txt"));
        writer.println("Summary of Categories:");
        for(int i = 0; i < 5; i++){
            writer.printf("%6s %1d: %2d%n", "Cat", i + 1, categoryCounts[i]);
        }
        writer.close();
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

class Hurricane{
    public int year;
    public String month;
    public double windSpeed;
    public int pressure;
    public String name;
    public int category;
    
    public Hurricane(int year, String month, double windSpeed, int pressure, String name){
        this.year = year;
        this.month = month;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.name = name;
    }
}
