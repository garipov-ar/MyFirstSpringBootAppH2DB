package ru.garipov.MyFirstSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.garipov.MyFirstSpringBootAppH2DB.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    boolean deleteStudent(int id);
}
