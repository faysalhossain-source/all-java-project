package com.faysal.jobkhujibd.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employeer_User")
public class UserEmployeer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // e.g., "COMPANY"

    @Column(nullable = false)
    private String companyName;

    private String mobile;
    private String city;
    private String state;
    private String pinCode;

    @Column(length = 500)
    private String companyAddress;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;



    // Custom constructor
    public UserEmployeer(String email, String password, String role,
                       String companyName, String mobile, String city,
                       String state, String pinCode, String companyAddress) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.companyName = companyName;
        this.mobile = mobile;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.companyAddress = companyAddress;
    }

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    // Getters and Setters (can be generated or use Lombok @Data if preferred)
}

