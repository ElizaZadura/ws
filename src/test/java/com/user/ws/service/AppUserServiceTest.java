package com.user.ws.service;

import com.user.ws.ws.model.AppUser;
import com.user.ws.ws.repository.AppUserRepository;
import com.user.ws.ws.service.AppUserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class AppUserServiceTest {

    @Mock
    private AppUserRepository appUserRepository;

    @InjectMocks
    private AppUserService appUserService;

    private AppUser appUser;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        appUser = new AppUser();
        appUser.setUsername("testuser");
        appUser.setPassword("password123");
        appUser.setRegDate(LocalDate.now());
    }

    @Test
    public void testCreateAppUser() {
        when(appUserRepository.save(any(AppUser.class))).thenReturn(appUser);

        AppUser createdUser = appUserService.createAppUser(appUser);

        assertThat(createdUser).isNotNull();
        assertThat(createdUser.getUsername()).isEqualTo("testuser");
        verify(appUserRepository, times(1)).save(appUser);
    }

    @Test
    public void testGetAppUserById() {
        when(appUserRepository.findById(1L)).thenReturn(Optional.of(appUser));

        Optional<AppUser> foundUser = appUserService.getAppUserById(1L);

        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getUsername()).isEqualTo("testuser");
        verify(appUserRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetAllAppUsers() {
        when(appUserRepository.findAll()).thenReturn(List.of(appUser));

        List<AppUser> users = appUserService.getAllAppUsers();

        assertThat(users).isNotEmpty();
        assertThat(users.get(0).getUsername()).isEqualTo("testuser");
        verify(appUserRepository, times(1)).findAll();
    }

    @Test
    public void testDeleteAppUser() {
        doNothing().when(appUserRepository).deleteById(1L);

        appUserService.deleteAppUser(1L);

        verify(appUserRepository, times(1)).deleteById(1L);
    }
} 
