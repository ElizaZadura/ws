package model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate birthDate;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                '}';
    }
}
