public class TileClient {
    public static void main(String[] args) {

        char char1;
        char1 = 'z';
        int score;
        score = 10;

        Tile t = new Tile(char1, score);
        Tile t2 = new Tile(char1, score);

        if (t.equals(t2)) {
            System.out.println(" t and t2 are equal");
        } else {
            System.out.println(" t and t2 are not equal");
        }

        char letter = t.letter;

        System.out.println(letter);

        Tile.printTile(t);

        System.out.println(t); // uses toString()

    }
}
