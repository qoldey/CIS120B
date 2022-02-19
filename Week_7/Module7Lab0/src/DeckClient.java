
public class DeckClient {

	// Demonstrate toSring
	public static void main(String[] args) {
		Deck myDeck = new Deck(); // create a standard 52-card deck

		System.out.println();
		System.out.println(myDeck); // uses toString on a Deck object
		System.out.println();
		System.out.println(myDeck.toString());
		System.out.println();
		System.out.println(myDeck.toStringBuilder());
		System.out.println();
		myDeck.print(); // For Card:cards; print(card);
		System.out.println();

		System.out.println("Finished testing print methods");

		// myDeck.selectionSort();// <--Sorting not working
		System.out.println("Finished sorting");

	}

}
