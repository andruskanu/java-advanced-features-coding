package org.example.scheduler.model;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return  Objects.equals(super.getFirstName(), student.getFirstName()) &&
                Objects.equals(super.getLastName(), student.getLastName()) &&
                Objects.equals(super.getDateOfBirth(), student.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getFirstName(), super.getLastName(), super.getDateOfBirth());
    }
}
