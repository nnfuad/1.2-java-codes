public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99));
        library.addBook(new Book("1984", "George Orwell", "9780451524935", 9.99));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467", 7.99));

        Book book = library.searchBookByIsbn("9780451524935");
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found");
        }
    }
}
}