
/**
 * Tester class for Music class
 *
 * @author Bhaskar Mishra
 * @version 5/4/2019
 */
public class TesterV1{
    public static void main(String[] args){
        Music[] songs = new Music[10];
        songs[0] = new Music("In The End", 2003, "Linkin Park");
        songs[1] = new Music("Hikari e", 2012, "Miwa");
        songs[2] = new Music("Kataomoi", 2016, "Aimer");
        songs[3] = new Music("Baralku", 2017, "Emancipator");
        songs[4] = new Music("Reine", 2015, "il:lo");
        songs[5] = new Music("Nandemonaiya", 2016, "Radwimps");
        songs[6] = new Music("This Too Shall Pass", 2010, "OK Go");
        songs[7] = new Music("Destiny", 2019, "Neffex");
        songs[8] = new Music("Shelter", 2016, "Porter Robinson");
        songs[9] = new Music("Battle for Camelot", 2015, "Tartalo Music");
        
        printRepeated("-", 80, true);
        System.out.println("Song List:");
        printRepeated("-", 80, true);
        printSongs(songs);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Title \"Nandemonaiya\": ");
        printRepeated("-", 80, true);
        findTitle(songs, "Nandemonaiya");
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Year 2016: ");
        printRepeated("-", 80, true);
        findYear(songs, 2016);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Artist \"Miwa\": ");
        printRepeated("-", 80, true);
        findArtist(songs, "Miwa");
        System.out.println();
    }
    
    public static void printSongs(Music[] songs){
        for(int i = 0; i < songs.length; i++){
            System.out.println(songs[i].toString());
        }
    }
    
    public static void findTitle(Music[] songs, String title){
        int found = -1;
        for(int i = 0; i < songs.length; i++){
            if(songs[i].getTitle().compareTo(title) == 0){
                found = i;
                break;
            }
        }
        
        if(found != -1){
            System.out.println("Found " + title + " in song list: ");
            System.out.println(songs[found]);
        }else{
            System.out.println(title + " not found in song list");
        }
    }
    
    public static void findYear(Music[] songs, int year){
        int found = 0;
        System.out.println("Search results:");
        for(int i = 0; i < songs.length; i++){
            if(songs[i].getYear() == year){
                System.out.println(songs[i]);
                found++;
            }
        }
        
        if(found == 0){
            System.out.println(year + " not found in song list");
        }
    }
    
    public static void findArtist(Music[] songs, String artist){
        int found = -1;
        for(int i = 0; i < songs.length; i++){
            if(songs[i].getArtist().compareTo(artist) == 0){
                found = i;
                break;
            }
        }
        
        if(found != -1){
            System.out.println("Found " + artist + " in song list: ");
            System.out.println(songs[found]);
        }else{
            System.out.println(artist + " not found in song list");
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
