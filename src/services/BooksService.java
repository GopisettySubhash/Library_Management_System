package services;

import model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksService {
    private final Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Book added: " + book.toString());
    }

    public void removeBook(String isbn) {
        Book removed = inventory.remove(isbn);
        if (removed != null) {
            System.out.println("Book removed: " + removed.toString());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public Book findBookByISBN(String isbn) {
        return inventory.get(isbn);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : inventory.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : inventory.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
}
