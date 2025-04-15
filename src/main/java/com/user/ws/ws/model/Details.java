package com.user.ws.ws.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column
    private String email;

    @Column(nullable = false)
    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(unique = true, nullable = false)

    private AppUser appUser;

    public Details(String email, String name) {
        this.email = email;
        this.name = name;
    }

}
