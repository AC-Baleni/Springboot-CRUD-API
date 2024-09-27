package com.balenii.CrudAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username; // Add username field
    private String password; // Add password field
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    // Constructors
    public User() {}

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
}
