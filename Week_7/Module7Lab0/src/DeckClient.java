
public class DeckClient {

	public static void main(String[] args) {
		Deck myDeck = new Deck(); // create a standard 52-card deck

		myDeck.print();

		System.out.println("before shuffling");

		myDeck.shuffle();

		System.out.println("Passed first shuffle");
		System.out.println();

		int runs = 50;
		for (int i = 0; i < runs; i++) { // test random number generator
			myDeck = new Deck();
			myDeck.shuffle();
			// System.out.println("Passed " + i);
		}

		System.out.println("Passed RNG");
		System.out.println();

		System.out.println(myDeck); // uses toString on a Deck object
		System.out.println();

		System.out.println(myDeck.toStringBuilder());
		System.out.println("finsihed toString");
		// myDeck.print(); // For Card:cards; print(card);

		System.out.println("Finished testing print methods");
		System.out.println();

		// myDeck.print();// <--Not Sorted
		System.out.println();
		System.out.println("Without sorting");
		System.out.println();

		// myDeck.selectionSort();// <--Sorting not working

		System.out.println();
		System.out.println("Just Sorted");
		System.out.println();
		// myDeck.print();// <--Sorted

		System.out.println();
		System.out.println("After Sorting");
		System.out.println();

		System.out.println("Finished sorting");

		runs = 100;
		int low = 10;
		int high = 20;

		// for (int i = 0; i < runs; i++) {
		// System.out.print(ThreadLocalRandom.current().nextInt(low, high + 1) + " ");
		// }
	}

}
