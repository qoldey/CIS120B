
public class DeckClient {

	// Module 7 Lab 2
	// Demonstrate Sorting
	public static void main(String[] args) {
		Deck myDeck = new Deck(); // create a standard 52-card deck

		System.out.println(myDeck);
		System.out.println("before shuffling");

		myDeck.shuffle();

		System.out.println("after shuffling");
		System.out.println(myDeck);

		System.out.println();

		myDeck.selectionSort();
		System.out.println("Finished sorting");

		myDeck.shuffle();
		// Deck sortedDeck = myDeck.almostMergeSort(); // AlmostMergeSort
		Deck sortedDeck = myDeck.mergeSort();

		System.out.println(sortedDeck);
		System.out.println(sortedDeck.length());
	}
}
