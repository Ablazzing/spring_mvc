package com.molodyko.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private int salary;
    private String surname;
    private String department;
    private Map<String,String> mapDepartments;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getMapDepartments() {
        return mapDepartments;
    }

    public void setMapDepartments(Map<String, String> mapDepartments) {
        this.mapDepartments = mapDepartments;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee() {
        mapDepartments = new HashMap<>();
        mapDepartments.put("Informational Technology","IT");
        mapDepartments.put("Human Resources","HR");
        mapDepartments.put("Finance","FI");
    }
}
