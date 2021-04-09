package com.bonnysid.labs.labs.model;

import com.bonnysid.labs.labs.annotation.DefaultName;

import java.util.List;

public class Student {
    @DefaultName(name = "Dear st")
    private String name;
    private List<Integer> marks;

    public Student() {
    }

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
