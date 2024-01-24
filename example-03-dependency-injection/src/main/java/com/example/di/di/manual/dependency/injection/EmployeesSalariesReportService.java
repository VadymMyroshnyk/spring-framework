package com.example.di.di.manual.dependency.injection;

import com.example.di.model.Employee;
import com.example.di.model.EmployeeSalary;
import com.example.di.report.SalaryReport;
import com.example.di.repository.EmployeeRepository;
import com.example.di.service.EmployeeSalaryCalculator;

import java.util.List;

public class EmployeesSalariesReportService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeSalaryCalculator employeeSalaryCalculator;
    private final SalaryReport salaryReport;

    public EmployeesSalariesReportService(EmployeeRepository employeeRepository,
                                          EmployeeSalaryCalculator employeeSalaryCalculator,
                                          SalaryReport salaryReport) {
        this.employeeRepository = employeeRepository;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
        this.salaryReport = salaryReport;
    }

    void generateReport() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        salaryReport.writeReport(employeeSalaries);
    }
}
