package com.rajatgoyal715.assignments.assignment1;

import com.rajatgoyal715.assignments.assignment1.configuration.spring.SpringConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@SpringBootApplication
@Import({ SpringConfiguration.class })
public class FeatureGatingApplication {

    public static void main(String[] args) {
        System.out.println("before");
        SpringApplication.run(FeatureGatingApplication.class, args);
        System.out.println("after");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
