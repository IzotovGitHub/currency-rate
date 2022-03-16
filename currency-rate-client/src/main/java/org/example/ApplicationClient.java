package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ApplicationClient {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ApplicationClient.class).run(args);
    }
}
