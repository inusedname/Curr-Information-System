package com.example.ecommerce;

import com.example.ecommerce.dao.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

@EnableSwagger2
@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/moboc");
        dataSource.setUsername("user");
        dataSource.setPassword("123456");

        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Bean
    public UserDAO getUserDAO() {
        return new UserDAOImpl(getDataSource());
    }

    @Bean
    public ProductDAO getProductDAO() {
        return new ProductDAOImpl(getDataSource());
    }

    @Bean
    public CartDAO getCartDAO() {
        return new CartDAOImpl(getDataSource());
    }

    @Bean
    public ShipDAO getShipDAO() {
        return new ShipDAOImpl(getDataSource());
    }

    @Bean
    public ShipMethodDAO getShipMethodDAO() {
        return new ShipMethodDAOImpl(getDataSource());
    }

    @Bean
    public OrderDAO getOrderDAO() {
        return new OrderDAOImpl(getDataSource());
    }

    @Bean
    public PayMethodDAO getPayMethodDAO() {
        return new PayMethodDAOImpl(getDataSource());
    }

    @Bean
    public PayDAO getPayDAO() {
        return new PayDAOImpl(getDataSource());
    }
}
