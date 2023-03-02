package org.example.scheduler;

import org.example.scheduler.exception.MaximumNumberOfStudentsReached;
import org.example.scheduler.model.Group;
import org.example.scheduler.model.Person;
import org.example.scheduler.model.Student;
import org.example.scheduler.model.Trainer;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import static org.example.scheduler.repository.Storage.*;

public class Main {
    public static void main(String[] args) {

        Group g1 = new Group();

        g1.setName("JavaRo10");
        g1.setTrainer(new Trainer("Mirel", "Dudea", LocalDate.of(1992, 11, 22), true));

        try {
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Alex", "Dunca", LocalDate.of(1995, 5, 11), false));
            g1.addStudent(new Student("Cosmin", "Radoi", LocalDate.of(1978, 9, 9), true));
            g1.addStudent(new Student("Andrei", "Balan", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Luca", "Dinescu", LocalDate.of(1997, 9, 9), true));
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
        } catch (MaximumNumberOfStudentsReached ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(g1);

        getGroups().stream().forEach(System.out::println);
        System.out.println();

        sortStudentAlphabetically();
        getGroupsWithMaximumNumberOfStudents();
        sortStudentsByTrainer();
        getStudentWithJavaKnowledge();
        getGroupsWithMostStudentsWithoutJavaKnowledge();
        getStudentsYoungerThan25();
        removeStudentsYoungerThan20();
    }

    // 1. All students sorted alphabetically by lastName
    public static void sortStudentAlphabetically() {
        System.out.println("1. All students sorted alphabetically by lastName");
        getStudents().stream().sorted(Comparator.comparing(Person::getLastName)).forEach(System.out::println);
        System.out.println();
    }

    // 2. The groups with maximum number of students
    public static void getGroupsWithMaximumNumberOfStudents() {
        System.out.println("2. The groups with maximum number of students");
        // Var 1
        getGroups().stream().filter(group -> group.getStudents().size() == 4).forEach(System.out::println);

        // Var 2
        for (int i = 0; i < getGroups().size(); i++) {
            if (getGroups().get(i).getStudents().size() == 4) {
                System.out.println(getGroups().get(i).getName());
            }
        }
        System.out.println();
        // Var 3
        Group groupWithMostStudents = getGroups().stream().max((o1, o2) -> {
            int nrOfStudentsForGroup1 = o1.getStudents().size();
            int nrOfStudentsForGroup2 = o2.getStudents().size();
            return Integer.compare(nrOfStudentsForGroup1, nrOfStudentsForGroup2);
        }).orElse(null);
        System.out.println(groupWithMostStudents.getName());
        System.out.println();
    }

    // 3. All students grouped by trainer that teaches to them
    public static void sortStudentsByTrainer() {
        System.out.println("3. All students grouped by trainer that teaches to them");
        Map<Trainer, Set<Student>> trainersWithStudents = new HashMap<>();
        List<Group> groups = getGroups();
        for (Group g : groups) {
            if (!trainersWithStudents.containsKey(g.getTrainer())) {
                trainersWithStudents.put(g.getTrainer(), g.getStudents());
            } else {
                Set<Student> existingStudents = trainersWithStudents.get(g.getTrainer());
                existingStudents.addAll(g.getStudents());
                trainersWithStudents.put(g.getTrainer(), existingStudents);
            }
        }
        displayTrainersWithTheirStudents(trainersWithStudents);
        System.out.println();
    }

    private static void displayTrainersWithTheirStudents(Map<Trainer, Set<Student>> trainersWithStudents) {
        trainersWithStudents.forEach((trainer, students) -> {
            displayTrainerWithStudents(trainer, students);
        });
    }

    private static void displayTrainerWithStudents(Trainer trainer, Set<Student> students) {
        System.out.println("For Trainer: " + trainer);
        System.out.println("Trainer has: " + students.size());
        System.out.println("The list of students is: " + students);
    }

    // 4. All students with previous java knowledge
    public static void getStudentWithJavaKnowledge() {
        System.out.println("4. All students with previous java knowledge");
        getStudents().stream().filter(student -> student.hasPreviousJavaKnowledge() == true).forEach(System.out::println);
        System.out.println();
    }

    // 5. The groups with the highest number of students with no previous java knowledge
    public static void getGroupsWithMostStudentsWithoutJavaKnowledge() {
        System.out.println("5. The groups with the highest number of students with no previous java knowledge");

        Group groupWithMostStudentsWithNoJavaKnowledge = getGroups().stream().max((o1, o2) -> {
            int nrOfStudentsForGroup1 = o1.getStudents().stream().filter(student -> !student.hasPreviousJavaKnowledge()).toList().size();
            int nrOfStudentsForGroup2 = o2.getStudents().stream().filter(student -> !student.hasPreviousJavaKnowledge()).toList().size();
            return Integer.compare(nrOfStudentsForGroup1, nrOfStudentsForGroup2);
        }).orElse(null);
        System.out.println(groupWithMostStudentsWithNoJavaKnowledge.getName());

        System.out.println();
    }

    // 6. All students younger than 25, from all groups
    public static void getStudentsYoungerThan25() {
        System.out.println("6. All students younger than 25, from all groups");


        getStudents().stream().filter(student -> student.getDateOfBirth()
                        .isAfter(LocalDate.ofYearDay(1998, 1)))
                .forEach(System.out::println);
        System.out.println();
    }

    // 7. Remove all the students younger than 20 from all groups
    public static void removeStudentsYoungerThan20() {
        System.out.println("7. Remove all the students younger than 20 from all groups");
        getStudents().removeIf(student -> student.getDateOfBirth()
                .isAfter(LocalDate.ofYearDay(2002, 1)));
        System.out.println("Size of the new student list: " + getStudents().size());
    }
}
