package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeManager.getEmployees().getEmployeeList();
    }
}