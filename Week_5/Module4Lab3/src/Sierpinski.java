import java.awt.Canvas;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.Polygon;

// Module4Lab3 - Recursive Sierpinski with Drawing class.
public class Sierpinski extends Canvas {
    // I have been unable to scale down the triangle drawings as needed.

    // I spent most of my time trying to use the drawLine method.
    // I have have been unable to properly scale the Y axis down using drawLine

    // I switched to trying to use the drawPolygon method earlier today.
    // I seem to have gotten closer using drawPolygon, but have run out of time.

    // I think the inverted Y axis is what is messing me up.

    public static int WIDTH = 400;
    public static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sierpinski");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Sierpinski();
        canvas.setSize(WIDTH, HEIGHT);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        int botLeftX = 0;
        int botLeftY = 400;
        int scale = 400;

        Point botLeft = new Point(botLeftX, botLeftY);

        Polygon triangle = new Polygon();
        triangle.addPoint(100, 350); // left
        triangle.addPoint(300, 350); // right
        triangle.addPoint(200, 150); // top

        g.drawPolygon(triangle);

        drawTriangle(g, botLeft, scale);
        drawTriangle(g, botLeft, scale / 2);

    }

    public static void drawTriangle(Graphics g, Point botLeft, int scale) {
        int x = botLeft.x, y = botLeft.y;
        g.drawLine(x, y, x + scale, y);
        g.drawLine(x + scale, y, (x + scale) / 2, scale / 4);
        g.drawLine((x + scale) / 2, scale / 4, x, y);
    }

}