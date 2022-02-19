import java.util.concurrent.ThreadLocalRandom;

import java.util.Arrays;

/**
 * A deck of playing cards (of fixed length).
 */
public class Deck {

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (all null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    /**
     * Returns a string representation of the deck.
     */

    // public String toString() {
    // return null;
    // }

    // the toString method for the Deck class
    // return a single string that represents the cards in the deck.
    @Override
    public String toString() { // toString
        return "Deck [cards=" + Arrays.toString(cards) + "]";// How to get rid of the brackets?
    }

    // @Override
    public String toStringBuilder() {// Another toString that uses StringBuilder like suggested.
        StringBuilder str = new StringBuilder();
        for (Card card : this.cards) {
            str.append(Card.RANKS[card.getRank()]);
            str.append(" of ");
            str.append(Card.SUITS[card.getSuit()]);
            str.append(", ");

        }
        return str.toString();
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        for (int i = 0; i < this.cards.length; i++) {
            int r = randomInt(i, this.cards.length);// choose a random number between i and length - 1
            this.swapCards(i, r);// swap the ith card and the randomly-chosen card
        }
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    // docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadLocalRandom.html#nextInt(int,int)
    private static int randomInt(int low, int high) {
        return ThreadLocalRandom.current().nextInt(low, high);
    }

    /**
     * Swaps the cards at indexes i and p.
     */
    private void swapCards(int i, int p) {
        Card tempCard = this.cards[p];
        this.cards[p] = this.cards[i];
        this.cards[i] = tempCard;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        for (int i = 0; i < this.cards.length; i++) {
            this.swapCards(i, indexLowest(i, this.cards.length));
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    private int indexLowest(int low, int high) {
        int pos = low;
        for (int i = low; i < high; i++) {
            if (this.cards[i].compareTo(this.cards[i + 1]) > 0) { // compares i and i+1
                pos = i; // position with lowest num in array
            }
        }
        return pos;
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    private static Deck merge(Deck d1, Deck d2) {
        return null;
    }

    /**
     * Returns a sorted copy of the deck using selection sort.
     */
    public Deck almostMergeSort() {
        return this;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        return this;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
    }
}
