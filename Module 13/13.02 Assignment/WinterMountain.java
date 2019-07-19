 /**
 * This class defines a basic Winter Mountain.
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */

public class WinterMountain extends Mountain{
    private double temp;
    
    public WinterMountain(int l, int w, int mountains, double temp){
        super(l, w, mountains);
        this.temp = temp;
    }
    
    public double getTemp(){
        return temp;
    }
    
    public String toString(){
        return String.format("Winter Mountain Land has dimensions %d X %d and has %d mountains and temperature %.2f", getLength(), getWidth(), getMountains(), temp);
    }
}
