package com.example.di.di.no.dependency.injection;

import com.example.di.model.Employee;
import com.example.di.model.EmployeeSalary;
import com.example.di.report.PdfSalaryReport;
import com.example.di.repository.EmployeeRepository;
import com.example.di.service.EmployeeSalaryCalculator;

import java.util.List;

public class EmployeesSalariesReportService {

    void generateReport() {
        EmployeeRepository employeeDao = new EmployeeRepository();
        List<Employee> employees = employeeDao.findAll();

        EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        PdfSalaryReport pdfSalaryReport = new PdfSalaryReport();
        pdfSalaryReport.writeReport(employeeSalaries);
    }
}
