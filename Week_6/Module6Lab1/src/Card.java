public class Card {
    // Module 6 Lab 0

    // private final instance variables
    private final int rank;
    private final int suit;

    static public final String[] emotes = { new String(Character.toChars(0x2663)),
            new String(Character.toChars(0x2666)), new String(Character.toChars(0x2665)),
            new String(Character.toChars(0x2660)) };

    // static final class variables for mapping Card ranks and suits
    public static final String[] RANKS = { // n = 14
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

    // getters
    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
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

    public static int binarySearch(Card[] hand, Card target) {
        int low = 0;
        int high = hand.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2; // step 1
            int comp = hand[mid].compareTo(target);
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

    public static Card[] newDeck() { // returns standard 52 card deck
        Card[] cards = new Card[52]; // array of n Card object *references*
        // initialize deck
        int i = 0;
        for (int suit = 0; suit <= 3; suit++) { // SUITS,LENGTH
            for (int rank = 1; rank <= 13; rank++) { // RANK.length
                cards[i] = new Card(rank, suit);
                i++;
            }
        }
        return cards;
    }

    public static Card[] newFlushHand(int suit) { // returns all 13 cards of a given suit
        if (suit > SUITS.length) {
            throw new IllegalArgumentException("Enter valid suit");
        }
        Card[] cards = new Card[13];// RANKS.length
        int i = 0;
        for (int rank = 1; rank <= 13; rank++) {
            cards[i++] = new Card(rank, suit);
        }
        return cards;

    }

    public static void compareCards(Card c1, Card c2) {
        switch (c1.compareTo(c2)) {
            case -1:
                System.out.println(c2 + " Wins");
                break;
            case 0:
                System.out.println(c1 + " = " + c2);
                break;
            case 1:
                System.out.println(c1 + " Wins");
                break;
        }
    }

    // Module 6 Lab 1

    // returns an array of int representing a histogram of the number of cards held
    // in each suit.
    public static int[] suitHist(Card[] hand) {

        // "Clubs", "Diamonds", "Hearts", "Spades"
        int[] histogram = new int[4];

        for (Card card : hand) {
            switch (card.getSuit()) {
                case 0:
                    histogram[0]++;
                    break;
                case 1:
                    histogram[1]++;
                    break;
                case 2:
                    histogram[2]++;
                    break;
                case 3:
                    histogram[3]++;
                    break;
            }
        }
        return histogram;
    }

    // null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"
    public static int[] rankHist(Card[] hand) {
        int[] histogram = new int[RANKS.length - 1];
        for (Card card : hand) {
            switch (card.getRank()) {
                case 1:
                    histogram[0]++;
                    break;
                case 2:
                    histogram[1]++;
                    break;
                case 3:
                    histogram[2]++;
                    break;
                case 4:
                    histogram[3]++;
                    break;
                case 5:
                    histogram[4]++;
                    break;
                case 6:
                    histogram[5]++;
                    break;
                case 7:
                    histogram[6]++;
                    break;
                case 8:
                    histogram[7]++;
                    break;
                case 9:
                    histogram[8]++;
                    break;
                case 10:
                    histogram[9]++;
                    break;
                case 11:
                    histogram[10]++;
                    break;
                case 12:
                    histogram[11]++;
                    break;
                case 13:
                    histogram[12]++;
                    break;
            }
        }
        return histogram;
    }

    public static void printRankHist(Card[] hand) {
        int[] histogram = rankHist(hand);
        for (int i = 0; i < histogram.length; i++) {
            System.out.printf("%d %s\n", histogram[i], RANKS[i + 1]);
        }
    }

    public static void printSuitHist(Card[] hand) {
        System.out.println(hand.length);
        System.out.println(emotes.length);

        int[] histogram = suitHist(hand);
        System.out.println(histogram.length);

        for (int i = 0; i < histogram.length; i++) {
            System.out.printf("%d %s %s\n", histogram[i], SUITS[i], emotes[i]);

        }
    }

    // returns a boolean representing whether or not the hand contains cards all of
    // the same suit
    public static boolean isFlush(Card[] hand) {
        for (int i = 1; i < hand.length; i++) {
            if (hand[i].getSuit() != hand[i - 1].getSuit()) {
                return false;
            }
        }
        return true;
    }

    // returns a boolean representing whether or not the hand contains cards of any
    // suit in a sequence,

    // https://www.cardschat.com/poker-hands/straight/ <- A straight is 5 cards min?
    public static boolean isStraight(Card[] hand) {

        int[] histogram = rankHist(hand); // format
        int j = 0;
        int straightCounter = 5; // number of cards to consider a sequence
        for (int i = 0; i < histogram.length - 1; i++) { // 0-13

            if (histogram[i] > 0 && histogram[i + 1] > 0) {
                // System.out.print("X");
                j++;
            }
            if (i > 0 && histogram[i] > 0 && histogram[i - 1] > 0) {
                j++;
            } else {
                j = 0;
            }
            if (j >= straightCounter) {
                return true;
            }
        }
        return false;
    }

    // returns a boolean representing whether or not the hand contains cards all of
    // the same suit also in a sequence.
    public static boolean isStraightFlush(Card[] hand) { // this assumes hand sizes of straightCounter
        return isFlush(hand) && isStraight(hand);
    }

}
