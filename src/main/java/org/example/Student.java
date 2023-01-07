package org.example;

import java.util.ArrayList;

public class Student {
    static ArrayList<Student> list= new ArrayList<>();

    private int id;
    private String name;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        list.add(student);
    }

    public Student searchByName(String name){
      for(Student student: list)  {
          if(student.name.equalsIgnoreCase(name)){
              return student;
          }
      }
      return null;
    }
}
