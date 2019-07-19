
/**
 * PURPOSE: Use Monte Carlo sampling method to estimate the average number of animals observed before
 *          spotting one you are tracking within a particular ecosystem.
 *
 * @author Bhaskar Mishra
 * @version 6/19/2018
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class AnimalPopulation{
    public static void main(String[] args) throws IOException{
        //Collect raw data
        PrintWriter writer = new PrintWriter(new File("data.txt"));
        Scanner sc = new Scanner(System.in);
        
        int numTrials;
        while(true){
            System.out.print("How many trials do you want to simulate: ");
            numTrials = sc.nextInt();
            
            if(numTrials < 1000){
                System.out.println("\nPlease try again. Enter a number greater than 1000.\n");
            }else{
                System.out.println("\nSimulating...\n");
                break;
            }
        }
        
        for(int i = 0; i < numTrials; i++){
            int animalsSpotted = 0;
            while(true){
                int animal = (int)(Math.random() * 10) + 1;
                animalsSpotted++;
                if(animal == 10){
                    break;
                }
            }
            writer.println(animalsSpotted);
        }
        
        writer.close();
        
        //Process Data
        File file = new File("data.txt");
        Scanner sc2 = new Scanner(file);
        
        int totalAnimalsSpotted = 0;
        int totalTrials = 0;
        
        while(sc2.hasNext()){
            totalAnimalsSpotted += Integer.parseInt(sc2.next());
            totalTrials++;
        }
        
        double average = (double)totalAnimalsSpotted/totalTrials;
        
        System.out.println("The average number of squirrels observed until \nspotting a Fox Squirrel at the city park is: " + average);
        
        sc2.close();
    }
}
