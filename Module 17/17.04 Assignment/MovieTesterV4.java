
/**
 * Tester class for Movie class
 *
 * @author Bhaskar Mishra
 * @version 5/4/2019
 */

public class MovieTesterV4{
    public static void main(String[] args){
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("A Silent Voice", 2017, "Kyoto Animation");
        movies[1] = new Movie("Your Name", 2016, "CoMix Wave Films");
        movies[2] = new Movie("Princess Mononoke", 1997, "Studio Ghibli");
        movies[3] = new Movie("No Game No Life Zero", 2017, "Madhouse");
        movies[4] = new Movie("Spirited Away", 2001, "Studio Ghibli");
        movies[5] = new Movie("Hotarubi no Mori e", 2011, "Aniplex");
        movies[6] = new Movie("Ghost in the Shell", 1995, "Production I.G");
        movies[7] = new Movie("Akira", 1988, "Tokyo Movie Shinsha");
        movies[8] = new Movie("Steins;Gate: The Movie", 2013, "White Fox");
        movies[9] = new Movie("Paprika", 2006, "Madhouse");
        
        printRepeated("-", 80, true);
        System.out.println("Original:");
        printRepeated("-", 80, true);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Title (Ascending):");
        printRepeated("-", 80, true);
        sortByTitle(movies, 0, movies.length - 1);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Year (Ascending):");
        printRepeated("-", 80, true);
        sortByYear(movies, 0, movies.length - 1);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Studio (Ascending):");
        printRepeated("-", 80, true);
        sortByStudio(movies, 0, movies.length - 1);
        printMovies(movies);
        System.out.println();
    }
    
    public static void printMovies(Movie[] movies){
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].toString());
        }
    }
    
    public static void sortByTitle(Movie[] movies, int low, int high){
        if(low == high) 
            return;
        int mid = (low + high)/2;
        
        sortByTitle(movies, low, mid);
        sortByTitle(movies, mid + 1, high);
        
        sortByTitleMerge(movies, low, mid, high);
    }
    
    public static void sortByTitleMerge(Movie[] movies, int low, int mid, int high){
        Movie[] temp = new Movie[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n++] = movies[j++];
            }else if(j > high){
                temp[n++] = movies[i++];
            }else if(movies[i].getTitle().compareTo(movies[j].getTitle()) < 0){
                temp[n++] = movies[i++];
            }else{
                temp[n++] = movies[j++];
            }
        }
        
        for(int k = low; k <= high; k++){
            movies[k] = temp[k - low];
        }
    }
    
    public static void sortByYear(Movie[] movies, int low, int high){
        if(low == high) 
            return;
        int mid = (low + high)/2;
        
        sortByYear(movies, low, mid);
        sortByYear(movies, mid + 1, high);
        
        sortByYearMerge(movies, low, mid, high);
    }
    
    public static void sortByYearMerge(Movie[] movies, int low, int mid, int high){
        Movie[] temp = new Movie[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n++] = movies[j++];
            }else if(j > high){
                temp[n++] = movies[i++];
            }else if((movies[i].getYear() - movies[j].getYear()) < 0){
                temp[n++] = movies[i++];
            }else{
                temp[n++] = movies[j++];
            }
        }
        
        for(int k = low; k <= high; k++){
            movies[k] = temp[k - low];
        }
    }
    
    public static void sortByStudio(Movie[] movies, int low, int high){
        if(low == high) 
            return;
        int mid = (low + high)/2;
        
        sortByStudio(movies, low, mid);
        sortByStudio(movies, mid + 1, high);
        
        sortByStudioMerge(movies, low, mid, high);
    }
    
    public static void sortByStudioMerge(Movie[] movies, int low, int mid, int high){
        Movie[] temp = new Movie[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n++] = movies[j++];
            }else if(j > high){
                temp[n++] = movies[i++];
            }else if(movies[i].getStudio().compareTo(movies[j].getStudio()) < 0){
                temp[n++] = movies[i++];
            }else{
                temp[n++] = movies[j++];
            }
        }
        
        for(int k = low; k <= high; k++){
            movies[k] = temp[k - low];
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
