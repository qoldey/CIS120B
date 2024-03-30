public class Question3 {
    private double[] grades;

    public double[] getGrades() {
        return this.grades;
    }

    public static void main(String[] args) {
        Question3 object = new Question3();
        double[] accessor = object.getGrades();
    }

    String Question = """
            Show how to write an accessor for a class that contains an array named grades that is private and of type double. Your accessor should avoid returning a reference to the object’s internal array.
            """;
    String Answer = """
            private double[] grades;

            public double[] getGrades() {
                return this.grades;
            }

            public static void main(String[] args) {
                Question3 object = new Question3();
                double[] accessor = object.getGrades();
            }
                    """;
}
