package com.example.SpringBootRest2.repo;

import com.example.SpringBootRest2.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> stu = new ArrayList<Student>(Arrays.asList(
            new Student(1,"Rakshith",93.60F,'C'),
            new Student(2,"Rakshi",83.60F,'C'),
            new Student(3,"Rakshu",91.00F,'B'),
            new Student(4,"Raksh",77.25F,'A'),
            new Student(5,"Rakshith Kumar",93.60F,'C')
    ));


    public String sayHello()
    {
        return "Hello";
    }

    public List<Student> getAllStudents() {
        return stu;
    }

    public Student getStudent(int rollno) {
        for(Student s : stu)
        {
            if(s.getRollno() == rollno)
            {
                return s;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        stu.add(student);
    }


    public Student updateStudent(Student student) {
        for(Student s : stu)
        {
            if(s.getRollno() == student.getRollno())
            {
                s.setRollno(student.getRollno());
                s.setName(student.getName());
                s.setPercentage(student.getPercentage());
                s.setSection(student.getSection());

                return s;
            }
        }
            return null;
    }

    public void removeStudent(int rollno) {
        for(Student s : stu)
        {
            if(s.getRollno() == rollno)
            {
                stu.remove(s);
            }
        }
    }
}
