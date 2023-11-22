package com.example.ecommerce;

import com.example.ecommerce.repo.AccountEntityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EcommerceApplication.class, args);
        AccountEntityRepository repo = context.getBean(AccountEntityRepository.class);

        AccountEntity account = repo.save(new AccountEntity());
        account.setName("Nguyen Viet Quang");
        repo.save(account);

        AccountEntity account2 = repo.findById(account.getId()).orElse(null);
        System.out.println(account2);
    }

}
