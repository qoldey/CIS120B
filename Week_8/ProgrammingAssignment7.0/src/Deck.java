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

    // the toString method for the Deck class
    // return a single string that represents the cards in the deck.
    @Override
    public String toString() { // toString
        return Arrays.toString(cards);
    }

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
    // selectionSort
    public void selectionSort() {
        for (int i = 0; i < this.cards.length; i++) {
            this.swapCards(i, indexLowest(i, this.cards.length));
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    // indexLowest
    private int indexLowest(int low, int high) {
        int pos = low;
        for (int i = low; i < high; i++) {
            if (this.cards[i].compareTo(this.cards[pos]) < 0) { // if i < pos
                pos = i; // position with lowest num in array
            }
        }
        return pos;
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) { // returns Deck[high+1]
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    public int length() {
        return this.cards.length;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    // merge
    private static Deck merge(Deck d1, Deck d2) {

        Deck d3 = new Deck(d1.length() + d2.length());
        // create a new deck, d3, big enough for all the cards

        // use the index i to keep track of where we are at in
        // the first deck, and the index j for the second deck
        int i = 0; // d1
        int j = 0; // d2

        // the index k traverses the result deck
        for (int k = 0; k < d3.length(); k++) {
            // if d1 is empty, use top card from d2
            if (i >= d1.length()) {
                d3.cards[k] = d2.cards[j];
                j++;
            }
            // if d2 is empty, use top card from d1
            else if (j >= d2.length()) {
                d3.cards[k] = d1.cards[i];
                i++;
            }

            // otherwise, compare the top two cards
            // add lowest card to the new deck at k
            // increment i or j (depending on deck)

            else {
                switch (d1.cards[i].compareTo(d2.cards[j])) {
                    case -1: // if d1[k] < d2[k]
                        d3.cards[k] = d1.cards[i];
                        i++;
                        break;
                    case 0: // if equal add both
                        d3.cards[k] = d1.cards[i];
                        i++;
                        // d3.cards[k] = d2.cards[j++];
                        break;
                    case 1: // if d1[k] > d2 k]
                        d3.cards[k] = d2.cards[j];
                        j++;
                        break;
                }
            }
        }
        // return the new deck
        return d3;
    }

    /**
     * Returns a sorted copy of the deck using selection sort.
     */
    public Deck almostMergeSort() {

        // divide the deck into two subdecks
        Deck half1 = subdeck(0, this.cards.length / 2);
        Deck half2 = subdeck((this.cards.length / 2) + 1, this.cards.length - 1);

        // sort the subdecks using selectionSort
        half1.selectionSort();
        half2.selectionSort();

        // merge the subdecks, return the result
        return merge(half1, half2);
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        if (this.length() == 0 || this.length() == 1) {
            // if the deck has 0 or 1 cards, return it
            return this;
        } else {
            // otherwise, divide the deck into two subdecks
            Deck half1 = subdeck(0, (this.cards.length / 2) - 1);
            Deck half2 = subdeck((this.cards.length / 2), this.cards.length - 1);

            // sort the subdecks using mergeSort
            return merge(half1.mergeSort(), half2.mergeSort()); // merge the subdecks & return the result.
        }
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */

    // a method named insertionSort that implements this algorithm.
    public void insertionSort() {
        for (int i = 0; i < this.length(); i++) {
            insert(i);
        }
    }
    // use a helper method, named insert, that implements the inner loop of the
    // algorithm

    public void insert(int i) {
        for (int k = i; k > 0 && this.cards[k].compareTo(this.cards[k - 1]) < 0; k--) {
            this.swapCards(k, k - 1);
        }
    }

}