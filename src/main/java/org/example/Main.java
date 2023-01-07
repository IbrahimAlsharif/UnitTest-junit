package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("White Box Integration Test");
        Student student= new Student();
        student.setId(1);
        student.setName("Omar");
        student.addStudent(student);

        Student student2= new Student();
        student2.setId(2);
        student2.setName("Khaleel");
        student2.addStudent(student);

        System.out.println(Student.list.size());
    }
}