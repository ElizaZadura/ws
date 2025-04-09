package model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password; // Consider hashing this before saving

    @Column(nullable = false)
    private LocalDate regDate;

    @OneToOne(mappedBy = "appUser", cascade = CascadeType.ALL)
    private Details userDetails;

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", regDate=" + regDate +
                ", userDetails=" + userDetails +
                '}';
    }
}
