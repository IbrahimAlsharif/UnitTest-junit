package org.example;

import java.util.ArrayList;

public class Student {

public  Student(int id, String name){
    this.id= id;
    this.name=name;
}
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


}
