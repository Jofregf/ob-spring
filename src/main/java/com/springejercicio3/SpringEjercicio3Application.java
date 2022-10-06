package com.springejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringEjercicio3Application.class, args);
		MascotasRepository repository = context.getBean(MascotasRepository.class);
		System.out.println("El numero de mascotas es: " + repository.count());

		List<Mascotas> mascotasList = new ArrayList<>();

		Mascotas tina = new Mascotas(null, "Tina", "canino", "labrador", 18);

		repository.save(tina);

		System.out.println("El numero de mascotas es: " + repository.count());

		System.out.println(repository.findAll());
	}

}
