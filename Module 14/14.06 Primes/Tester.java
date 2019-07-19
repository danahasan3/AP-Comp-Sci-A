
/**
 * Tester class for PrimeCalculator
 *
 * @author Bhaskar Mishra
 * @version 11/4/2018
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Tester{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Prime Calculator!\n");
        System.out.print("Please enter a lower bound for your primes: ");
        
        int lower = sc.nextInt();
        
        System.out.print("Please enter an upper bound for your primes: ");
        
        int upper = sc.nextInt();
        
        PrimeCalculator calc = new PrimeCalculator(lower, upper);
        
        ArrayList<Integer> primes = calc.getPrimes();
        
        System.out.print("\nPrimes: ");
        for(Integer p : primes){
            System.out.print(p + " ");
        }
    }
}
