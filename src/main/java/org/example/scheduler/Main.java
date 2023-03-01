package org.example.scheduler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Group g1 = new Group();

        g1.setName("JavaRo10");
        g1.setTrainer(new Trainer("Mirel","Dudea",LocalDate.of(1992,11,22),true));

        try {
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
            g1.addStudent(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));
        } catch (MaximumNumberOfStudentsReached ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(g1);

//        g1.getStudentsV2().add(new Student("Matei", "Buzera", LocalDate.of(1997, 9, 9), false));


    }
}