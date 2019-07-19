import java.util.ArrayList;

/**
 * Tests CO2FromWaste class
 *
 * @author Bhaskar Mishra
 * @version 7/30/2018
 */
public class CO2FromWasteTester{
    public static void main(String[] args){
        final int numHouseholds = 10;
        ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
        
        // Generate households
        for(int i = 0; i < numHouseholds; i++){
            households.add(new CO2FromWaste(randInt(1, 10), randBoolean(), randBoolean(), randBoolean(), randBoolean()));
        }
        
        // Run calculations
        for(int i = 0; i < numHouseholds; i++){
            households.get(i).calcGrossWasteEmission();
            households.get(i).calcWasteReduction();
            households.get(i).calcNetWasteEmission();
        }
        
        // Print results
        System.out.println("|       |        |                                 |          Pounds of CO2          |");
        System.out.println("|       |        |     Household Waste Recycled    |   Total  |           |    Net   |");
        System.out.println("| Index | People | Paper | Plastic | Glass |  Cans | Emission | Reduction | Emission |");
        System.out.println("|-------|--------|-------|---------|-------|-------|----------|-----------|----------|");
        
        for(int i = 0; i < numHouseholds; i++){
            CO2FromWaste household = households.get(i);
            boolean[] typesRecycled = household.getTypesRecycled();
            System.out.printf("|%6d |%7d |%6s |%8s |%6s |%6s |%9.2f |%10.2f |%9.2f |%n", i
                                                                               , household.getNumPeople()
                                                                               , typesRecycled[0]
                                                                               , typesRecycled[1]
                                                                               , typesRecycled[2]
                                                                               , typesRecycled[3]
                                                                               , household.getGrossWasteEmission()
                                                                               , household.getWasteReduction()
                                                                               , household.getNetWasteEmission());
        }
    }
    
    /**
     * Returns random integer in the interval [min, max]
     * @param min minimum value of random integer
     * @param max maximum value of random integer
     */
    private static int randInt(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    
    /**
     * Returns random boolean
     */
    private static boolean randBoolean(){
        return (int)(Math.random() * 2) == 1 ? true: false;
    }
    
    /**
     * Prints string surrounded by space characters such that the original is at the center
     * @param str string that needs to be centered
     * @param fieldWidth amount of characters in which the string needs to be centered
     * @param newLine whether or not to add \n character at the end of the string
     */
    private static void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    /**
     * Prints a certain string repeatedly
     * @param str string that needs to be repeated
     * @param times number of times the string needs to be repeated
     * @param newLine whether or not to print a \n character at the end
     */
    private static void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
}
