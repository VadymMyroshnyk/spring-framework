package com.example.di.di.manual.dependency.injection;


import com.example.di.report.PdfSalaryReport;
import com.example.di.repository.EmployeeRepository;
import com.example.di.service.EmployeeSalaryCalculator;

public class Runner {

    public static void main(String[] args) {
        EmployeesSalariesReportService employeesSalariesReportService = new EmployeesSalariesReportService(
            new EmployeeRepository(),
            new EmployeeSalaryCalculator(),
            new PdfSalaryReport()
        );

        employeesSalariesReportService.generateReport();
    }
}
