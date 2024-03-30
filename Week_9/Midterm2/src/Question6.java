public class Question6 {
    String Question = """
            Consider the following class definition:

            public class Book {
               private String title;
               private int numPages;
               public Book(String title, in numPages) {
                  //stuff
               }
            }

            Show how to declare an object reference of type Book named myBook.
            assign it to an instance of the class.
            Show how to invoke the method toString().
            Explain why your method invocation will compile and run even though there is no method named toString() in class Book.
            What value is returned by the method call?
                        """;
    String Answer = """
                public static void main(String[] args) {
                    Book myBook = new Book('War & Peace', 1000);
                    System.out.println(myBook);
                }

            All Java classes are somehow derived from the Object class.
            The Object class contains an internal toString() that is automatically invoked by the compiler.
            This toString() will return a pointer to the object that you are referencing.
            We can override the default toString method within our classes.
            This may look something like:
                public String toString() {
                    return String.format('%s', this.title);
                }
            If we were to include this in our class, we would instead see the title of the book printed.
                        """;

    public static void main(String[] args) {
        Book myBook = new Book("War & Peace", 1000);
        System.out.println(myBook);
    }
}

class Book {
    private String title;
    private int numPages;

    public Book(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
    }

    public String toString() {
        return String.format("%s", this.title);
    }
}