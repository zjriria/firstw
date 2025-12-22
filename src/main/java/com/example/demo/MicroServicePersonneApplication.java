package com.example.demo;

import com.example.demo.repository.PersonneRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo.model.Personne;

@SpringBootApplication
public class MicroServicePersonneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicePersonneApplication.class, args);
    }

    @Bean
    ApplicationRunner start(PersonneRepository repository) {
        return args -> {
            repository.save(new Personne("El", "chama"));
            repository.save(new Personne("Abouqora", "Youness"));
        };
    }
}