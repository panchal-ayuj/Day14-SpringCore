package org.accolite.model;

import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    private String emailId;
    private List<String> phoneNumbers;
    private Address address;
    private Map<Integer,String> projects;

    public Map<Integer, String> getProjects() {
        return projects;
    }

    public Employee(int id, String name, String emailId, List<String> phoneNumbers, Address address, Map<Integer, String> projects) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
        this.projects = projects;
    }

    public void setProjects(Map<Integer, String> projects) {
        this.projects = projects;
    }

    public Address getAddress() {
        return address;
    }

    public Employee(int id, String name, String emailId, List<String> phoneNumbers, Address address) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, String name, String emailId, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Employee(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", address=" + address +
                ", projects=" + projects +
                '}';
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
