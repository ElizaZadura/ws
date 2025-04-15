package model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

public class AppUserTest {

    @Test
    public void testAppUserCreation() {
        AppUser appUser = new AppUser();
        appUser.setUsername("testuser");
        appUser.setPassword("password123");
        appUser.setRegDate(LocalDate.now());

        assertThat(appUser.getUsername()).isEqualTo("testuser");
        assertThat(appUser.getPassword()).isEqualTo("password123");
        assertThat(appUser.getRegDate()).isNotNull();
    }

    @Test
    public void testUserDetailsRelationship() {
        AppUser appUser = new AppUser();
        Details details = new Details();
        details.setEmail("test@example.com");
        details.setName("Test User");

        appUser.setUserDetails(details);
        details.setAppUser(appUser);

        assertThat(appUser.getUserDetails()).isEqualTo(details);
        assertThat(details.getAppUser()).isEqualTo(appUser);
    }
}
