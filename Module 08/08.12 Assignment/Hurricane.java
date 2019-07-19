
/**
 * Hurricane class
 *
 * @author Bhaskar Mishra
 * @version 7/31/2018
 */
public class Hurricane{
    private int year;
    private String month;
    private double windSpeed;
    private int pressure;
    private String name;
    private int category;
    
    public Hurricane(int year, String month, double windSpeed, int pressure, String name){
        this.year = year;
        this.month = month;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.name = name;
    }
    
    public void knotsToMPH(){
        windSpeed *= 1.15078;
    }
    
    public void calcCategory(){
        if(windSpeed <= 95){
            category = 1;
        }else if(windSpeed <= 110){
            category = 2;
        }else if(windSpeed <=129){
            category = 3;
        }else if(windSpeed <= 156){
            category = 4;
        }else{
            category = 5;
        }
    }
    
    public String toString(){
        return String.format("%-10d%-20s%-20d%4d%22.2f%14s", year, name, category, pressure, windSpeed, "");
    }
    
    public double getYear(){
        return year;
    }
    
    public String getMonth(){
        return month;
    }
    
    public double getWindSpeed(){
        return windSpeed;
    }
    
    public int getPressure(){
        return pressure;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCategory(){
        return category;
    }
}
