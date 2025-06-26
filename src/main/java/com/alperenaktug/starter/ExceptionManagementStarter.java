package com.alperenaktug.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.alperenaktug"})
@EnableJpaRepositories(basePackages = {"com.alperenaktug"})
@ComponentScan(basePackages = {"com.alperenaktug"})
@SpringBootApplication
public class ExceptionManagementStarter {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionManagementStarter.class, args);
    }

}
