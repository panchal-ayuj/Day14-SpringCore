package org.accolite;

import org.accolite.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class SpringJDBCConfig {
    @Bean
    public JdbcTemplate jdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource((DataSource) context.getBean("dataSource"));
        return jdbcTemplate;
    }

    @Bean
    public StudentDaoImpl getStudentDao() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(jdbcTemplate());
        return studentDao;
    }
}
