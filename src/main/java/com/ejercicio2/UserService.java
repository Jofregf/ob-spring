package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notification;

    public UserService(NotificationService notification){
        //System.out.println("UserService");
        this.notification = notification;
    }

}
