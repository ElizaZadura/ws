package com.user.ws.ws.service;

import com.user.ws.ws.model.AppUser;
import com.user.ws.ws.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    private final AppUserService appUserService;

    @Autowired
    public DatabaseInitializer(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @Override
    public void run(String... args) throws Exception {
        AppUser user1 = new AppUser();
        user1.setUsername("user1");
        user1.setPassword("password1");
        user1.setRegDate(LocalDate.now());

        Details details1 = new Details();
        details1.setEmail("user1@example.com");
        details1.setName("User One");

        user1.setUserDetails(details1);
        details1.setAppUser(user1);

        appUserService.createAppUser(user1);

        AppUser user2 = new AppUser();
        user2.setUsername("user2");
        user2.setPassword("password2");
        user2.setRegDate(LocalDate.now());

        Details details2 = new Details();
        details2.setEmail("user2@example.com");
        details2.setName("User Two");

        user2.setUserDetails(details2);
        details2.setAppUser(user2);

        appUserService.createAppUser(user2);

        System.out.println("Initialized database with sample users.");
    }
}
