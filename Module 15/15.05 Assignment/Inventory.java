
/**
 * Client class to manage inventory
 *
 * @author Bhaskar Mishra
 * @version 2/17/2019
 */

import java.util.ArrayList;

public class Inventory{
    static ArrayList<Product> products = new ArrayList<Product>(5);
    
    public static void main(String[] args){
        TempestDjinn djinn = new TempestDjinn("Tempest Djinn", 1.61);
        Mortify mortify = new Mortify("Mortify", 0.96);
        Water kirkland = new Water("Water Bottles", 34.99);
        Water aquafina = new Water("Water Bottles", 23.80);
        Water dasani = new Water("Water Bottles", 29.95);
        
        products.add(djinn);
        products.add(mortify);
        products.add(kirkland);
        products.add(aquafina);
        products.add(dasani);
        
        printCenter("Inventory", 50, true);
        printRepeated("-", 50, true);
        
        takeInventory("Tempest Djinn");
        takeInventory("Mortify");
        takeInventory("Water Bottles");
        
        System.out.println("\n");
        printCenter("Comparing Water", 50, true);
        printRepeated("-", 50, true);
        
        if(getNthWater(1).compareTo(getNthWater(2)) < 0){
            System.out.println("The first box of water bottles costs less than the second box of water bottles");
        }else if(getNthWater(1).compareTo(getNthWater(2)) == 0){
            System.out.println("The first box of water bottles has the same price as the second box of water bottles");
        }else{
            System.out.println("The first box of water bottles costs more than the second box of water bottles");
        }
    }
    
    //Gets nth water object in list
    private static Water getNthWater(int n){
        int count = 0;
        for(Product product : products){
            if(product instanceof Water){
                count++;
                if(count >= n){
                    return (Water)product;
                }
            }
        }
        return null;
    }
    
    private static void takeInventory(String name){
        int count = 0;
        double totalCost = 0;
        for(Product product : products){
            if(product.getName() == name){
                count++;
                totalCost += product.getCost();
            }
        }
        System.out.printf("%15s Quantity = %d, Total cost = $%.2f%n", name + ":", count, totalCost);
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
