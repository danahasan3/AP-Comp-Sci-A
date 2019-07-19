
/**
 * A car class that can calculate distance in various units given speed in mph and time in hours.
 *
 * @author Bhaskar Mishra
 * @version 7/28/2018
 */
public class CarV7{
    private double speed;
    private double time;
    
    public CarV7(double speed, double time){
        this.speed = speed;
        this.time = time;
    }
    
    //Calculates distance in miles
    public double calcDist(){
        return speed * time;
    }
    
    //Calculate distance in kilometers (km), miles (mi), meters (m), or feet (ft) based on unit parameter
    public double calcDist(String unit){
        if(unit.equalsIgnoreCase("km"))
            return speed * time * 1.60934;
        else if(unit.equalsIgnoreCase("mi"))
            return speed * time;
        else if(unit.equalsIgnoreCase("m"))
            return speed * time * 1609.34;
        else if(unit.equalsIgnoreCase("ft"))
            return speed * time * 5280;
        else{
            System.err.printf("%s unit unavailable", unit);
            return 0;
        }
            
    }
    
    //Get speed
    public double getSpeed(){
        return speed;
    }
    
    //Get time
    public double getTime(){
        return time;
    }
}
