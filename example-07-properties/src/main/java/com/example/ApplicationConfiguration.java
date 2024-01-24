package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ComponentScan
@PropertySources({
        @PropertySource("classpath:/app-db.properties"),
        @PropertySource("classpath:/app-defaults.properties")
})
public class ApplicationConfiguration {
}
