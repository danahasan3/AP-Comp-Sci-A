/**
 * @purpose:This class calculates the amount of CO2 released given the gallons of gas used
 * It contains mutator methods to calculate the amount of CO2 in tons and pounds
 * It contains getter methods to get the amount of gallons of gas used, tons of CO2 released, and pounds of CO2 released
 * Private instance variables include myGallonsUsed, myTonsCO2, and myPoundsCO2
 * @author Bhaskar Mishra
 * @version 7/30/2018
 */
public class CO2FootprintV2 {
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;
    
    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons The number of gallons of gas used.
     * Precondition: gallons is a positive value
     */
    CO2FootprintV2(double gallons){
        myGallonsUsed = gallons;
    }
    
    /**
     * Mutator method that calculates the number of tons of CO2 released in the atmosphere
     */
    public void calcTonsCO2(){
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method that calculates the number of pounds of CO2 relased in the atmosphere
     */
    public void convertTonsToPounds(){
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the number of gallons of gas used
     * @return gallons of gas used
     */
    public double getGallons(){
        return myGallonsUsed;
    }
    
    /**
     * Getter method to return the number of tons of CO2 released
     * @return tons of CO2 released
     */
    public double getTonsCO2(){
        return myTonsCO2;
    }

    /**
     * Getter method to return the number of pounds of CO2 released
     * @return pounds of CO2 released
     */
    public double getPoundsCO2(){
        return myPoundsCO2;
    }
}

