package org.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecurityProject01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SecurityProject01Application.class, args);

    }
}