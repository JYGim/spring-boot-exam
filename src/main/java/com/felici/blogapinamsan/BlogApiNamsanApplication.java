package com.felici.blogapinamsan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BlogApiNamsanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApiNamsanApplication.class, args);
    }

}
