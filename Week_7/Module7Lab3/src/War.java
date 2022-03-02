/**
 * Simulates a simple card game.
 */
// Module 7 Lab 3
// Implement War
public class War {

    public static void main(String[] args) {

        // create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // divide the deck into piles
        Pile p1 = new Pile();
        p1.addDeck(deck.subdeck(0, 25));
        Pile p2 = new Pile();
        p2.addDeck(deck.subdeck(26, 51));

        // while both piles are not empty
        int i = 0;
        while (p1.size() > 0 && p2.size() > 0) {
            Card c1 = p1.popCard();
            Card c2 = p2.popCard();

            // compare the cards
            int diff = c1.getRank() - c2.getRank();
            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
            } else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
            } else { // it's a tie...draw four more cards
                Card c3 = p1.popCard();
                Card c4 = p1.popCard();
                Card c5 = p1.popCard();
                Card c6 = p1.popCard(); // To compare
                Card c7 = p2.popCard();
                Card c8 = p2.popCard();
                Card c9 = p2.popCard();
                Card c10 = p2.popCard(); // To compare
                diff = c6.getRank() - c10.getRank();
                if (diff > 0) {
                    p1.addCard(c1);
                    p1.addCard(c2);
                    p1.addCard(c3);
                    p1.addCard(c4);
                    p1.addCard(c5);
                    p1.addCard(c6);
                    p1.addCard(c7);
                    p1.addCard(c8);
                    p1.addCard(c9);
                    p1.addCard(c10);
                } else if (diff < 0) { // The player with the highest ranking card take 10 cards
                    p2.addCard(c1);
                    p2.addCard(c2);
                    p2.addCard(c3);
                    p2.addCard(c4);
                    p2.addCard(c5);
                    p2.addCard(c6);
                    p2.addCard(c7);
                    p2.addCard(c8);
                    p2.addCard(c9);
                    p2.addCard(c10);
                } else {
                    // This could conceivably repeat, and if one player's pile/hand empties then the
                    // game ends.
                    // The game could also end if we try popping a card that doesn't exist
                    // TODO: Account for popping cards errors
                    throw new IllegalAccessError("You got two ties and I didn't account for when that happens");
                } // The program breaks here most of the time. Sometimes it works and I get a
                  // winner, other times it repeats for a while and then throws an error.
                  //src/IPromiseItWorks.png shows that it works :)
            }
            System.out.println("Round " + i++);
        }

        // display the winner
        if (p1.size() > 0) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

}