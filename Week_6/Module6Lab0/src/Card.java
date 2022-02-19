public class Card {
    // Module 6 Lab 0

    // private final instance variables
    private final int rank;
    private final int suit;

    // static final class variables for mapping Card ranks and suits
    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King" };

    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades" };
    // One advantage of defining SUITS and RANKS as class variables is that they
    // don’t need to be created (and garbage-collected) every time toString is
    // called. They may also be needed in other methods and classes, so it’s helpful
    // to make them available everywhere. Since the array variables are final, and
    // the strings they reference are immutable, there is no danger in making them
    // public.

    // a value constructor
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // toString, equals and compareTo instance methods
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public boolean equals(Card that) {
        return this.rank == that.rank
                && this.suit == that.suit;
    }

    // compareTo returns -1 if this is a lower card, +1 if this is a higher card,
    // and 0 if this and that are equivalent. It compares suits first. If the suits
    // are the same, it compares ranks. If the ranks are also the same, it returns
    // 0.

    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    // getters
    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    // static printDeck, the sequential search and binarySearch methods

    // printDeck() method - *not* an instance method!
    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    // Sequential Search
    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2; // step 1
            int comp = cards[mid].compareTo(target);
            if (comp == 0) { // step 2
                return mid;
            } else if (comp < 0) { // step 3
                low = mid + 1;
            } else { // step 4
                high = mid - 1;
            }
        }
        return -1;
    }

}
