
/**
 * Tester class for Music class
 *
 * @author Bhaskar Mishra
 * @version 5/4/2019
 */
public class TesterV3{
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
        sortByTitle(songs);
        findTitle(songs, "Nandemonaiya");
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Title \"ABCD\": ");
        printRepeated("-", 80, true);
        sortByTitle(songs);
        findTitle(songs, "ABCD");
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Year 2016: ");
        printRepeated("-", 80, true);
        sortByYear(songs);
        findYear(songs, 2016);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Year 1234: ");
        printRepeated("-", 80, true);
        sortByYear(songs);
        findYear(songs, 1234);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Artist \"Miwa\": ");
        printRepeated("-", 80, true);
        sortByArtist(songs);
        findArtist(songs, "Miwa");
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Search for Artist \"Bob\": ");
        printRepeated("-", 80, true);
        sortByArtist(songs);
        findArtist(songs, "Bob");
        System.out.println();
    }
    
    public static void printSongs(Music[] songs){
        for(int i = 0; i < songs.length; i++){
            System.out.println(songs[i].toString());
        }
    }
    
    public static void sortByTitle(Music[] songs){
        for(int i = songs.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if(songs[k].getTitle().compareTo(songs[posMax].getTitle()) > 0){
                    posMax = k;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[posMax];
            songs[posMax] = temp;
        }
    }
    
    public static void sortByYear(Music[] songs){
        for(int i = songs.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if((songs[k].getYear()-songs[posMax].getYear()) > 0){
                    posMax = k;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[posMax];
            songs[posMax] = temp;
        }
    }
    
    public static void sortByArtist(Music[] songs){
        for(int i = songs.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if(songs[k].getArtist().compareTo(songs[posMax].getArtist()) > 0){
                    posMax = k;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[posMax];
            songs[posMax] = temp;
        }
    }
    
    public static void findTitle(Music[] songs, String title){
        int high = songs.length;
        int low = -1;
        
        while(high - low > 1){
            int mid = (high + low)/2;
            if(songs[mid].getTitle().compareTo(title) > 0){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        if(low >= 0 && songs[low].getTitle().compareTo(title) == 0){
            System.out.println("Found: " + songs[low]);
        }else{
            System.out.println(title + " not found");
        }
    }
    
    public static void findYear(Music[] songs, int year){
        int high = songs.length;
        int low = -1;
        
        while(high - low > 1){
            int mid = (high + low)/2;
            if(songs[mid].getYear() > year){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        if(low >= 0 && songs[low].getYear() == year){
            linearPrint(songs, low, year);
        }else{
            System.out.println(year + " not found");
        }
    }
    
    public static void findArtist(Music[] songs, String artist){
        int high = songs.length;
        int low = -1;
        
        while(high - low > 1){
            int mid = (high + low)/2;
            if(songs[mid].getArtist().compareTo(artist) > 0){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        if(low >= 0 && songs[low].getArtist().compareTo(artist) == 0){
            System.out.println("Found: " + songs[low]);
        }else{
            System.out.println(artist + " not found");
        }
    }
    
    public static void linearPrint(Music[] songs, int index, int year){
        int start = index, end = index;
        
        while(start > 0 && songs[start - 1].getYear() == year){
            start--;
        }
        
        while(end + 1 < songs.length && songs[end + 1].getYear() == year){
            end++;
        }
        
        System.out.println("Search results:");
        for(int i = start; i <= end; i++){
            System.out.println(songs[i]);
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
