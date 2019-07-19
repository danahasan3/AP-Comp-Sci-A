/**
 * This is a class that tests the Card class.
 *
 *  Bhaskar Mishra
 *  5/4/2019
 */

public class CardTester{
    /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
    public static void main(String[] args) {
        // Establish new cards
        Card aceHearts = new Card("ace", "hearts", 1);
        Card twoSpades = new Card("two", "spades", 2);
        Card kingDiamonds = new Card("king", "diamonds", 13);
        
        // Test card 1 and methods
        System.out.println("**** Tests Card 1: ace of hearts ****");
        System.out.println("  rank: " + aceHearts.rank());
        System.out.println("  suit: " + aceHearts.suit());
        System.out.println("  pointValue: " + aceHearts.pointValue());
        System.out.println("  toString: " + aceHearts.toString());
        System.out.println();
        
        // Test card 2
        System.out.println("**** Tests Card 2: two of spades ****");
        System.out.println("  rank: " + twoSpades.rank());
        System.out.println("  suit: " + twoSpades.suit());
        System.out.println("  pointValue: " + twoSpades.pointValue());
        System.out.println("  toString: " + twoSpades.toString());
        System.out.println();
        
        // Test card 3
        System.out.println("**** Tests Card 3: king of diamonds ****");
        System.out.println("  rank: " + kingDiamonds.rank());
        System.out.println("  suit: " + kingDiamonds.suit());
        System.out.println("  pointValue: " + kingDiamonds.pointValue());
        System.out.println("  toString: " + kingDiamonds.toString());
        System.out.println();
        
        // Test matches() method
        System.out.println("**** Tests Card 1 matches Card 2 ****");
        if(aceHearts.matches(twoSpades)){
            System.out.println("Matches");
        }else{
            System.out.println("Does not match");
        }
    }
}
