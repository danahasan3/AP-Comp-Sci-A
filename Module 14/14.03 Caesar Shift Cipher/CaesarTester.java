
/**
 * Tester class for Encryption and Decryption
 *
 * @author Bhaskar Mishra
 * @version 10/13/2018
 */
import java.util.Scanner;

public class CaesarTester{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Shift Key Value (0-25): ");
        int shiftKey = sc.nextInt();
        
        //Initialization
        Encryption.setShiftKey(shiftKey);
        Decryption.setShiftKey(shiftKey);
        Encryption.generateCypherAlphabet();
        Decryption.generateCypherAlphabet();
        
        //Print Alphabet and Caesar Alphabet
        System.out.println();
        System.out.printf("%-20s%s%n", "Alphabet: ", Encryption.alphabet);
        System.out.printf("%-20s%s%n", "Cypher Alphabet: ", Encryption.getCypherAlphabet());
        
        boolean quit = false;
        while(!quit){
            //Print Menu
            System.out.println();
            System.out.println("Menu");
            System.out.println("1) Encryption");
            System.out.println("2) Decryption");
            System.out.println("3) Quit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            System.out.println();
            switch(option){
                case 1:
                    System.out.print("Enter a message to be Encrypted:");
                    String msgE = (sc.next() + sc.nextLine()).toUpperCase();
                    System.out.println("Encrypted Message: " + Encryption.encryptMessage(msgE));
                    break;
                case 2:
                    System.out.print("Enter a message to be Decrypted:");
                    String msgD = (sc.next() + sc.nextLine()).toUpperCase();
                    System.out.println("Decrypted Message: " + Decryption.decryptMessage(msgD));
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Choose from (1-3)");
                    break;
            }
        }
    }
}
