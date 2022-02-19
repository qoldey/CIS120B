//Module 1 Lab 3
public class Pow {
    public static void main(String[] args) {
        double res = power(2, 4);
        System.out.println(res);
    }

    // recursive method to return x^n
    private static double power(double x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * power(x, n - 1);
        }
    }
}
