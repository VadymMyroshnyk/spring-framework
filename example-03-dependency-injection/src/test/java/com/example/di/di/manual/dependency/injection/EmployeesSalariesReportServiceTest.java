package com.example.di.di.manual.dependency.injection;

import com.example.di.model.Employee;
import com.example.di.model.EmployeeSalary;
import com.example.di.report.SalaryReport;
import com.example.di.repository.EmployeeRepository;
import com.example.di.service.EmployeeSalaryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeesSalariesReportServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private EmployeeSalaryCalculator employeeSalaryCalculator;
    @Mock
    private SalaryReport salaryReport;
    @Mock
    private List<Employee> employees;
    @Mock
    private List<EmployeeSalary> employeeSalaries;

    private EmployeesSalariesReportService employeesSalariesReportService;

    @BeforeEach
    void setUp() {
        employeesSalariesReportService = new EmployeesSalariesReportService(
            employeeRepository,
            employeeSalaryCalculator,
            salaryReport
        );
    }

    @Test
    void shouldGenerateSalaryReport() {
        when(employeeRepository.findAll()).thenReturn(employees);
        when(employeeSalaryCalculator.calculateSalaries(employees)).thenReturn(employeeSalaries);

        employeesSalariesReportService.generateReport();

        verify(salaryReport).writeReport(employeeSalaries);
    }
}
