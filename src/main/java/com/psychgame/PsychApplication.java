package com.psychgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PsychApplication {

    public static void main(String[] args) {

        System.out.println("hello world");
        SpringApplication.run(PsychApplication.class, args);
    }

}
