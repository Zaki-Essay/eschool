package com.ziko.eschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ziko.eschool.repository")
@EntityScan("com.ziko.eschool.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class ESchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESchoolApplication.class, args);
    }

}
