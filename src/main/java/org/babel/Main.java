package org.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.babel")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}