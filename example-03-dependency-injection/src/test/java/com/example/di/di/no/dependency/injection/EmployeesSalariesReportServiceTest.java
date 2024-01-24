package com.example.di.di.no.dependency.injection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmployeesSalariesReportServiceTest {

    private EmployeesSalariesReportService employeesSalariesReportService;

    @BeforeEach
    void setUp() {
        employeesSalariesReportService = new EmployeesSalariesReportService();
    }

    @Test
    void shouldGenerateSalaryReport() {

        // there is no way to write true unit test for this class, since there is now way to inject mocks,
        // the only possibility without dependency injection is to write integration test
    }
}
