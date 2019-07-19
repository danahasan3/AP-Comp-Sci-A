/**sc
 * Simulates an online purchase of an Magic The Gathering (MTG) trading card
 *
 * @author Bhaskar Mishra
 * @version 6/16/2018
 */
import java.util.Scanner;

public class BuyMTGCards{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ////////////////////////////////////////////////////////////////////////////
        // Getting order information from user
        ////////////////////////////////////////////////////////////////////////////        
        
        System.out.println("Welcome to MTG Trading Post!");
        System.out.print("Enter your first and last name (E.g., John Watson): ");
        
        String firstName = sc.next();
        String lastName = sc.next();
        sc.nextLine();
        
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        
        String date = sc.next();
        sc.nextLine();
        
        System.out.print("Which card do you want (E.g., Sorin, Lord of Innistrad): ");
        
        String cardName = sc.next();
        cardName += sc.nextLine();
        
        System.out.print("How many copies would you like to purchase: ");
        
        int numCards = Integer.parseInt(sc.next());
        sc.nextLine();
        
        System.out.print("What is the price of this card (E.g., $49.37): ");
        
        String priceString = sc.next();
        sc.nextLine();
        char symbol = priceString.charAt(0);
        double price = Double.parseDouble(priceString.substring(1));
        
        System.out.print("Enter your debit card account number (####-####-####-####): ");
        
        String debitCard = sc.next();
        sc.nextLine();
        
        System.out.print("Enter PIN: ");
        String pin = sc.next();
        sc.nextLine();
        
        System.out.println();
        for(int i = 0; i < 35; i++){
            System.out.print("*~");
        }
        System.out.println();        
        for(int i = 0; i < 35; i++){
            System.out.print("~*");
        }
        System.out.println();
        
        ///////////////////////////////////////////////////////////////////////////////////////
        // Modify variables to appropriate format and then print e-Reciept
        ///////////////////////////////////////////////////////////////////////////////////////
        
        String name = firstName.charAt(0) + ". " + lastName;
        String orderNum = lastName.substring(0,3) + debitCard.substring(15);
        double totalCost = price * numCards;
        String dateNew = date.replace("/", "-");
        String debitHidden = "####-####-####-" + debitCard.substring(15);
        
        System.out.println("Your e-Receipt\n");
        
        System.out.println("Date: " + dateNew);
        System.out.println("Order number: " + orderNum + "\n");
        
        System.out.println("\t" + name);
        System.out.println("\tDebit Card: " + debitHidden);
        System.out.println("\tCard Name: " + cardName);
        System.out.println("\tNumber of Copies: " + numCards);
        System.out.println("\tPrice per Card: " + price + "\n");
        System.out.println("\t" + symbol + Double.toString(totalCost) + " will be debited to your account.\n");
        System.out.println("\tThank you and Good Luck");
        
        for(int i = 0; i < 35; i++){
            System.out.print("*~");
        }
        System.out.println();        
        for(int i = 0; i < 35; i++){
            System.out.print("~*");
        }
        System.out.println();
    }
}
