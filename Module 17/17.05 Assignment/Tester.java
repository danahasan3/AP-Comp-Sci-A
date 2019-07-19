
/**
 * Tester class for Item class
 *
 * @author Bhaskar Mishra
 * @version 5/4/2019
 */
public class Tester{
    public static void main(String[] args){
        Item[] items = new Item[10];
        items[0] = new Item("Red Ball", 121, 10.00, 80);
        items[1] = new Item("Orange Ball", 034, 20.00, 30);
        items[2] = new Item("Yellow Ball", 432, 60.00, 50);
        items[3] = new Item("Green Ball", 827, 100.00, 1000);
        items[4] = new Item("Blue Ball", 444, 30.00, 10);
        items[5] = new Item("Indigo Ball", 110, 70.00, 40);
        items[6] = new Item("Violet Ball", 279, 14.00, 20);
        items[7] = new Item("White Ball", 918, 50.00, 50);
        items[8] = new Item("Black Ball", 170, 50.00, 50);
        items[9] = new Item("Tesseract", 789, 999999.00, 1);
        
        System.out.println();
        
        System.out.println("Original:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Insertion Sort, Sort by Name, Ascending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByName(items, 1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Insertion Sort, Sort by Name, Descending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByName(items, -1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Selection Sort, Sort by Product Number, Ascending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByProductNumber(items, 1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Selection Sort, Sort by Product Number, Descending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByProductNumber(items, -1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Merge Sort, Sort by Price, Ascending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByPrice(items, 0, items.length - 1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Selection Sort, Sort by Quantity, Ascending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByQuantity(items, 1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
        
        System.out.println("Selection Sort, Sort by Quantity, Descending:");
        printRepeated("-", 80, true);
        System.out.printf("%15s%17s%15s%15s%n", "NAME", "PRODUCT NO.", "PRICE", "QUANTITY");
        printRepeated("-", 80, true);
        sortByQuantity(items, -1);
        printItems(items);
        printRepeated("-", 80, true);
        System.out.println();
    }
    
    public static void printItems(Item[] items){
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i].toString());
        }
    }
    
    public static void sortByName(Item[] items, int direction){
        direction = (direction % 2)*2 - 1;
        for(int i = 1; i < items.length; i++){
            Item next = items[i].getCopy();
            int index = 0;
            for(int j = i - 1; j >= 0; j--){
                if(items[j].getName().compareTo(next.getName()) * direction > 0){
                    items[j + 1] = items[j].getCopy();
                }else{
                    index = j + 1;
                    break;
                }
            }
            items[index] = next;
        }
    }
    
    public static void sortByProductNumber(Item[] items, int direction){
        direction = (direction % 2)*2 - 1;
        for(int i = items.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if((items[k].getProductNumber()-items[posMax].getProductNumber()) * direction > 0){
                    posMax = k;
                }
            }
            Item temp = items[i];
            items[i] = items[posMax];
            items[posMax] = temp;
        }
    }
    
    public static void sortByPrice(Item[] items, int low, int high){
        if(low == high) 
            return;
        int mid = (low + high)/2;
        
        sortByPrice(items, low, mid);
        sortByPrice(items, mid + 1, high);
        
        sortByPriceMerge(items, low, mid, high);
    }
    
    public static void sortByPriceMerge(Item[] items, int low, int mid, int high){
        Item[] temp = new Item[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n++] = items[j++];
            }else if(j > high){
                temp[n++] = items[i++];
            }else if((items[i].getPrice() - items[j].getPrice()) < 0){
                temp[n++] = items[i++];
            }else{
                temp[n++] = items[j++];
            }
        }
        
        for(int k = low; k <= high; k++){
            items[k] = temp[k - low];
        }
    }
    
    public static void sortByQuantity(Item[] items, int direction){
        direction = (direction % 2)*2 - 1;
        for(int i = items.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if((items[k].getQuantity()-items[posMax].getQuantity()) * direction > 0){
                    posMax = k;
                }
            }
            Item temp = items[i];
            items[i] = items[posMax];
            items[posMax] = temp;
        }
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
