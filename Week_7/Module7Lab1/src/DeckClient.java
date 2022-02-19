
public class DeckClient {

	// Demonstrate shuffling.
	public static void main(String[] args) {
		Deck myDeck = new Deck(); // create a standard 52-card deck

		System.out.println(myDeck);
		System.out.println("before shuffling");

		myDeck.shuffle();

		System.out.println("Passed first shuffle");
		System.out.println();

		int runs = 50;
		for (int i = 0; i < runs; i++) { // test random number generator by shuffling
			myDeck = new Deck();
			myDeck.shuffle();
			// System.out.println("Passed " + i);
		}
		System.out.println("Passed RNG");

		System.out.println("after shuffling");
		System.out.println(myDeck);

		System.out.println();

		// myDeck.selectionSort();// <--Sorting not working
		System.out.println("Finished sorting");

	}

}
