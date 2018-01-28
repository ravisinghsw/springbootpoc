package com.ravi.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by ravi on 11/18/2017.
 */

@SpringBootApplication
public class SpringBootStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class,args);
    }

  /* @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
        return  new CommandLineRunner() {

            @Override
            public void run(String... strings) throws Exception {
                System.out.println("Let's inspect the beans provided by Spring Boot:");

                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for (String beanName : beanNames) {
                    System.out.println(beanName);
                }
            }
        };

    }*/
}
