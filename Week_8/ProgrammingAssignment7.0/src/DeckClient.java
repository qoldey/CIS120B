
public class DeckClient {

	// Programming Assignment 7.0
	// Demonstrate insertionSort
	public static void main(String[] args) {
		Deck myDeck = new Deck(); // create a standard 52-card deck

		System.out.println(myDeck);
		System.out.println("before shuffling");

		myDeck.shuffle();

		System.out.println(myDeck);
		System.out.println("after shuffling");

		System.out.println();

		myDeck.insertionSort();

		System.out.println(myDeck);
		System.out.println("After sorting");

		System.out.println(myDeck.length());
	}
}
