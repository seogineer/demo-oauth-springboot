package com.seogineer.demooauthspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoOauthSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOauthSpringbootApplication.class, args);
    }

}
