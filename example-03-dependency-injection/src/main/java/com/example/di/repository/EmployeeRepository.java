package com.example.di.repository;

import com.example.di.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Repository
public class EmployeeRepository {

    public List<Employee> findAll() {
        System.out.println("Finding all employees");
        return Collections.emptyList();
    }
}
