public class Question4 {
    String Question = """
            Draw a UML diagram representing the class Counter.
            It has one private instance variable representing the value of the counter.
            It has a default constructor.
            It has three instance methods:
            increment() adds one to the counter value,
            getValue()returns the current counter value,
            and it has a toString() method.
            """;
    String Answer = """
            ../QuestionFour.png
                    """;
}

class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public void increment(int n) {
        this.value += n;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return String.format("%d", this.value);
    }

}
