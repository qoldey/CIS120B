public class CardClient {
    public static void main(String[] args) {
        Card threeClubs = new Card(3, 0); // Constructor
        System.out.println(threeClubs); // toString
        Card fourDiamonds = new Card(4, 1);

        compareCards(threeClubs, fourDiamonds); // compareTo
        System.out.println(threeClubs.getRank()); // getters
        System.out.println(fourDiamonds.getSuit());

        Card[] cards = newDeck(52); // Declare and initialize an array of Card objects.

        // Test the static printDeck, sequential search and binarySearch methods.
        Card.printDeck(cards);
        int foundCard = Card.search(cards, threeClubs); // cards.length (n) iterations max.
        int foundCard2 = Card.binarySearch(cards, fourDiamonds); // log(n) iteration max
        System.out.println(foundCard); // Return is location within first variable that 2nd is.
        System.out.println(foundCard2);
    }

    public static Card[] newDeck(int size) {
        Card[] cards = new Card[size]; // array of n Card object *references*
        // initialize deck
        int i = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[i] = new Card(rank, suit);
                i++;
            }
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
}
