public class Rational {

    // Two integer instance variables - one representing the numerator and one
    // representing the denominator
    // I changed it to double.

    // when making these private, I am unable to access them from within
    // RationalClient.java
    double numerator;
    double denominator;

    // default constructor
    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }

    // A value constructor that accepts two integers. (The denominator should never
    // be equal to zero)

    public Rational(double numerator, double denominator) {
        if (!(denominator == 0)) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator cannot equal 0");
        }
    }

    // Getters and setters. These are instance methods
    // instance methods are not static. They use "this" to refer to objects

    public double getNumerator() {
        return this.numerator;
    }

    public double getDenominator() {
        return this.denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    // The toString instance method
    public String toString() {
        return String.format("%.2f/%.2f", this.numerator, this.denominator);
    }

    // The equals instance method

    public boolean equals(Rational that) {
        final double DELTA = 0.001;
        return this.numerator == that.numerator
                && this.denominator == that.denominator
                || Math.abs(this.numerator / this.denominator - that.numerator / that.denominator) < DELTA;

    }
    // An instance method named negate that reverses the sign of the object it is
    // called on.

    public void negate() {
        this.numerator = -this.numerator;
    }

    // An instance method named invert that inverts the object is is called on.
    public void invert() {
        double temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    // A static method named reduce that accepts a Rational argument and returns a
    // new Rational object which is in reduced form.
    public static Rational reduce(Rational r1) {
        double factor = gcd(r1.numerator, r1.denominator);
        r1.setNumerator(r1.numerator / factor);
        r1.setDenominator(r1.denominator / factor);
        return r1;
    }

    // find greatest common denominator.
    public static double gcd(double a, double b) {
        if (a == 0) {
            return b;
        } else {
            return gcd(b % a, a);
        }
    }

    // /An instance method named add which accepts a Rational argument, adds it to
    // this, and returns the result as a Rational object.
    public Rational add(Rational that) {
        double commonDenominator = this.denominator * that.denominator;
        double numerator01 = this.numerator * that.denominator;
        double numerator02 = that.numerator * this.denominator;
        double numerator03 = numerator01 + numerator02;
        double factor = gcd(numerator03, commonDenominator);
        return new Rational(numerator03 / factor, commonDenominator / factor);
    }

    // An instance method named toDouble that converts the Rational object to a
    // double and returns the result.
    public double toDouble() {
        return this.numerator / this.denominator;
    }
}
