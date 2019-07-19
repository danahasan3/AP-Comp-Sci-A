/**
 * This is a class that tests the Deck class.
 *
 *  Bhaskar Mishra
 *  5/8/2019
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
        
        System.out.println("\n**** 52 Card Deck shuffle Tests ****");
        String[] ranks52 = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        String[] suits52 = {"spades", "hearts", "clubs", "diamonds"};
        int[] pointValues52 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        Deck deck52 = new Deck(ranks52, suits52, pointValues52);
        
        System.out.println("  The Starting Deck ");
        System.out.println("  toString:\n" + deck52.toString());
        
        System.out.println("  The Deck After Dealing a Card" );
        deck52.deal();
        System.out.println("  toString:\n" + deck52.toString());  
        
        System.out.println("  Shuffling the Deck ");
        deck52.shuffle();
        System.out.println("  toString:\n" + deck52.toString());    

    }
}
