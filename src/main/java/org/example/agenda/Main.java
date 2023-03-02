package org.example.agenda;

/**
 * Agenda telefonica
 * Creati o agenda pentru numere de telefon de capacitate 100;
 * Putem sa adaugam un numar in agenda doar daca nu s-a atins capacitatea maxima;
 * Putem sa cautam in agenda dupa un numar de telefon sa vedem daca acesta exista sau nu;
 * Putem sa afisam toate numerele de telefon existente in agenda.
 */
public class Main {

    public static void main(String[] args) {

        Contact c1 = new Contact("Andrei", "0733742000");
        Contact c2 = new Contact("Matei", "0722584545");
        Contact c3 = new Contact("Cosmin", "0755432423");
        Contact c4 = new Contact("Cosmin", "0755432423");

        Agenda agenda = new Agenda();

        agenda.addContact(c1);
        agenda.addContact(c2);
        agenda.addContact(c3);

        agenda.isContactFound(c1);

        System.out.println(agenda.isContactFound(c4));
        System.out.println(agenda.isContactFound(c1));
        System.out.println(agenda);

    }
}
