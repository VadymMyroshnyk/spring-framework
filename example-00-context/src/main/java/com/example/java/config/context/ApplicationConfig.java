package com.example.java.config.context;

import com.example.java.config.context.beans.SpringBean1;
import com.example.java.config.context.beans.SpringBean2;
import com.example.java.config.context.beans.SpringBean3;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.MessageDigest;

@Configuration
public class ApplicationConfig {

    @Bean
    public SpringBean1 springBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
        return new SpringBean1(springBean2, springBean3);
    }

    @Bean
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3(MessageDigest messageDigest) {
        return new SpringBean3(messageDigest);
    }

    @Bean
    public MessageDigest messageDigest() {
        return DigestUtils.getSha384Digest();
    }
}
