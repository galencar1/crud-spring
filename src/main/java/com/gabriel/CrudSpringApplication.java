package com.gabriel;

import com.gabriel.model.Course;
import com.gabriel.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}


	//Apenas a nível de exemplo com registros de DB
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll(); // Ao inicializar, limpa os dados da base de dados.
			
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("Front-end");

			courseRepository.save(c);
		};
	}


}
