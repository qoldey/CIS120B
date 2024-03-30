import java.util.concurrent.ThreadLocalRandom;

class Die {

    public int[] sides = { 1, 2, 3, 4, 5, 6 }; // possible sides of die, this is a normal 6 sided
    protected int value; // value of die, what would be facing up if it were on a table

    public Die() {
        this.value = sides[0]; // Default value of 1
    }

    public int roll() {
        int randomValue = ThreadLocalRandom.current().nextInt(0, this.sides.length); // get random pos within sides[]
        this.value = this.sides[randomValue]; // set value to random value on die
        return randomValue;
    }

    public String toString() {
        return String.format("%d", this.value); // return die value as String
    }
}

public class Question5 {
    public static void main(String[] args) {
        Die die = new Die();
        System.out.println(die);

        for (int i = 0; i < 20; i++) {
            die.roll();
            System.out.println(die);
        }
    }

    String Question = """
            Write a class representing a Die. ('Die' is the singular of 'Dice'.)
            The die has six faces.
            Give the class appropriate: instance variable(s), constructor(s),
            an instance method roll() that generates a random value from 1 to 6 for the Die,
            and a toString() method.
            """;
    String Answer = """
            import java.util.concurrent.ThreadLocalRandom;

            class Die {

                public int[] sides = { 1, 2, 3, 4, 5, 6 }; // possible sides of die, this is a normal 6 sided
                protected int value; // value of die, what would be facing up if it were on a table

                public Die() {
                    this.value = sides[0]; // Default value of 1
                }

                public int roll() {
                    int randomValue = ThreadLocalRandom.current().nextInt(0, this.sides.length); // get random pos within sides[]
                    this.value = this.sides[randomValue]; // set value to random value on die
                    return randomValue;
                }

                public String toString() {
                    return String.format("%d", this.value); // return die value as String
                }
            }
                        """;
}
