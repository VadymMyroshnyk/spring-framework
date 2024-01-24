package com.example.beans;

import com.example.Metric;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class HelloBean {

    @Metric
    public String formatData(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }

    public void saveData(String name) {
        Objects.requireNonNull(name, "Name cannot be null");
    }
}
