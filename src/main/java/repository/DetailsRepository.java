package repository;

import model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
    Details findByEmail(String email);
    List<Details> findByNameContains(String name);
    List<Details> findByNameIgnoreCase(String name);
}
