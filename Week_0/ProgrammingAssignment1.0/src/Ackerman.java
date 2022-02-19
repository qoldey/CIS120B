public class Ackerman {
    public static void main(String[] args) throws Exception {

        int res = ack(3, 4);
        System.out.println(res);

    }

    private static int ack(int m, int n) {

        int result = 0;
        if (m == 0) { // base case
            result = n + 1;
        } else if (m > 0 && n == 0) { // check
            result = ack(m - 1, 1);
        } else if (m > 0 && n > 0) { // recursive calls
            result = ack(m - 1, ack(m, n - 1));
        }
        return result;
    }
}
