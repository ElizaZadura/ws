package com.user.ws.ws.repository;

import com.user.ws.ws.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
    Details findByEmail(String email);
    List<Details> findByNameContains(String name);
    List<Details> findByNameIgnoreCase(String name);
}
