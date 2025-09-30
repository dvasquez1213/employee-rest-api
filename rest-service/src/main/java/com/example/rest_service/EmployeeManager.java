package com.example.rest_service;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private Employees employees = new Employees();

    public EmployeeManager() {
        // Create a new list
        List<Employee> employeeList = new ArrayList<>();

        // Add the hard-coded employees
        employeeList.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Developer"));
        employeeList.add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Manager"));
        employeeList.add(new Employee("3", "Peter", "Jones", "peter.jones@example.com", "Analyst"));

        // Set the list in the Employees object
        employees.setEmployeeList(employeeList);
    }

    public Employees getEmployees() {
        return employees;
    }
}