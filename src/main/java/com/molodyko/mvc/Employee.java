package com.molodyko.mvc;



import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2)
    private String name;
    @Min(500)
    @Max(1000)
    private int salary;
    @NotBlank
    private String surname;
    private String department;
    private String carBrand;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Map<String,String> mapDepartments;
    public static Map<String,String> mapCars;
    public static Map<String,String> mapLanguages;

    static {
        mapDepartments = new HashMap<>();
        mapDepartments.put("Informational Technology","IT");
        mapDepartments.put("Human Resources","HR");
        mapDepartments.put("Finance","FI");

        mapCars = new HashMap<>();
        mapCars.put("BMW","BMW");
        mapCars.put("MB","MB");
        mapCars.put("AUDI","AUDI");

        mapLanguages = new HashMap<>();
        mapLanguages.put("ENGLISH","EN");
        mapLanguages.put("Deutch","DE");
        mapLanguages.put("FRENCH","FR");
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getMapLanguages() {
        return mapLanguages;
    }

    public static void setMapLanguages(Map<String, String> mapLanguages) {
        Employee.mapLanguages = mapLanguages;
    }

    public String getCarBrand() {
        return carBrand;
    }



    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

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
        mapDepartments = mapDepartments;
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

    public  Map<String, String> getMapCars() {
        return mapCars;
    }

    public void setMapCars(Map<String, String> mapCars) {
        Employee.mapCars = mapCars;
    }

    public Employee() {

    }
}
