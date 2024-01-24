package com.example.di.di.no.dependency.injection;

public class Runner {

    public static void main(String[] args) {
        EmployeesSalariesReportService employeesSalariesReportService = new EmployeesSalariesReportService();

        employeesSalariesReportService.generateReport();
    }
}
