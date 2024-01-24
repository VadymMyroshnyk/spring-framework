package com.example.di.di.spring.dependency.injection;

import com.example.di.model.Employee;
import com.example.di.model.EmployeeSalary;
import com.example.di.report.SalaryReport;
import com.example.di.repository.EmployeeRepository;
import com.example.di.service.EmployeeSalaryCalculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesSalariesReportService {

    private final EmployeeRepository employeeDao;
    private final EmployeeSalaryCalculator employeeSalaryCalculator;
    private final SalaryReport salaryReport;

    public EmployeesSalariesReportService(EmployeeRepository employeeDao,
                                          EmployeeSalaryCalculator employeeSalaryCalculator,
                                          SalaryReport salaryReport) {
        this.employeeDao = employeeDao;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
        this.salaryReport = salaryReport;
    }

    void generateReport() {
        List<Employee> employees = employeeDao.findAll();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        salaryReport.writeReport(employeeSalaries);
    }
}
