package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;

@Configuration
@EnableAutoConfiguration
@ComponentScan(scopeResolver = Jsr330ScopeMetadataResolver.class)
@ServletComponentScan
public class DemoServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServletApplication.class, args);
    }
}
