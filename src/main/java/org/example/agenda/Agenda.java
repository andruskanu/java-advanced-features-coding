package org.example.agenda;

import java.util.HashSet;
import java.util.Set;

public class Agenda {

    private static final int MAX_CAPACITY = 100;
    private Set<Contact> contactsList;

    public Agenda() {
        this.contactsList = new HashSet<>();
    }

    public void addContact(Contact contact) {
        if (contactsList.size() <= MAX_CAPACITY) {
            contactsList.add(contact);
        } else {
            System.out.println("Memory full");
        }
    }

    public boolean isContactFound(Contact contact) {
        boolean result = contactsList.stream().anyMatch(c -> c.equals(contact));
        return result;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contactsList=" + contactsList +
                '}';
    }
}


