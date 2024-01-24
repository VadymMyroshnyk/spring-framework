package com.example;

import com.example.beans.mappers.DataMapper;
import com.example.beans.processors.DataProcessor;
import com.example.beans.processors.MultiSourceDataProcessor;
import com.example.beans.readers.DataReader;
import com.example.beans.readers.DbDataReader;
import com.example.beans.readers.FileDataReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public DataMapper dataMapper() {
        return new DataMapper();
    }

    @Bean
    @Profile({"database", "file"})
    public DataProcessor multiSourceDataProcessor() {
        return new MultiSourceDataProcessor();
    }

    @Bean
    @Profile("database")
    public DataReader dbDataReader() {
        return new DbDataReader();
    }

    @Bean
    @Profile("file")
    public DataReader fileDataReader() {
        return new FileDataReader();
    }
}
