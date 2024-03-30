import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3 };

        int b = sumArray(a);

        int c = sumArray3(a, a.length - 1);

        System.out.println(c);

    }

    public static int sumArray(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int sumArray3(int[] a, int n) { // SUBMITTED
        if (n == 0) {
            return a[n];
        } else {
            return a[n] + sumArray3(a, n - 1);
        }
    }

    public static int sumArray2(int[] a) {
        if (1 == a.length) {
            return a[a.length - 1];
        } else {
            return a[0] + sumArray2(Arrays.copyOfRange(a, 1, a.length));
        }
    }
}
