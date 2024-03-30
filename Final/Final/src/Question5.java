public class Question5 {
    public static void main(String[] args) {

        Laptop a = new Laptop("Lenovo", 6);
        Laptop b = new Laptop("Lenovo", 6);
        Laptop c = new Laptop("Razer", 12);

        System.out.println(a);

        System.out.println(b.equals(a));

    }
}

class Laptop {
    private int numCPU;
    private String mfr;

    public Laptop(String mfr, int numCPU) {
        this.mfr = mfr;
        this.numCPU = numCPU;
    }

    public String toString() {
        return String.format("%s machine w/ %d CPU(s)", this.mfr, this.numCPU);
    }

    public boolean equals(Laptop that) {
        return this.mfr == that.mfr && this.numCPU == that.numCPU;
    }

}