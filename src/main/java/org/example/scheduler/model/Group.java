package org.example.scheduler.model;

import org.example.scheduler.exception.MaximumNumberOfStudentsReached;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Group {

    private String name;

    private Trainer trainer;

    private Set<Student> students = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Set<Student> getStudents() {
        Set<Student> studentsCopy = new HashSet<>();
        studentsCopy.addAll(this.students);
        return studentsCopy;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if (students.size() >= 5) {
            throw new MaximumNumberOfStudentsReached("Group limit reached");
        } else {
            students.add(student);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", students=" + students +
                '}';
    }
}

