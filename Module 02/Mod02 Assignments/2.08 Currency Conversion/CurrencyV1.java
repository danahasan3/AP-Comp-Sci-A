/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Bhaskar Mishra
 * @version 6/11/2018
 */
public class CurrencyV1{
    public static void main(String [ ] args){
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 20.5869;      // 1 US dollar = 20.5869 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        double yenSpent = 10001.00;             // Japanese Yen spent
        double yenExchangeRate = 110.027;       // 1 US dollar = 110.027 Yen
        double dollarsSpentInJapan = 0.0;       // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;         // US dollars remaining after Japan
        
        double rupeesSpent = 8920.13;           // Indian Rupees spent
        double rupeesExchangeRate = 67.4730;    // 1 US dollar = 67.4730 Rupees
        double dollarsSpentInIndia = 0.0;       // US dollars spent in India
        double dollarsAfterIndia = 0.0;         // US dollars remaining after India

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        dollarsSpentInIndia = rupeesSpent / rupeesExchangeRate;
        
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;
        dollarsAfterIndia = dollarsAfterJapan - dollarsSpentInIndia;
        
        System.out.println("Starting US dollars: \t\t" + startingUsDollars);
        System.out.println();
        
        System.out.println("Mexico: ");
        System.out.println(" Pesos spent:\t\t\t" + pesosSpent);
        System.out.println(" US dollars equivalent:\t\t" + dollarsSpentInMexico);
        System.out.println(" US dollars remaining:\t\t" + dollarsAfterMexico);
        System.out.println();
        
        System.out.println("Japan: ");
        System.out.println(" Yen spent:\t\t\t" + yenSpent);
        System.out.println(" US dollars equivalent:\t\t" + dollarsSpentInJapan);
        System.out.println(" US dollars remaining:\t\t" + dollarsAfterJapan);
        System.out.println();
        
        System.out.println("India: ");
        System.out.println(" Rupees spent:\t\t\t" + rupeesSpent);
        System.out.println(" US dollars equivalent:\t\t" + dollarsSpentInIndia);
        System.out.println(" US dollars remaining:\t\t" + dollarsAfterIndia);
        System.out.println();
        
        System.out.println("===================================================");
        System.out.println("Remaining US dollars:\t\t" + dollarsAfterIndia);
        System.out.println();
        System.out.println();
        
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = budget1 / costItem1;        //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = (int)(budget2 / costItem2);    //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

