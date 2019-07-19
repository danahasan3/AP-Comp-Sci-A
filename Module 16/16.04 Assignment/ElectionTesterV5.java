
/**
 * Write a description of class ElectionTesterV5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectionTesterV5{
    private static Candidate[] candidates = new Candidate[5];
    
    public static void main(String[] args){
        candidates[0] = new Candidate("Bhaskar", 9999);
        candidates[1] = new Candidate("Michael", 9998);
        candidates[2] = new Candidate("Bob", 1);
        candidates[3] = new Candidate("Arjun", 0);
        candidates[4] = new Candidate("Jugenmujugenmugokonosurike kaijarisugesugematsufunfaimatsufuraimatsukurune tokoronisumiyapparikojiyapparikoji baibobaibobaiboshuringashuringanugurindai gurindainobomboribombonanojoukyuumechousuke", 10000);
        
        System.out.println("Original Results:\n");
        createTable();
        
        System.out.println("\n<<Inserting Steven with 628 votes at position 3>>\n");
        insert(candidates, 3, "Steven", 628);
        createTable();
        
        System.out.println("\n<<Inserting Corgi with 100000 votes before Steven>>\n");
        insertBefore(candidates, "Steven", "Corgi", 100000);
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
            if(candidates[i] == null){
                break;
            }
            total += candidates[i].getVotes();
        }
        return total;
    }
    
    public static void createTable(){
        System.out.printf("%-30s%-20s%-20s%n", "Candidate", "Votes Received", "Percent of Total Votes");
        printRepeated("-", 75, true);
        int totalVotes = calcTotalVotes();
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] == null){
                break;
            }
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
            if(candidates[i] == null){
                break;
            }
            if(candidates[i].getName().equals(find)){
                candidates[i].setName(replacement);
                break;
            }
        }
    }
    
    public static void replaceVotes(Candidate[] candidates, String find, int replacementVotes){
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] == null){
                break;
            }
            if(candidates[i].getName().equals(find)){
                candidates[i].setVotes(replacementVotes);
                break;
            }
        }
    }
    
    public static void replaceNameAndVotes(Candidate[] candidates, String find, String replacementName, int replacementVotes){
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] == null){
                break;
            }
            if(candidates[i].getName().equals(find)){
                candidates[i].setName(replacementName);
                candidates[i].setVotes(replacementVotes);
                break;
            }
        }
    }
    
    public static void insert(Candidate[] candidates, int position, String name, int votes){
        if(position > 0 && candidates[position - 1] == null){
            return;
        }
        if(position >= 0 && position < candidates.length){
            for(int i = candidates.length - 1; i > position; i--){
                candidates[i] = candidates[i - 1];
            }
            candidates[position] = new Candidate(name, votes);
        }
    }
    
    public static void insertBefore(Candidate[] candidates, String find, String name, int votes){
        int position = -1;
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] == null){
                break;
            }
            if(candidates[i].getName().equals(find)){
                position = i;
                break;
            }
        }
        insert(candidates, position, name, votes);
    }
    
    public static void delete(Candidate[] candidates, int position){
        if(position > 0 && position < candidates.length){
            for(int i = position; i < candidates.length - 1; i++){
                candidates[i] = candidates[i + 1];
            }
            candidates[candidates.length - 1] = null;
        }
    }
    
    public static void deleteName(Candidate[] candidates, String find){
        int location = -1;
        
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] != null && candidates[i].getName().equals(find)){
                location = i;
                break;
            }else if(candidates[i] == null){
                break;
            }
        }
        
        delete(candidates, location);
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
