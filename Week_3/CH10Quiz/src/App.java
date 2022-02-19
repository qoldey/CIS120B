import java.awt.Point;
import java.awt.*;
// https://www.stevenlrichardson.com/CIS120/ThinkJava2TrinketV8/thinkjava2_011.html

public class App {

    // 10.1 Point Objects
    // https://trinket.io/java/f9199a0eef
    // Modify the trinket Points to compute and print the distance from the origin
    // to the Point blank. (This is the square root of the sum of the squares of the
    // x-coordinate and the y-coordiante.)

    // Modify the trinket Points to create a second Point and print out its x and y
    // coordinates. Experiment to determine which primitive type the x and y
    // coordinates are. Check your answer by looking up the Java API documentation
    // for java.awt.Point at https://docs.oracle.com/javase/8/docs/api/

    public static void points() {
        Point blank = new Point(3, 4);
        Point pointTwo = new Point(3, 4);
        System.out.printf("Blank: (%d,%d)\n", blank.x, blank.y);
        System.out.printf("pointTwo: (%d,%d)\n", pointTwo.x, pointTwo.y);

        double distance = Math.sqrt(Math.pow(Math.abs(blank.x), 2) + Math.pow(Math.abs(blank.y), 2));
        System.out.printf("blank's Distance from origin: %.2f\n", distance);
        distance = pointTwo.distance(0, 0);
        System.out.printf("pointTwo's Distance from origin: %.2f\n", distance);

        System.out.println(((Object) pointTwo).getClass().getName());
        System.out.println(((Object) pointTwo.x).getClass().getName());
        // https://stackoverflow.com/questions/28475119/how-to-print-type-of-primitive-variables-in-java
    }

    public static void dist() {
        Point p = new Point(3, 4);
        Point q = new Point(6, 8);
        System.out.printf("P: %s\nQ: %s\n", String.valueOf(p.toString()), String.valueOf(q.toString()));
        double dist = p.distance(q); // Point method
        System.out.println("The distance between p and q is " + dist);
    }

    public static void main(String[] args) {
        dist();
    }

    public static void question8() {
        Rectangle r = new Rectangle(0, 0, 20, 50);
        return;
    }
}

// 10.2 Objects as Parameters
// https://trinket.io/java/91d6bc07ca
// Modify the trinket Dist to print out the Point objects p and q by calling the
// toString method explicity, (for example p.toString()).

// Modify the trinket Dist to print out the Point objects p and q directly. (The
// println method invokes goString implicitly.) Interpret what is produced.

// 10.3 Objects as Return Values
// https://trinket.io/java/e81fc671fe
// add find concentric method? Or as a lab?

// 10.4 Rectangles are Mutable
// 10.5 Aliasing Revisited
// 10.6 Java Library Source
// 10.7 Class Diagrams
// Attributes are an object’s data; methods are an object’s code.
// An object’s class definition specifies the attributes and methods that it
// has.
// 10.8 Scope Revisited
// 10.9 Garbage Collection
// 10.10 Mutable vs Immutable
// 10.11 StringBuilder Objects

// 10.13 Exercises
