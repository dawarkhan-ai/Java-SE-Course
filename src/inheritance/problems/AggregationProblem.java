package inheritance.problems;

class Book {
    String tittle;
    String author;

    void showBookDetails() {
        System.out.println("Tittle: " + tittle);
        System.out.println("Author: " + author);
    }

    Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }
}

class Library {
    Book[] book;
    int count = 0;

    Library() {
        book = new Book[10]; // initialize with size 10
    }

    void addBook(Book book) {
        if (count < this.book.length) {
            this.book[count] = book;
            count++;
        } else {
            System.out.println("Library is full.");
        }
    }

    void displayBooks() {
        for (int j = 0; j < count; j++) {
            book[j].showBookDetails();
        }
    }
}

public class AggregationProblem {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Dawar");
        Book b2 = new Book("ADA", "Sabaj");

        Library l1 = new Library();

        l1.addBook(b1);
        l1.addBook(b2);

        l1.displayBooks();
    }
}
