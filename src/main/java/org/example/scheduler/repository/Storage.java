package org.example.scheduler.repository;

import com.github.javafaker.Faker;
import org.example.scheduler.model.Group;
import org.example.scheduler.model.Student;
import org.example.scheduler.model.Trainer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<Student> students = new ArrayList<>();

    private static List<Trainer> trainers = new ArrayList<>();

    private static List<Group> groups = new ArrayList<>();

    private static Faker faker = new Faker();

    static {
        for (int i = 0; i < 15; i++) {
            Student student = new Student(faker.name().firstName(), faker.name().lastName(),
                    LocalDate.of(faker.number().numberBetween(1975, 2005), faker.number().numberBetween(1, 12),
                            faker.number().numberBetween(1, 28)), faker.random().nextBoolean());
            students.add(student);
        }
        for (int i = 0; i < 3; i++) {
            Trainer trainer = new Trainer(faker.name().firstName(), faker.name().lastName(),
                    LocalDate.of(faker.number().numberBetween(1975, 2005), faker.number().numberBetween(1, 12),
                            faker.number().numberBetween(1, 28)), true);
            trainers.add(trainer);
        }
        for (int i = 0; i < 4; i++) {
            Group group = new Group();
            group.setName("Group" + (i+1));
            if(i == 3){
                group.setTrainer(trainers.get(faker.number().numberBetween(0,2)));
            }else{
                group.setTrainer(trainers.get(i));
            }
            groups.add(group);
        }

        groups.get(0).addStudent(students.get(0));
        groups.get(0).addStudent(students.get(1));
        groups.get(0).addStudent(students.get(2));
        groups.get(0).addStudent(students.get(3));

        groups.get(1).addStudent(students.get(4));
        groups.get(1).addStudent(students.get(5));
        groups.get(1).addStudent(students.get(6));
        groups.get(1).addStudent(students.get(7));

        groups.get(2).addStudent(students.get(8));
        groups.get(2).addStudent(students.get(9));
        groups.get(2).addStudent(students.get(10));

        groups.get(3).addStudent(students.get(11));
        groups.get(3).addStudent(students.get(12));
        groups.get(3).addStudent(students.get(13));
        groups.get(3).addStudent(students.get(14));


    }
    public static List<Student> getStudents() {
        return students;
    }

    public static List<Trainer> getTrainers() {
        return trainers;
    }

    public static List<Group> getGroups() {
        return groups;
    }
}
