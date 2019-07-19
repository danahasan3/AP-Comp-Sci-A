
/**
 * Tester class for Candidate class. Uses standard arrays
 *
 * @author Bhaskar Mishra
 * @version 3/16/2019
 */
public class ElectionTesterV3{
    private static Candidate[] candidates = new Candidate[5];
    
    public static void main(String[] args){
        candidates[0] = new Candidate("Bhaskar", 9999);
        candidates[1] = new Candidate("Michael", 9998);
        candidates[2] = new Candidate("Bob", 1);
        candidates[3] = new Candidate("Arjun", 0);
        candidates[4] = new Candidate("Jugenmujugenmugokonosurike kaijarisugesugematsufunfaimatsufuraimatsukurune tokoronisumiyapparikojiyapparikoji baibobaibobaiboshuringashuringanugurindai gurindainobomboribombonanojoukyuumechousuke", 10000);
        
        System.out.println("Original Results:\n");
        createTable();
        
        System.out.println("\n<<Changing Bob to Steven>>\n");
        replaceName(candidates, "Bob", "Steven");
        createTable();
        
        System.out.println("\n<<Changing Arjun's votes to 1>>\n");
        replaceVotes(candidates, "Arjun", 1);
        createTable();
        
        System.out.printf("%n<<Changing %s to \"Dude with long name\" and 500 votes>>%n", candidates[4].getName());
        System.out.println();
        replaceNameAndVotes(candidates, candidates[4].getName(), "Dude with long name", 500);
        createTable();
    }
    
    public static void printRawData(){
        System.out.println("Raw Election Data:\n");
        for(int i = 0; i < candidates.length; i++){
            System.out.println(candidates[i].toString());
        }
        System.out.println();
    }
    
    public static int calcTotalVotes(){
        int total = 0;
        for(int i = 0; i < candidates.length; i++){
            total += candidates[i].getVotes();
        }
        return total;
    }
    
    public static void createTable(){
        System.out.printf("%-30s%-20s%-20s%n", "Candidate", "Votes Received", "Percent of Total Votes");
        printRepeated("-", 75, true);
        int totalVotes = calcTotalVotes();
        for(int i = 0; i < candidates.length; i++){
            String name = candidates[i].getName();
            if(name.length() > 29){
                name = name.substring(0, 26) + "...";
            }
            System.out.printf("%-30s%-20d%5.2f%%%n", name, candidates[i].getVotes(), 100*candidates[i].getVotes()/(double)totalVotes);
        }
        System.out.println();
        System.out.printf("Total number of votes cast in election: %d%n", calcTotalVotes());
    }
    
    public static void replaceName(Candidate[] candidates, String find, String replacement){
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i].getName().equals(find)){
                candidates[i].setName(replacement);
            }
        }
    }
    
    public static void replaceVotes(Candidate[] candidates, String find, int replacementVotes){
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i].getName().equals(find)){
                candidates[i].setVotes(replacementVotes);
            }
        }
    }
    
    public static void replaceNameAndVotes(Candidate[] candidates, String find, String replacementName, int replacementVotes){
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i].getName().equals(find)){
                candidates[i].setName(replacementName);
                candidates[i].setVotes(replacementVotes);
            }
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
