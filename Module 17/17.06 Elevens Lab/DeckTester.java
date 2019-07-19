/**
 * This is a class that tests the Deck class.
 *
 *  Bhaskar Mishra
 *  5/4/2019
 */

public class DeckTester{
    /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
    public static void main(String[] args){
        String[] myRanks = {"king", "queen", "jack", "ace"};
        String[] mySuits = {"hearts", "spades", "clubs", "diamonds"};
        int[] myPointValues = {13, 12, 11, 1};
        Deck myDeck = new Deck(myRanks, mySuits, myPointValues);
        
        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString: \n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());
        System.out.println();
        System.out.println();
        
        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + myDeck.deal());
        System.out.println();
        System.out.println();
        
        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());
        System.out.println();
        System.out.println();
        
        System.out.println("**** Deal Remaining 5 Cards ****");
        for(int i = 0; i < 5; i++){
            System.out.println("  deal: " + myDeck.deal());
        }
        System.out.println();
        System.out.println();
        
        while(!myDeck.isEmpty()){
            myDeck.deal();
        }
        
        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());;
        System.out.println();
        System.out.println();
        
        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + myDeck.deal());
        System.out.println();
        System.out.println();
        
        
        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
        
        // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
        // String[] ranks52 = {"ace"};
        // String[] suits52 = {"spades"};
        // int[] pointValues52 = {1};
        
        // System.out.println("  The Starting Deck ");
        
        // System.out.println("  The Deck After Dealing a Card" );
        
        // System.out.println("  Shuffleing the Deck ");
    

    }
}
