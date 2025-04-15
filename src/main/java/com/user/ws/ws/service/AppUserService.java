package com.user.ws.ws.service;

import com.user.ws.ws.model.AppUser;
import com.user.ws.ws.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser createAppUser(AppUser appUser) {
        // Save the AppUser using the repository and return the saved entity
        return appUserRepository.save(appUser);
    }

    public Optional<AppUser> getAppUserById(Long id) {
        // Retrieve the AppUser by ID using the repository
        return appUserRepository.findById(id);
    }

    public List<AppUser> getAllAppUsers() {
        // Retrieve all AppUsers using the repository
        return appUserRepository.findAll();
    }

    public void deleteAppUser(Long id) {
        // Delete the AppUser by ID using the repository
        appUserRepository.deleteById(id);
    }
}
