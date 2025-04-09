package repository;

import model.AppUser;
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
