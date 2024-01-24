package com.example;

import com.example.beans.SpringBean1;
import com.example.beans.SpringBean2;
import com.example.beans.SpringBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {

    @Bean(initMethod = "initMethod")
    public SpringBean1 springBean1() {
        return new SpringBean1();
    }

    @Bean(destroyMethod = "destroyMethod")
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }

    @Bean
    public SpringBean4 springBean4() {
        return new SpringBean4();
    }
}
