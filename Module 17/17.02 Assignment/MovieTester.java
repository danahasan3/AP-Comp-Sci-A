
/**
 * Tester class for Movie class
 *
 * @author Bhaskar Mishra
 * @version 4/18/2019
 */

public class MovieTester{
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
        sortByTitle(movies, 1);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Title (Descending):");
        printRepeated("-", 80, true);
        sortByTitle(movies, 2);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Year (Ascending):");
        printRepeated("-", 80, true);
        sortByYear(movies, 1);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Year (Descending):");
        printRepeated("-", 80, true);
        sortByYear(movies, 2);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Studio (Ascending):");
        printRepeated("-", 80, true);
        sortByStudio(movies, 1);
        printMovies(movies);
        System.out.println();
        
        printRepeated("-", 80, true);
        System.out.println("Sorted by Studio (Descending):");
        printRepeated("-", 80, true);
        sortByStudio(movies, 2);
        printMovies(movies);
        System.out.println();
    }
    
    public static void printMovies(Movie[] movies){
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].toString());
        }
    }
    
    //Direction, 1 for Ascending, 2 for Descending
    public static void sortByTitle(Movie[] movies, int direction){
        direction = (direction % 2)*2 - 1;
        for(int i = 1; i < movies.length; i++){
            Movie next = movies[i].getCopy();
            int index = 0;
            for(int j = i - 1; j >= 0; j--){
                if(movies[j].getTitle().compareTo(next.getTitle()) * direction > 0){
                    movies[j + 1] = movies[j].getCopy();
                }else{
                    index = j + 1;
                    break;
                }
            }
            movies[index] = next;
        }
    }
    
    //Direction, 1 for Ascending, 2 for Descending
    public static void sortByYear(Movie[] movies, int direction){
        direction = (direction % 2)*2 - 1;
        for(int i = 1; i < movies.length; i++){
            Movie next = movies[i].getCopy();
            int index = 0;
            for(int j = i - 1; j >= 0; j--){
                if((movies[j].getYear() - next.getYear()) * direction > 0){
                    movies[j + 1] = movies[j].getCopy();
                }else{
                    index = j + 1;
                    break;
                }
            }
            movies[index] = next;
        }
    }
    
    //Direction, 1 for Ascending, 2 for Descending
    public static void sortByStudio(Movie[] movies, int direction){
        direction = (direction % 2)*2 - 1;
        for(int i = 1; i < movies.length; i++){
            Movie next = movies[i].getCopy();
            int index = 0;
            for(int j = i - 1; j >= 0; j--){
                if(movies[j].getStudio().compareTo(next.getStudio()) * direction > 0){
                    movies[j + 1] = movies[j].getCopy();
                }else{
                    index = j + 1;
                    break;
                }
            }
            movies[index] = next;
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
