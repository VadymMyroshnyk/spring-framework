package com.example.di.service;

import com.example.di.model.Employee;
import com.example.di.model.EmployeeSalary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Collections;

//@Component
public class EmployeeSalaryCalculator {

    public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
        System.out.println("Calculating salaries");
        return Collections.emptyList();
    }
}
