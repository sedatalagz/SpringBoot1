package com.example.kodluyoruzspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (exclude = { /*devredışı bırakma*/
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
public class KodluyoruzApplication {

    public static void main(String[] args) {

        SpringApplication.run(KodluyoruzApplication.class, args);
    }
}
