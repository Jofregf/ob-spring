package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        //System.out.println("NotificationService");
    }

    public String saludo(String nombre){
        return "hola " + nombre + ", ¿Cómo te encuentras?";
    }
}
