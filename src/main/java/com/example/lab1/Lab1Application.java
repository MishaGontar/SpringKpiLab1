package com.example.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Order(2)
public class Lab1Application implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin");
        SpringApplication.run(Lab1Application.class, args);
        System.out.println("End");
    }
@Override
    public void run(String ...args)throws Exception{
    System.out.println("Hello from Spring Boot");
}
}

@Component
@Order(1)
class FirstClass implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("First");
    }
}
@Component
@Order(3)
class SecondClass implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Second");
    }
}