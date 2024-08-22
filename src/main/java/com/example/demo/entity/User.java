package com.example.demo.entity;

import java.util.*;
 
import jakarta.persistence.*;
 
@Entity
@Table(name = "users")
public class User {
 
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String username;
    private String password;
    private String role;
 
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
 
    // remaining getters and setters are not shown for brevity
}
