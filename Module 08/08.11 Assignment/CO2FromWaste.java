
/**
 * Calculate net pounds of CO2 released by a household given the number of people and the
 * types of waste they recycle.
 *
 * @author Bhaskar Mishra
 * @version 7/30/2018
 */
public class CO2FromWaste{
    private int numPeople;
    private boolean paper, plastic, glass, cans;
    private double grossWasteEmission;
    private double wasteReduction;
    private double netWasteEmission;
    
    /**
     * Constructor for CO2FromWaste class
     * @param numPeople number of people living in household
     * @param paper whether or not the household recycles paper
     * @param plastic whether or not the household recycles plastic
     * @param glass whether or not the household recycles glass
     * @param cans whether or not the household recycles cans
     * Precondition: numPeople is positive
     */
    public CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans){
        this.numPeople = numPeople;
        this.paper = paper;
        this.plastic = plastic;
        this.glass = glass;
        this.cans = cans;
    }
    
    /**
     * Mutator method that calculates the Gross Waste Emission produced by the household
     */
    public void calcGrossWasteEmission(){
        grossWasteEmission = 1018 * numPeople;
    }
    
    /**
     * Mutator method that calculates the amount of Waste that is reduced by the household due to recycling
     */
    public void calcWasteReduction(){
        wasteReduction = (paper ? 184 * numPeople : 0)
                       + (plastic ? 25.6 * numPeople : 0)
                       + (glass ? 46.6 * numPeople : 0)
                       + (cans ? 165.8 * numPeople : 0);
    }
    
    /**
     * Mutator method that calculates the Net Waste Emission produced by the household
     */
    public void calcNetWasteEmission(){
        netWasteEmission = grossWasteEmission - wasteReduction;
    }
    
    /**
     * Getter method that returns the number of people living in the household
     */
    public int getNumPeople(){
        return numPeople;
    }
    
    /**
     * Getter method that returns an array of booleans for the types of waste the household recycled
     * @return boolean array in the format {paper, plastic, glass, cans}
     */
    public boolean[] getTypesRecycled(){
        return new boolean[]{paper, plastic, glass, cans};
    }
    
    /**
     * Getter method that returns the Gross Waste Emission produced by the household
     */
    public double getGrossWasteEmission(){
        return grossWasteEmission;
    }
    
    /**
     * Getter method that returns the amount of Waste reduced by the household due to recycling
     */
    public double getWasteReduction(){
        return wasteReduction;
    }
    
    /**
     * Getter method that returns the Net Waste Emission produced by the household
     */
    public double getNetWasteEmission(){
        return netWasteEmission;
    }
}
