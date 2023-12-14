package com.example.ecommerce;

import com.example.ecommerce.entity.Account;
import com.example.ecommerce.entity.Admin;
import com.example.ecommerce.repo.AdminRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EcommerceApplication.class, args);
    }
}
