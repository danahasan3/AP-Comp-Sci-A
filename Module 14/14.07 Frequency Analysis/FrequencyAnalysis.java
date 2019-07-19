
/**
 * Analyzes a text document for the occurence of various letters in the alphabet
 *
 * @author Bhaskar Mishra
 * @version 11/18/2018
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FrequencyAnalysis{
    public static int[] analyze(File file) throws IOException{
        String token = "";
        Scanner sc = new Scanner(file);
        int[] frequencies = new int[26];
        while(sc.hasNext()){
            token = sc.next().toLowerCase();
            for(int i = 0; i < token.length(); i++){
                if(token.charAt(i) >= 'a' && token.charAt(i) <= 'z'){
                    frequencies[(int)token.charAt(i) - (int)('a')]++;
                }
            }
        }
        sc.close();
        return frequencies;
    }
}
