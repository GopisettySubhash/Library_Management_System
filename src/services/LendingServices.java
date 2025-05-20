package services;

import model.Book;
import model.Patron;

public class LendingServices {
    private final BooksService bookService;

    public LendingServices(BooksService bookService) {
        this.bookService = bookService;
    }

    public void checkoutBook(String isbn, Patron patron) {
        Book book = bookService.findBookByISBN(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            patron.borrowed(book);
            System.out.println("Book checked out: " + book);
        } else {
            System.out.println("Checkout failed. Book not available or not found.");
        }
    }

    public void returnBook(String isbn, Patron patron) {
        Book book = bookService.findBookByISBN(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            patron.returned(book);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Return failed. Book not found or already available.");
        }
    }
}
