package model;

import java.time.LocalDate;
import java.util.Objects;

public class Details {
    private int id;
    private String name;
    private LocalDate birthDate;
    private String email;

    public Details(String name, LocalDate birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return getId() == details.getId() && Objects.equals(getName(), details.getName()) && Objects.equals(getBirthDate(), details.getBirthDate()) && Objects.equals(getEmail(), details.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthDate(), getEmail());
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id + "\n" +
                ", name='" + name + '\n' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\n' +
                '}';
    }
}
