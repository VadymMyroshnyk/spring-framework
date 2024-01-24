package com.example.di.report;

import com.example.di.model.EmployeeSalary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
//@Profile("pdf-reports")
public class PdfSalaryReport implements SalaryReport {

    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Pdf Report");
    }
}
