package org.accolite.dao;

import org.accolite.model.Student;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setRollno(rs.getInt("rollno"));
        student.setName(rs.getString("name"));
        return student;
    }
}