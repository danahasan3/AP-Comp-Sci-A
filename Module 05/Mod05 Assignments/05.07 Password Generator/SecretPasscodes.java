
/**
 * PURPOSE: Generate passwords using various character sets and password lengths
 *
 * @author Bhaskar Mishra
 * @version 6/19/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class SecretPasscodes{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new File("passwords.txt"));
        
        System.out.println("Password Generator Menu\n");
        System.out.println("\t[1] Lowercase Letters (26 characters)");
        System.out.println("\t[2] Lowercase/Uppercase Letters (52 characters)");
        System.out.println("\t[3] Lowercase/Uppercase Letters + Digits (0-9) (62 characters)");
        System.out.println("\t[4] Lowercase/Uppercase Letters + Digits (0-9) + Punctuation Marks (79 characters)");
        System.out.println("\t[5] Quit\n");
        
        // Create Passwords
        while(true){
            System.out.print("Select Option (1-5): ");
            int selection = sc.nextInt();
            if(selection == 5){
                writer.close();
                System.out.println("\nThank you for using the Password Generator.\n");
                break;
            }
            System.out.print("Password Length (6+): ");
            int len = sc.nextInt();
            if(len < 6){
                System.out.println("\n\tPassword Length too short. Please try again.\n");
                continue;
            }else{
                System.out.println();
            }
            String pass = "";
            switch(selection){
                case 1:
                    for(int i = 0; i < len; i++){
                        pass += (char)((int)(Math.random() * 26) + 97);
                    }
                    writer.println(pass);
                    break;
                case 2:
                    for(int i = 0; i < len; i++){
                        int letter = (int)(Math.random() * 52);
                        pass += letter < 26 ? (char)(letter + 65) : (char)(letter - 26 + 97);
                    }
                    writer.println(pass);
                    break;
                case 3:
                    for(int i = 0; i < len; i++){
                        int letter = (int)(Math.random() * 62);
                        pass += letter < 10 ? (char)(letter + 48) : letter < 36 ? (char)(letter - 10 + 65) : (char)(letter - 36 + 97);
                    }
                    writer.println(pass);
                    break;
                case 4:
                    for(int i = 0; i < len; i++){
                        pass += (char)((int)(Math.random() * 79) + 48);
                    }
                    writer.println(pass);
                    break;
            }
        }
        
        // Read Passwords
        File file = new File("passwords.txt");
        sc = new Scanner(file);
        
        int counter = 0;
        System.out.println("Here are you randomly generated passwords\n");
        while(sc.hasNext()){
            String password = sc.next();
            sc.nextLine();
            counter++;
            System.out.println(" " + counter + "\t" + password);
        }
    }
}
