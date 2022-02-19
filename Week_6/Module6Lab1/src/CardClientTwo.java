public class CardClientTwo {
    // Write and test the following static methods which all accept an array of Card
    // representing a hand of cards as input:

    // suitHist returns an array of int representing a histogram of the number of
    // cards held in each suit.

    // isFlush returns a boolean representing whether or not the hand contains cards
    // all of the same suit

    // isStraight returns a boolean representing whether or not the hand contains
    // cards of any suit in a sequence, for example 4 of spades, 5 of clubs, 6 of
    // clubs, 7 of hearts, 8 of diamonds. You may want to change the ordering of the
    // Card objects so that the Ace is ranked higher than the King.

    // isStraightFlush returns a boolean representing whether or not the hand
    // contains cards all of the same suit also in a sequence.

    public static void main(String[] args) {
        // Card[] hand = Card.newDeck();

        // Card.compareCards(hand[4], hand[2]);

        // Card[] hand2 = Card.newFlushHand(1); // new flush hand with all Diamonds

        Card[] hand3 = new Card[8];

        hand3[0] = new Card(1, 2);
        hand3[1] = new Card(2, 2);
        hand3[2] = new Card(3, 2);
        hand3[3] = new Card(8, 2);
        hand3[4] = new Card(9, 2);
        hand3[5] = new Card(10, 2);
        hand3[6] = new Card(11, 2);
        hand3[7] = new Card(12, 2);

        // Card.printDeck(hand3);
        System.out.println();
        Card.printSuitHist(hand3);
        System.out.println();
        // Card.printRankHist(hand3);

        System.out.println("Hand is flush: " + Card.isFlush(hand3));
        System.out.println("Hand is straight: " + Card.isStraight(hand3));
        System.out.println("Hand is straightFlush: " + Card.isStraightFlush(hand3));
    }

}
