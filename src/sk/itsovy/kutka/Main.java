package sk.itsovy.kutka;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student Erik = new Student ("Erik", "Lorinc");
        Student Filipko = new Student ("Filipko", "Cukríček");
        Group g1 = new Group("1.N", 5);
        g1.addStudent(Erik);
        g1.addStudent(Filipko);
        g1.print();
        System.out.println("***************************************");
        g1.randomStudent();
        System.out.println(Filipko.getYear());
        Erik.addSubject("MAT");
        Erik.addSubject("SLJ");
        Erik.addSubject("PRO");
        Erik.addSubject("WEB");
        Erik.addSubject("TST");
        Erik.addSubject("LSY");
        System.out.println(Erik.getSubjects());

    }
}
