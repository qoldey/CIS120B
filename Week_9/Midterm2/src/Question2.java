
class A {
    protected int rank;

    protected int suit;

    public A() {
        this.rank = 1;
        this.suit = 2;
    }
}

class B extends A {

    public B() {
    }
}

public class Question2 {
    public static void main(String[] args) {
        A a;
        B b;

        // a = new B();
        // b = new A();

        // b = a;

        // a = b;
    }

    String Question = """
            Suppose B is a subclass of A and assume both classes have constructors with no arguments. Also assume a is declared to be of type A and b is declared to be of type B. Which of the following statements are legal? Why or why not?

            a. a = new B( );

            b. b = new A( );

            c. b = a;

            d. a = b;
                """;

    String Answer = """
            A: Legal
            B: Illegal
            C: Illegal
            D: Legal

            B "is-a" A. If any method is expecting an A, it can be passed a B. However, if a method is expecting a B, it cannot be passed an A.
            "a" can be "b", but not vice-versa.

                """;
}
