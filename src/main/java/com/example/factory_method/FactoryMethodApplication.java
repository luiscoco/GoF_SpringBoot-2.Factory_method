package com.example.factory_method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);

		// Create ConcreteCreatorA and ConcreteCreatorB instances
		Creator creatorA = new ConcreteCreatorA();
		Creator creatorB = new ConcreteCreatorB();

		// Use the FactoryMethod to create products
		Product productA = creatorA.factoryMethod();
		Product productB = creatorB.factoryMethod();

		// Display the products
		productA.display();
		productB.display();
	}
}
