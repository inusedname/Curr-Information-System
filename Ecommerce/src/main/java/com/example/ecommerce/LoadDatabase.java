package com.example.ecommerce;

import com.example.ecommerce.entity.Admin;
import com.example.ecommerce.repo.AdminRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AdminRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Admin("admin1@email.com", "admin1", "admin")));
            log.info("Preloading " + repository.save(new Admin("admin2@email.com", "admin2", "admin")));
        };
    }
}