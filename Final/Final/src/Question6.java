public class Question6 {

}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

}