import java.awt.Color; // rgb color 

//cleaned up recursive method from previous class.
public class recursiveSierpinski {
    public static void main(String[] args) {
        Turtle pen = new Turtle();

        double scale = 400;
        double depth = 4;
        double width = 0.1;
        boolean hidePen = true;
        double speed = 1;

        gasket(pen, depth, settings(pen, width, hidePen, speed, scale)); // draw figure w/ settings
        Turtle.zoomFit();
    }

    public static void gasket(Turtle pen, double n, double scale) {
        if (n == 0) {
            drawTriangle(pen, scale); // Base case
            return;
            // draw layer then fill in each triangle with another figure until n==0
        } else {
            // always start at the lower-left-hand corner
            // drawTriangle(pen, scale / 2); // draw triangle / 2
            // move1To2(pen, scale / 2); // move to right
            // drawTriangle(pen, scale / 2); // triangle / 2
            // move2To3(pen, scale / 2); // move to top
            // drawTriangle(pen, scale / 2); // triangle / 2
            // move3To1(pen, scale / 2); // move down
            gasket(pen, n - 1, scale / 2); // gasket / 2 with n - 1 in bottom left
            move1To2(pen, scale / 2); // move to right
            gasket(pen, n - 1, scale / 2); // gasket / 2 with n - 1 in bottom right
            move2To3(pen, scale / 2); // move to top
            gasket(pen, n - 1, scale / 2); // gasket / 2 with n - 1 on top
            move3To1(pen, scale / 2); // move to bottom left (always start here)
        }
    }

    public static double settings(Turtle pen, double width, boolean hide, double speed, double scale, Color... c) {
        Color bColour, pColour;
        pen.up();
        bColour = new Color(17, 50, 77);
        pColour = new Color(220, 184, 255);
        if (hide == true) {
            pen.hide();
        }
        if (c.length > 0) { // if given color options, assign color to variables.
            pColour = c[0];
        } else if (c.length > 1) {
            bColour = c[1];
        }
        pen.penColor(pColour); // pencolor
        Turtle.bgcolor(bColour); // background colour
        pen.width(width);
        pen.speed(speed);
        return scale; // return passed scale
    }

    public static void drawTriangle(Turtle pen, double scale) {
        pen.down();
        for (int i = 0; i < 3; i++) {
            pen.forward(scale);
            pen.left(120);
        }
        pen.up();
    }

    public static void move1To2(Turtle pen, double scale) {
        pen.up();
        pen.forward(scale);
        pen.down();
    }

    public static void move2To3(Turtle pen, double scale) {
        pen.up();
        pen.left(120);
        pen.forward(scale);
        pen.right(120);
        pen.down();
    }

    public static void move3To1(Turtle pen, double scale) {
        pen.up();
        pen.left(60);
        pen.backward(scale);
        pen.right(60);
        pen.down();
    }

}