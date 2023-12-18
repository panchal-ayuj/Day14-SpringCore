package org.accolite.dao;

import org.accolite.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate template) {this.jdbcTemplate = template; }

    public int createStudent(int rollNo, String name) {
        String sql = "INSERT INTO student(rollno, name) values(?, ?)";
        return jdbcTemplate.update(sql, rollNo, name);
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public String getStudent(int rollno) {
        String sql = "select * from student where rollno = " + rollno;
        Student student = jdbcTemplate.query(sql, new ResultSetExtractor<Student>() {
            @Override
            public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
                Student student = new Student();

                while (rs.next()) {
                    student.setRollno(rs.getInt("rollno"));
                    student.setName(rs.getString("name"));

                }
                return student;
            }
        });
        return student.getName();
    }
}
