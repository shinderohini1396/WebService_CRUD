package com.cjc.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class GitHubCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubCrudApplication.class, args);
	}

}
