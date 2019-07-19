
/**
 * Create a class that calculates the distance travelled by a car in both miles and kilometers given speed (mph)
 * and time (hrs)
 *
 * @author Bhaskar Mishra
 * @version 7/28/2018
 */
public class CarV3{
    double speed; //Speed in mph
    double time; //Time in hrs
    double dist; //Distance in Miles -- Will be calculated
    double distKm; //Distance in Kilometers -- Will be calculated
    
    //Default Constructor
    public CarV3(){
    
    }
    
    public static void main(String[] args){
        CarV3 car = new CarV3();
        car.speed = 60;
        car.time = 2.5;
        car.dist = car.calcDist(car.speed, car.time);
        car.distKm = car.miToKm(car.dist);
        car.printResults();
    }
    
    //Returns distance in miles given speed in miles/hour and time in hours
    public double calcDist(double speed, double time){
        return speed * time;
    }
    
    //Converts miles to kilometers
    public double miToKm(double miles){
        return miles * 1.60934;
    }
    
    public void printResults(){
        printCenter("Car Distance Calculator", 100, true);
        printRepeated("-", 100, true);
        System.out.printf("%25s%25s%25s%25s%n", "Speed (mph)", "Time (hrs)", "Distance (mi)", "Distance (km)");
        System.out.printf("%25.2f%25.2f%25.2f%25.2f%n", speed, time, dist, distKm);
    }
    
    private void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    private void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
}
