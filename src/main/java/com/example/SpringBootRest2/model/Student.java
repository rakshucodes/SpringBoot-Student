package com.example.SpringBootRest2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollno;
    private String name;
    private float percentage;
    private char section;


    public Student(int rollno, String name, float percentage, char section) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.section = section;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", section=" + section +
                '}';
    }
}
