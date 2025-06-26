package com.vishnu.portfolio_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vishnu.service.ExperienceService;

@SpringBootApplication(scanBasePackages = "com.vishnu")
public class PortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
	}
	@Bean
    CommandLineRunner run(ExperienceService service) {
        return args -> {
            service.saveExperience();
        };
    }

}
