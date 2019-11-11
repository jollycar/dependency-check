package nl.enshore.jenkins.dependencycheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyCheckApplication.class, args);
	}

}
