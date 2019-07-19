
/**
 * Calculate percentage occurence of various combinations of gender in families with two children.
 *
 * @author Bhaskar Mishra
 * @version 6/19/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family{
    public static void main(String[] args) throws IOException{
        File file = new File("maleFemaleInFamily.txt");
        String token;
        Scanner sc = new Scanner(file);
        
        int boyBoy = 0;
        int boyGirl = 0;
        int girlGirl = 0;
        
        while(sc.hasNext()){
            token = sc.next();
            char charA = token.charAt(0);
            char charB = token.charAt(1);
            if(charA != charB){
                boyGirl++;
            }else if(charA == 'B'){
                boyBoy++;
            }else{
                girlGirl++;
            }
        }
        
        int total = boyBoy + boyGirl + girlGirl;
        
        System.out.printf("Composition statistics for families with two children.\n\n");
        System.out.printf("Total number of families: %d\n\n", total);
        System.out.printf("Number of families with\n\n");
        System.out.printf("\tBB: %d represents %.2f%%\n", boyBoy, 100*(double)boyBoy/(double)total);
        System.out.printf("\tBG: %d represents %.2f%%\n", boyGirl, 100*(double)boyGirl/(double)total);
        System.out.printf("\tGG: %d represents %.2f%%\n", girlGirl, 100*(double)girlGirl/(double)total);
    }
}
