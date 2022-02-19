import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CardTable extends Canvas {

    private Image[][] images;
    private int cardWidth, cardHeight;
    private static String cardset = "cardset-oxymoron";

    /**
     * Creates a CardTable.
     * cardset is the name of the folder that contains the card images.
     */
    public CardTable(String cardset) {
        setBackground(new Color(0x088A4B));

        // create a 2-D array of card images
        images = new Image[14][4];
        String suits = "cdhs"; // club diamond heart spade

        for (int suit = 0; suit <= 3; suit++) {
            char c = suits.charAt(suit);

            for (int rank = 1; rank <= 13; rank++) {
                String s = String.format("%s/%02d%c.gif",
                        cardset, rank, c);
                images[rank][suit] = new ImageIcon(s).getImage();
            }
        }

        // get the width and height of the cards and set the size of
        // the frame accordingly
        cardWidth = images[1][1].getWidth(null);
        cardHeight = images[1][1].getHeight(null);

        // set the size temporarily to get the insets
        setTableSize(14, 4);
    }

    /**
     * Sets the table size.
     * x and y are in units of card width/height.
     */
    public void setTableSize(double x, double y) {
        setSize((int) (x * cardWidth),
                (int) (y * cardHeight));
    }

    /**
     * Draws a card at the given coordinates.
     * x and y are in units of card width/height.
     */
    public void drawCard(Graphics g, int rank, int suit, double x, double y) {
        Image image = images[rank][suit];
        g.drawImage(image,
                (int) (x * cardWidth),
                (int) (y * cardHeight),
                null);
    }

    public void drawBack(Graphics g, double x, double y, int style) {

        String s = String.format("%s/back%03d.gif", cardset, style);

        Image image = new ImageIcon(s).getImage();

        // cardWidth = image.getWidth(null);
        // cardHeight = image.getHeight(null);
        g.drawImage(image, (int) (x * cardWidth),
                (int) (y * cardHeight),
                null);

    }

    /**
     * Special method invoked when the Frame needs to be drawn.
     */
    public void paint(Graphics g) { // basically main

        Card[] deck = Search.makeDeck();
        Card[] cardsOut = solitaireSetup(g, deck);
        // TODO: remove cardsOut from deck - these are the cards on the table
    }

    public Card[] solitaireSetup(Graphics g, Card[] deck) { // returns Card[] of cards away from deck
        double x = 0;
        double y = 0;
        double xOffset, yOffset, intXOffset, intYOffset;

        int length = 7;
        int height = length;
        int minXOffset = 2;

        yOffset = 2;
        xOffset = 2;

        if (xOffset < minXOffset) {
            xOffset = minXOffset;
        }

        intXOffset = xOffset;
        intYOffset = yOffset;

        // set this up so its taking cards from a deck
        // pokerandcards.com/how-to-set-up-and-play-solitaire/

        Card[] out = new Card[28]; // make small deck of cards
        int z = 0;
        for (int h = 0; h < height; h++) {
            for (int l = 0; l < length; l++) {
                x = xOffset + l * 2;
                y = yOffset + 0;
                x = x - l;

                // int found = Search.binarySearch(out, tempCard);
                // TODO: If found > -1, find another card.

                Card tempCard = Card.randomCard(deck);
                if (l == 0) {
                    drawCard(g, tempCard.getRank(), tempCard.getSuit(), x, y);
                } else {
                    drawBack(g, x, y, 191);
                }

                out[z] = tempCard;
                System.out.printf("(%.2f,%.2f) - h:%d l:%d\n", x, y, h, l);
                System.out.println(z);

                z++; // make sure this doesn't pull the same card

            }
            length--;
            yOffset += 0.2;// 0.2;
            xOffset++;
        }
        drawBack(g, intXOffset - 2, intYOffset, 191); // indicates remainder of deck to left of first row, top card
        return out;
    }

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame("Card Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the CardTable
        Canvas canvas = new CardTable(cardset);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);
    }
}
