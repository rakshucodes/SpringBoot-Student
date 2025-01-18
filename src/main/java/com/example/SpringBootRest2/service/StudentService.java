package com.example.SpringBootRest2.service;

import com.example.SpringBootRest2.model.Student;
import com.example.SpringBootRest2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public String getHello()
    {
        return repo.sayHello();
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public void addStudent(Student student) {
        repo.addStudent(student);
    }

    public Student getStudent(int rollno) {
        return repo.getStudent(rollno);
    }

    public Student updateStudent(Student student) {
        return repo.updateStudent(student);
    }

    public void deleteStudent(int rollno) {
        repo.removeStudent(rollno);
    }
}
