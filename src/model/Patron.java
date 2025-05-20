package model;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String id;
    private List<Book> borrowedList = new ArrayList<>();
    private List<Book> historyOfBorrowedBooks = new ArrayList<>();

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", borrowedList=" + borrowedList +
                ", historyOfBorrowedBooks=" + historyOfBorrowedBooks +
                '}';
    }

    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Book> getBorrowedList() {
        return borrowedList;
    }

    public void borrowed(Book borrowedBook) {
        borrowedList.add(borrowedBook);
    }

    public void returned(Book borrowedBook) {
        borrowedList.remove(borrowedBook);
    }

    public List<Book> getHistoryOfBorrowedBooks() {
        return historyOfBorrowedBooks;
    }

    public void setHistoryOfBorrowedBooks(List<Book> historyOfBorrowedBooks) {
        this.historyOfBorrowedBooks = historyOfBorrowedBooks;
    }

    public void printBorrowHistory() {
        System.out.println();
    }
}
