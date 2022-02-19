
public class IterativeSierpinski {

	public static void main(String[] args) {

		Turtle t = new Turtle();
		t.hide();
		t.speed(75); // larger argument = slower Turtle
		t.width(0.1);

		// move to lower left location of centered equilateral triangle
		// with side lengths 400 and set direction = 0 degrees
		double a0 = 400;
		t.up(); // do not draw while positioning the Turtle object
		t.setPosition(-a0 / 2, (-Math.sqrt(3) * a0 / 2) / 2);
		t.setDirection(0);

		// draw outer triangle
		// drawTriangle(t, a0);

		// positioned at lower left of outer triangle.
		// now draw three inner triangles with one-half
		// the side length
		double a1 = a0 / 2;
		drawTriangle(t, a1);
		move1To2(t, a1);
		drawTriangle(t, a1);
		move2To3(t, a1);
		drawTriangle(t, a1);
		move3To1(t, a1);

	}

	public static void drawTriangle(Turtle t, double a) {
		t.down(); // *only* have pen down in here!
		for (int i = 0; i < 3; i++) {
			t.forward(a);
			t.left(120);
		}
		t.up();
	}

	public static void move1To2(Turtle t, double a) {
		t.forward(a);
	}

	public static void move2To3(Turtle t, double a) {
		t.left(120);
		t.forward(a);
		t.right(120);
	}

	public static void move3To1(Turtle t, double a) {
		t.left(60);
		t.backward(a);
		t.right(60);
	}

}
