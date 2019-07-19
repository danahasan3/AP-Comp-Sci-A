
/**
 * Tester class for Frequency Analysis
 *
 * @author Bhaskar Mishra
 * @version 11/18/2018
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class FrequencyAnalysisTester{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of text file to analyze (without .txt): ");
        String fileName = sc.next();
        sc.nextLine();
        
        File file = new File(fileName + ".txt");
        
        int[] frequencies = FrequencyAnalysis.analyze(file);
        
        int sum = 0;
        for(int i : frequencies){
            sum += i;
        }
        
        System.out.println();
        
        PrintWriter outFile = new PrintWriter(new File(fileName + "Freq.txt"));
        
        System.out.println("Frequency Analysis:");
        outFile.println("Frequency Analysis:");
        
        System.out.printf("%-10s%-10s%-11s%n", "Letter", "Count", "Frequency");
        outFile.printf("%-10s%-10s%-11s%n", "Letter", "Count", "Frequency");
        for(int i = 0; i < 26; i++){
            System.out.printf("%-10s%-10d%5.2f%%%n", (char)((int)('A') + i), frequencies[i], (double)frequencies[i]/sum*100);
            outFile.printf("%-10s%-10d%5.2f%%%n", (char)((int)('A') + i), frequencies[i], (double)frequencies[i]/sum*100);
        }
        
        outFile.close();
    }
}
