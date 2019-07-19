
/**
 * Class with variables and methods necessary for Encryption using Caesar Shift method
 *
 * @author Bhaskar Mishra
 * @version 10/13/2018
 */
public class Encryption{
    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String cypherAlphabet;
    static int shiftKey;
    
    public static void setShiftKey(int key){
        shiftKey = key;
    }
    
    public static void generateCypherAlphabet(){
        cypherAlphabet = "";
        for(int i = 0; i < 26; i++){
            cypherAlphabet += (char)('A' + ((i+shiftKey)%26));
        }
    }
    
    public static String getCypherAlphabet(){
        return cypherAlphabet;
    }
    
    public static String encryptMessage(String msg){
        char[] msgChars = msg.toCharArray();
        for(int i = 0; i < msg.length(); i++){
            msgChars[i] = cypherAlphabet.charAt((int)(msgChars[i] - 'A'));
        }
        return new String(msgChars);
    }
}
