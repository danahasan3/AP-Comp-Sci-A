
/**
 * Estimate Pi by simulating darts being shot at a dartboard
 *
 * @author Bhaskar Mishra
 * @version 7/10/2018
 */

import java.util.Scanner;

public class EstimatePi{
    //Returns Estimation of Pi given P (Number of darts that shoot dartboard) and N (Total number of darts shot)
    static double estimatePi(long p, long n){
        return 4.0 * ((double)p/n);
    }
    
    //Runs dart simulation consisting of a certain number of trials and darts per trial.
    static double runSimulation(long numTrials, long dartsPerTrial){
        double avg = 0;
        for(long i = 0; i < numTrials; i++){
            long numHit = 0;
            for(long j = 0; j < dartsPerTrial; j++){
                double x = Math.random() * 2 - 1;
                double y = Math.random() * 2 - 1;
                if(Math.pow(x, 2) + Math.pow(y, 2) <= 1){
                    numHit++;
                }
            }
            double estimation = estimatePi(numHit, dartsPerTrial);
            avg += estimation / numTrials;
            System.out.printf("Trial #%d: pi = %.6f%n", i + 1, estimation);
        }
        
        return avg;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of trials: ");
        long numTrials = sc.nextLong();
        System.out.print("Enter the number of darts per trial: ");
        long dartsPerTrial = sc.nextLong();
        
        double avg = runSimulation(numTrials, dartsPerTrial);
        
        System.out.printf("%nFinal Estimation: pi = %.6f%n", avg);
    }
}
