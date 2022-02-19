//Module 1 Lab 2
public class Stack {
    public static void main(String[] args) {
        System.out.println(prod(1, 5));
    }

    // Not entirely sure if I drew this out properly but my stack diagram can be
    // found @ stack.png

    // method that recursively multiplies n and n-1 until m=n (?)
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return n * prod(m, n - 1);
        }
    }
}
