package org.example;

import java.util.ArrayList;

public class StudentsList {
    static ArrayList<Student> list= new ArrayList<>();
    public static void addStudent(Student student){
        list.add(student);
    }

    public static Student searchByName(String name){
        for(Student student: list)  {
            if(student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }
}
