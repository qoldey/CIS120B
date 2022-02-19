public class Tile {

    // https://www.stevenlrichardson.com/CIS120/ThinkJava2TrinketV8/thinkjava2_012.html

    // class attributes
    char letter;
    int value;

    // default constructor
    public Tile() {
        this.letter = ' ';
        this.value = 0;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(Tile tile) {
        System.out.println(tile.letter);
    }

    public String toString() {
        return String.format("%c", this.letter);
    }

    public boolean equals(Tile tile) {
        return this.letter == tile.letter
                && this.value == tile.value;
    }

}
