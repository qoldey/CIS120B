public class RationalClient {
    // thoroughly tests Rational class.
    public static void main(String[] args) {
        Rational ratio00 = new Rational(); // default constructor
        ratio00.setNumerator(10); // utilize setters
        ratio00.setDenominator(5);

        Rational ratio01 = new Rational(10, 5); // value constructor

        System.out.println(ratio01.denominator);

        String toString = ratio01.toString(); // toString
        System.out.println(toString); // prints the same
        System.out.println(ratio01.toString()); // print using toString
        System.out.println();

        double multiplier;

        multiplier = 2;
        multiply(ratio01, multiplier);
        testEqual(ratio00, ratio01); // true true

        multiplier = 0.5; // I changed the instance variables to doubles so I could multiply by fractions.
        multiply(ratio00, multiplier);
        testEqual(ratio00, ratio01); // true true

        ratio00.negate();// negate
        ratio01.negate();
        testEqual(ratio00, ratio01); // true true

        ratio00.negate();
        testEqual(ratio00, ratio01); // false false
        ratio01.negate();

        ratio00.invert(); // invert
        ratio01.invert();
        testEqual(ratio00, ratio01); // true true

        ratio00.invert();
        testEqual(ratio00, ratio01); // false false
        ratio01.invert();

        ratio00.invert();
        ratio01.invert();
        testEqual(ratio00, ratio01); // true true

        System.out.println(ratio01);
        Rational.reduce(ratio01); // This changes ratio01 and also returns the reduced Rational?
        System.out.println(ratio01);
        testEqual(ratio00, ratio01); // true true

        ratio00 = new Rational(4, 10);
        ratio01 = new Rational(5, 10);
        Rational ratio02 = ratio01.add(ratio00);// add
        System.out.println(ratio02);

        double asDouble01 = ratio02.toDouble(); // toDouble
        System.out.println(asDouble01);

    }

    private static void testEqual(Rational ratio00, Rational ratio01) {
        print(ratio01.equals(ratio00), " ", ratio00.equals(ratio01));// test equality
    }

    private static void multiply(Rational ratio, double multiplier) {
        ratio.setNumerator(ratio.getNumerator() * multiplier); // utilize getters
        ratio.setDenominator(ratio.getDenominator() * multiplier);

    }

    public static void print(Object... in) {
        for (Object a : in) {
            System.out.print(a);
        }
        System.out.println();

    }

}
