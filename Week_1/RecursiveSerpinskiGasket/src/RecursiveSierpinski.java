

public class RecursiveSierpinski {
	
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
	
	public static void sierpinski(Turtle t, double a, int n) {
		if(n == 0) { //base case
			//draw a triangle
			//side length is now a0/(2^n)
			t.down();
			for(int sideNumber = 1; sideNumber <= 3; sideNumber ++) {
				t.forward(a);
				t.left(120);
			}	
			t.up();
		} else { //recursive case - call sierpinski (i.e. ourselves)
			//at lower left, then at lower right, then at top
			//pass one-half the side length and decrement n to n-1
		}
	}

	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.hide();
		t.speed(75); //larger argument = slower
		t.width(0.1);
		//move to lower left location of equilateral triangle
		//with side lengths 400 and set direction = 0 degrees
		double a0 = 400;
		t.up();
		t.setPosition(-a0/2, (-Math.sqrt(3)*a0/2)/2);
		t.setDirection(0);
		
		int depth = 0;
		sierpinski(t, a0, depth);

	}

}

