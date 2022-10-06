package com.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese un nombre");
        nombre = scanner.nextLine();
        ApplicationContext context = new ClassPathXmlApplicationContext("beanseje2.xml");

//        NotificationService notificacion = (NotificationService) context.getBean("notificationService");
//        String texto = notificacion.saludo();
//        System.out.println(texto);

        UserService service = (UserService) context.getBean("userService");
        System.out.println(service.notification.saludo(nombre));

    }
}
