
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    public static int maxX = 400;
    public static int maxY = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing drawing = new Drawing();

        drawing.setSize(maxX, maxY);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g) {

        int runs = 10;

        paintN(g, runs, maxX, maxY);
    }

    // modify it so that it renders 10 filled circles with random locations,
    // random radii, and random colors
    public static void paintN(Graphics pen, int runs, int maxX, int maxY) {

        Random rand = new Random();

        for (int i = 0; i < runs; i++) {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();

            Color c = new Color(r, g, b);
            int z = rngMinMax(10, 100);

            pen.setColor(c);
            pen.fillOval(rngMinMax(0, maxX - z), rngMinMax(0, maxY - z), z, z);
        }

    }

    public static int rngMinMax(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}