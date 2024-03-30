public class Question3 {

    public static void main(String[] args) {

        double[] a = { 2.5, 2.1, 3 };
        double[] b = copyArray(a);

        System.out.println(a);
        System.out.println(b);
        printArray(a);
        printArray(b);

    }

    private static double[] copyArray(double[] a) {
        return a.clone();
    }

    private static void printArray(double[] a) {
        for (double d : a) {
            System.out.print(d);
        }
        System.out.println();
    }
}
