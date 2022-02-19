public class CardClient {

    public static void main(String[] args) {

        Card[] deck = Search.makeDeck();

        int rank = deck[(int) (Math.random() * deck.length)].getRank();
        System.out.println(rank);

    }

}
