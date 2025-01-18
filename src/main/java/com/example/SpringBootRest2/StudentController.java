package com.example.SpringBootRest2;

import com.example.SpringBootRest2.model.Student;
import com.example.SpringBootRest2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("hello")
    public String getHello()
    {
        return service.getHello();
    }

    @GetMapping("students")
    public List<Student> getAllStudents()
    {
        return service.getAllStudents();
    }

    @GetMapping("students/{rollno}")
    public Student getStudent(@PathVariable int rollno)
    {
        return service.getStudent(rollno);
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student)
    {
        service.addStudent(student);
    }

    @PutMapping("students")
    public Student updateStudent(@RequestBody Student student)
    {
        return service.updateStudent(student);
    }

    @DeleteMapping("students/{rollno}")
    public String deleteStudent(@PathVariable  int rollno)
    {
        service.deleteStudent(rollno);
        return "Deleted";
    }
}
