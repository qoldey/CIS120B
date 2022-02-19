//Module 1 lab 1
public class RecursiveOddSum {
    public static void main(String[] args) {
        int sum = oddSum(-4);
        System.out.println(sum);
    }

    // returns the sum of odd integers from 1 to n
    private static int oddSum(int n) {
        if (n > 0) {
            throw new IllegalArgumentException("n must be <= 0");
        }
        if (n == 0) {
            return n;
        } else {
            return n + oddSum(n + 1);
        }
    }
}
