package org.accolite;

import org.accolite.dao.StudentDao;
import org.accolite.dao.StudentDaoImpl;
import org.accolite.model.Address;
import org.accolite.model.Employee;
import org.accolite.service.TestAnnotationDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Random;

@ComponentScan(basePackages = "org.accolite")
public class App {
    @Bean
    public Employee emp1() {
        return new Employee(8,"Ayuj","ayujpanchal@gmail.com",List.of("121","1212","12121"),new Address("N1","N2"), Map.of(1,"P1",2,"P2",3,"P3") );
    }

    @Bean
    public Employee emp2() {
        Employee employee = new Employee();
        employee.setId(9);
        employee.setName("Setter");
        employee.setEmailId("setter@gmail.com");
        employee.setAddress(new Address("A1", "A2"));
        employee.setPhoneNumbers(List.of("1","2","3"));
        employee.setProjects(Map.of(1,"P1",2,"P2",3,"P3"));
        return employee;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp1 = (Employee) context.getBean("employee1");
        System.out.println(emp1);
        Employee emp2 = (Employee) context.getBean("employee2");
        System.out.println(emp2);
        Employee emp3 = (Employee) context.getBean("employee3");
        System.out.println(emp3);
        Employee emp4 = (Employee) context.getBean("employee4");
        System.out.println(emp4);
        Employee emp5 = (Employee) context.getBean("employee5");
        System.out.println(emp5);
        Employee emp6 = (Employee) context.getBean("employee6");
        System.out.println(emp6);
        Employee emp7 = (Employee) context.getBean("employee7");
        System.out.println(emp7);

        ApplicationContext context2 = new AnnotationConfigApplicationContext(App.class);
        Employee emp11 = (Employee) context2.getBean("emp1");
        System.out.println(emp11);
        Employee emp12 = (Employee) context2.getBean("emp2");
        System.out.println(emp12);

        ApplicationContext context3 = new AnnotationConfigApplicationContext(App.class);
        TestAnnotationDI testAnnotationDI = (TestAnnotationDI) context3.getBean("testannotationdi");
        testAnnotationDI.testSendMessage();

        ApplicationContext context4 = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
        StudentDao studentDao = context4.getBean(StudentDao.class);
        Random random = new Random();
        int rollNo = random.nextInt();
        System.out.println("rollNo: " + rollNo);
        studentDao.createStudent(rollNo, "Ayuj");

        System.out.println(studentDao.getAllStudents());
        studentDao.createStudent(1, "A");
        System.out.println(studentDao.getStudent(1));
    }
}