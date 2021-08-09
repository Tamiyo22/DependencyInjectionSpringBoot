package com.project.spring.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(DependencyInjectionApplication.class, args);
		System.out.println("Dependency Injection testing");
		//AnimalSpeak pet = new AnimalSpeak();
		//Animal animal = new Cat();
		AnimalSpeak pet = applicationContext.getBean(AnimalSpeak.class);
		Animal animal= applicationContext.getBean(Animal.class);

		pet.setAnimal(animal);
		pet.makeAnimalSpeak();

	}

}
