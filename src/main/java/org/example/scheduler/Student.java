package org.example.scheduler;

import java.time.LocalDate;

public class Student extends Person {

    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public boolean hasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}
