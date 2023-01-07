package org.example;

public class Main {
    public static void main(String[] args) {

        StudentsList.addStudent(new Student(1,"Omar"));
        StudentsList.addStudent(new Student(2,"Khaleel"));
        System.out.println(StudentsList.list.size());
    }
}