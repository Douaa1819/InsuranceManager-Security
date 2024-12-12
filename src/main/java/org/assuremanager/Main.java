package org.assuremanager;

import org.assuremanager.config.AppInitializer;
import org.assuremanager.config.JpaConfig;
import org.assuremanager.model.User;
import org.assuremanager.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppInitializer.class);
        context.refresh();

        // that's for  access beans only after context initialization
        UserService userService = context.getBean(UserService.class);
        System.out.println("UserService initialized: " + userService);
    }
}
