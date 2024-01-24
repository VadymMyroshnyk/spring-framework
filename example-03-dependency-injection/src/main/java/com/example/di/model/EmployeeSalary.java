package com.example.di.model;

import java.util.Objects;

public class EmployeeSalary {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSalary that = (EmployeeSalary) o;
        return Double.compare(amount, that.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
               "amount=" + amount +
               '}';
    }
}
