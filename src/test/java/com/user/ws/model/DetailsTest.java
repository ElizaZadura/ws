package com.user.ws.model;

import com.user.ws.ws.model.AppUser;
import com.user.ws.ws.model.Details;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DetailsTest {

    @Test
    public void testDetailsCreation() {
        Details details = new Details();
        details.setEmail("test@example.com");
        details.setName("Test User");

        assertThat(details.getEmail()).isEqualTo("test@example.com");
        assertThat(details.getName()).isEqualTo("Test User");
    }

    @Test
    public void testAppUserRelationship() {
        Details details = new Details();
        AppUser appUser = new AppUser();
        appUser.setUsername("testuser");

        details.setAppUser(appUser);
        appUser.setUserDetails(details);

        assertThat(details.getAppUser()).isEqualTo(appUser);
        assertThat(appUser.getUserDetails()).isEqualTo(details);
    }
} 
