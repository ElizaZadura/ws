package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate regDate;

    @OneToOne(mappedBy = "appUser", cascade = CascadeType.ALL)
    private Details userDetails;

    // Constructors, getters, and setters
    public AppUser() {}

    public AppUser(String username, String password, LocalDate regDate) {
        this.username = username;
        this.password = password;
        this.regDate = regDate;
    }

    // Getters and Setters
}
