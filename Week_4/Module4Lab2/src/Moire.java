import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Moire();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        int i = 90;
        String paintString = "hello";
        // char[] string = paintString.toCharArray();
        while (i < getWidth()) {
            g.drawString(paintString, 50, i);
            g.drawString(paintString, 100, i);
            g.drawString(paintString, 150, i);
            g.drawString(paintString, 20, i);
            g.drawString(paintString, 250, i);
            g.drawString(paintString, 300, i);
            g.drawString(paintString, 350, i);
            g.drawString(paintString, 400, i);
            g.drawString(paintString, 450, i);
            // g.drawChars(string, 0, i / 2, i, i);
            // g.drawOval(0, 0, i, i);
            i = i + 3;
        }
    }

}
// char[] string = paintString.toCharArray();

// g.drawChars(string, 0, i / 2, i, i);
