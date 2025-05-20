import model.Book;
import model.Patron;
import services.BooksService;
import services.LendingServices;
import services.PatronServices;

public class Main {
    public static void main(String[] args) {

        System.out.println("Library Management System Started...");


        BooksService bookService = new BooksService();
        PatronServices patronService = new PatronServices();
        LendingServices lendingService = new LendingServices(bookService);


        Book book1 = new Book("1984", "George Orwell", "123456789", true,3000);
        Book book2 = new Book("To Kill", "Lee", "987654321",true, 1960);

        bookService.addBook(book1);
        bookService.addBook(book2);


        Patron patron1 = new Patron("P001", "Alice Smith");
        patronService.addPatron(patron1);


        lendingService.checkoutBook("123456789", patron1);
        lendingService.returnBook("123456789", patron1);

        // Print borrowed history
        patron1.printBorrowHistory();

    }
}