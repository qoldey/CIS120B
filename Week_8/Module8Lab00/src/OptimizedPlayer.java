public class OptimizedPlayer extends Player {

    // private Hand hand;

    // a better strategy as implemented in the Player class.

    // I am getting a java.lang.IndexOutOfBoundsException at the moment, I will
    // spend some more time figuring out why, but here is the improved logic of a
    // player. I still need to properly deal with removing cards from
    // CardCollections.

    public OptimizedPlayer(String name) {
        super(name);
    }

    /**
     * Removes and returns a legal card from the player's hand.
     */
    public Card play(Eights eights, Card prev) {
        Card card = findMatch(prev); // get highest point card from hand
        if (card == null) { // if no matches in hand
            card = drawForMatch(eights, prev);
        }

        return card; // TODO: make sure this removes the card form the hand
    }

    // return card with highest value from hand or an 8
    public Card findMatch(Card prev) {
        int rank, index = 0;

        CardCollection matches = new CardCollection("Playable");
        Card highest = matches.getCard(0);

        for (int i = 0; i < this.getHand().size(); i++) {
            Card card = this.getHand().getCard(i);

            if (cardMatches(card, prev)) {
                matches.addCard(card);

                rank = matches.getCard(i).getRank();
                if (rank == 8) { // if have an eight, play it.
                    return this.getHand().popCard(i);
                } else if (rank > highest.getRank()) {
                    highest = this.getHand().getCard(i);
                    index = i;
                }

            }
        }
        if (matches.size() == 0) {
            return null;
        }

        return this.getHand().popCard(index);
    }

    // returns card with highest score from a given hand
    public Card highestScore(CardCollection matches) {
        Card highest = matches.getCard(0);
        int rank, index = 0;
        for (int i = 0; i < matches.size(); i++) {
            rank = matches.getCard(i).getRank();
            if (rank == 8) {
                return matches.popCard(i);
            } else if (rank > highest.getRank()) {
                highest = this.getHand().getCard(i);
                index = i;
            }
        }
        return matches.popCard(index);
    }

    /**
     * Searches the player's hand for matching cards. --unused
     */

    public CardCollection searchForMatches(Card prev) {
        CardCollection matches = new CardCollection("Playable");
        for (int i = 0; i < this.getHand().size(); i++) {
            Card card = this.getHand().getCard(i);
            if (cardMatches(card, prev)) {
                matches.addCard(card);
            }
        }
        if (matches.size() == 0) {
            return null;
        }
        return matches;
    }
}
// Instead of playing the first Card, if any, that matches suit or rank on the
// discard pile, think about minimizing the penalty points should the Player
// lose. For example,
// if there are multiple Cards in the Player's Hand that
// could be played, consider playing high-penalty-value Cards such as eights or
// face cards.