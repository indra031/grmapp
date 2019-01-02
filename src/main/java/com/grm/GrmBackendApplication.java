package com.grm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.grm.repository.HomePlmnRepository;

@SpringBootApplication
public class GrmBackendApplication implements CommandLineRunner {

	@Autowired
	private HomePlmnRepository homePlmnRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GrmBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Done!");
		homePlmnRepository.findAll().forEach( System.out::println );
	}

}

