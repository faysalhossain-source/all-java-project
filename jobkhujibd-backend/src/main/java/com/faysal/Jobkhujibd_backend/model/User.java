package com.faysal.Jobkhujibd_backend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.faysal.Jobkhujibd_backend.constants.Role;
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
@Table(name = "F_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName; // Used for both employers (contact name) and jobseekers

    @Column(unique = true, nullable = false)
    private String email;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role; // Distinguishes between EMPLOYER and JOBSEEKER

    @Column(nullable = false)
    private String mobile;

    // Employer-specific fields (can be null for jobseekers)
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_address")
    private String companyAddress;

    @Column
    private String city;

    @Column
    private String state;

    @Column(name = "pin_code")
    private String pinCode;

    // Jobseeker-specific fields (can be null for employers)
    private String experience; // e.g., "3 years", or "Fresher"

    @Column(name = "resume_url")
    private String resumeUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}


