package com.dockerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectWIthDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectWIthDockerApplication.class, args);

		System.out.println("Project with Docker is running successfully!");
	}

}
