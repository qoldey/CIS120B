import java.util.concurrent.ThreadLocalRandom;

class Die {

    private int faceValue;

    public Die(int initialValue) {
        faceValue = initialValue;
    }

    public Die() {
        this(1);
    }

    // accessor
    public int getFace() {
        return faceValue;
    }

    public int[] sides = { 1, 2, 3, 4, 5, 6 }; // 6 sided die
    // set random value from sides[] as faceValue

    public void roll() {
        this.faceValue = this.sides[ThreadLocalRandom.current().nextInt(0, this.sides.length)];
    }

    public String toString() {
        return String.format("%d", this.faceValue);
    }

}

public class Question4 {

    public static void main(String[] args) {
        Die d = new Die();

        int a = d.getFace();
        System.out.println(a);

    }
}