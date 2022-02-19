//Module 1 lab 0
public class RecursiveSum {
    public static void main(String[] args) {
        int sum = sum(4);
        System.out.println(sum);
    }

    // recursively return the sum of n and n-1 until = 0
    private static int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }
}
