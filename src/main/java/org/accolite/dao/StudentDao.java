package org.accolite.dao;

import org.accolite.model.Student;

import java.util.List;

public interface StudentDao {
    public int createStudent(int rollNo, String name);

    public List<Student> getAllStudents();

    public String getStudent(int rollno);
}
