package com.vainycos.dear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DearApplication {

    public static void main(String[] args) {
        System.out.println("this is demo branch");
        SpringApplication.run(DearApplication.class, args);
    }

}
