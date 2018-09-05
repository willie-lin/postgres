package com.example.postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresApplication.class, args);
    }
}
