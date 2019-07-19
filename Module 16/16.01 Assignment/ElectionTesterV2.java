
/**
 * Tester class for Candidate class. Uses standard arrays
 *
 * @author Bhaskar Mishra
 * @version 3/16/2019
 */

import java.util.ArrayList;

public class ElectionTesterV2{
    private static ArrayList<Candidate> candidates = new ArrayList<Candidate>(5);
    
    public static void main(String[] args){
        candidates.add(new Candidate("Bhaskar", 9999));
        candidates.add(new Candidate("Michael", 9998));
        candidates.add(new Candidate("Bob", 1));
        candidates.add(new Candidate("Arjun", 0));
        candidates.add(new Candidate("Jugenmujugenmugokonosurike kaijarisugesugematsufunfaimatsufuraimatsukurune tokoronisumiyapparikojiyapparikoji baibobaibobaiboshuringashuringanugurindai gurindainobomboribombonanojoukyuumechousuke", 10000));
        
        printRawData();
        System.out.println("Election Results:\n");
        createTable();
        System.out.printf("Total number of votes cast in election: %d", calcTotalVotes());
    }
    
    public static void printRawData(){
        System.out.println("Raw Election Data:\n");
        for(int i = 0; i < candidates.size(); i++){
            System.out.println(candidates.get(i).toString());
        }
        System.out.println();
    }
    
    public static int calcTotalVotes(){
        int total = 0;
        for(int i = 0; i < candidates.size(); i++){
            total += candidates.get(i).getVotes();
        }
        return total;
    }
    
    public static void createTable(){
        System.out.printf("%-30s%-20s%-20s%n", "Candidate", "Votes Received", "Percent of Total Votes");
        printRepeated("-", 75, true);
        int totalVotes = calcTotalVotes();
        for(int i = 0; i < candidates.size(); i++){
            String name = candidates.get(i).getName();
            if(name.length() > 29){
                name = name.substring(0, 26) + "...";
            }
            System.out.printf("%-30s%-20d%5.2f%%%n", name, candidates.get(i).getVotes(), 100*candidates.get(i).getVotes()/(double)totalVotes);
        }
        System.out.println();
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
