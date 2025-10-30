package com.rce.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String userName;
    private String email;
    private String password;
    private String branch;
    private String role;
    private String yearOfStudy;
    private String interests;

    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Events> events;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Registrations> registrations;

    public User(String userName, String email, String password, String branch, String role, String yearOfStudy,
                String interests, List<Events> events) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.branch = branch;
        this.role = role;
        this.yearOfStudy = yearOfStudy;
        this.interests = interests;
        this.events = events;
    }
}
