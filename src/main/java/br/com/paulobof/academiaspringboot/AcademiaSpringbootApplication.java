package br.com.paulobof.academiaspringboot;

import br.com.paulobof.academiaspringboot.entity.Log;
import br.com.paulobof.academiaspringboot.repository.LogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AcademiaSpringbootApplication implements CommandLineRunner {

    private final LogRepository logRepository;

    public AcademiaSpringbootApplication(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AcademiaSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        logRepository.saveAll(List.of(
                new Log()
        ));
    }
}
