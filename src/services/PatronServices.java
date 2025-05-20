package services;

import model.Patron;

import java.util.HashMap;
import java.util.Map;

public class PatronServices {
    private final Map<String, Patron> patronRegistry = new HashMap<>();

    public void addPatron(Patron patron) {
        patronRegistry.put(patron.getId(), patron);
        System.out.println("Patron added: " + patron.toString());
    }

    public Patron getPatron(String patronId) {
        return patronRegistry.get(patronId);
    }
}
