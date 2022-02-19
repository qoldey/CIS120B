import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class Bouncing extends Canvas {
    // The graphics coordinate plane makes things strange
    public static int WIDTH = 400;
    public static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Bouncing();
        canvas.setSize(WIDTH, HEIGHT);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Random rng = new Random();
        int x, y;
        x = rng.nextInt(WIDTH); // random starting x < w
        y = rng.nextInt(HEIGHT); // random starting y < l
        bounce(g, x, y);
    }

    public void bounce(Graphics g, int x, int y) {
        int xChange, yChange;
        xChange = 1;
        yChange = xChange;
        int scale = 10; // 10 pixels.
        while (true) {
            System.out.printf("(%d,%d)\n", x, y);
            // Handle moving outside the boundaries of the JFrame container of your Canvas.
            if (x > WIDTH - scale || x < scale) {
                xChange = -xChange;
            }
            if (y > HEIGHT - scale || y < scale) {
                yChange = -yChange;
            }
            g.fillOval(x, y, scale, scale); // Draw the figure
            x += xChange; // Change the location the figure
            y += yChange; // is to be displayed at
            try {
                Thread.sleep(70); // Wait some number of milliseconds so that the figure persists awhile
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.clearRect(x, y, WIDTH, HEIGHT); // Erase the previously displayed figure
        }
    }
}