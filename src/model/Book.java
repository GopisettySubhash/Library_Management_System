package model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private Integer publicatonYear;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isAvailable=" + isAvailable +
                ", publicatonYear=" + publicatonYear +
                '}';
    }

    public Book(String title, String author, String isbn, boolean isAvailable, Integer publicatonYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
        this.publicatonYear = publicatonYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Integer getPublicatonYear() {
        return publicatonYear;
    }

    public void setPublicatonYear(Integer publicatonYear) {
        this.publicatonYear = publicatonYear;
    }
}
