package com.user.ws.ws.repository;

import com.user.ws.ws.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
    List<AppUser> findByRegDateBetween(LocalDate startDate, LocalDate endDate);
    List<AppUser> findByUserDetailsId(Long detailsId);
    List<AppUser> findByUsernameIgnoreCase(String username);
}
