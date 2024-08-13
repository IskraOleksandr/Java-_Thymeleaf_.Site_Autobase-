package com.example.autobase;

import org.springframework.boot.SpringApplication;

public class TestAutoBaseTymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.from(AutoBaseTymeleafApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
