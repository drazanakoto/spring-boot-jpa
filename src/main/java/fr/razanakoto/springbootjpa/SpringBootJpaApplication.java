package fr.razanakoto.springbootjpa;

import fr.razanakoto.springbootjpa.ero.core.port.ParcoursRepository;
import fr.razanakoto.springbootjpa.ero.core.usecases.CreateParcoursService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }


    @Bean
    public CreateParcoursService parcoursService(ParcoursRepository parcoursRepository) {
        return new CreateParcoursService(parcoursRepository);
    }
}
