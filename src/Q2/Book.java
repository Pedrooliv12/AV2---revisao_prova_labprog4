package Q2;

public class Book extends Publication {
    private String author;
    private String isbn;

    public Book(String title, String identificationCode, Integer quantity, String author, String isbn) {
        super(title, identificationCode, quantity);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public int getReturnPeriod() {
        return 14;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" + "author=" + author + ", isbn=" + isbn + '}';
    }
}
