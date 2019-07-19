
/**
 * Class used to calculate distance travelled by a Kiwi when it is thrown at a certain angle with a certain speed
 *
 * @author Bhaskar Mishra
 * @version 8/4/2018
 */
public class Kiwi{
    private double speed; //Speed in meters per second
    private double theta; //Theta in radians
    private double distance; //Distance in meters
    private double distanceKm; //Distance in km
    
    public Kiwi(double speedKPH, double thetaDeg){
        this.speed = speedKPH * (1000.0/3600);
        this.theta = Math.toRadians(thetaDeg);
    }
    
    /**
     * Mutator method that calculates the distance travelled by the projectile given its speed and launch angle
     */
    public void calcDist(){
        distance = (Math.pow(speed, 2) * Math.sin(2 * theta))/9.81;
    }
    
    /**
     * Getter method that returns the distance travelled by the projectile
     * @return distance travelled by projectile
     */
    public double getDist(){
        return distance;
    }
}
