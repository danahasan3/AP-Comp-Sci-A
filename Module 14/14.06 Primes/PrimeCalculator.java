
/**
 * Calculates primes in a given range
 *
 * @author Bhaskar Mishra
 * @version 11/4/2018
 */

import java.util.ArrayList;

public class PrimeCalculator{
    int lower;
    int upper;
    
    /**
     * Constructor that sets lower and upper bounds for PrimeCalculator
     * @param lower Lower bound of Primes
     * @param upper Upper bound of Primes
     * Precondition: lower and upper are positive values
     */
    public PrimeCalculator(int lower, int upper){
        this.lower = lower;
        this.upper = upper;
    }
    
    /**
     * Function that determines whether a given number is a prime or not
     * @param n Number that needs to be checekd
     * @return true if n is prime, false otherwise
     * Precondition: n must be positive
     */
    private boolean isPrime(int n){
        for(int i = 2; i*i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Function that calculates all primes between lower and upper (inclusive)
     * @return ArrayList with all primes between lower and upper (inclusive)
     */
    public ArrayList<Integer> getPrimes(){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = lower; i <= upper; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
}
