package com.qdm.careGiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
public class ManagedcareCpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagedcareCpApplication.class, args);
	}

}
