package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludar = (Saludo) context.getBean("saludoService");
        String texto = saludar.imprimirSaludo(nombre);
        System.out.println(texto);
    }
}
