package com.faysal.jobkhujibd.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.faysal.jobkhujibd.constant.Role;
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
@Table(name = "Jobseeker_Users")
public class UserJobseeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique =true)
    private String email;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    private String fullName;
    private String phoneNumber;
    private String experience;
    private String resumeURL;

    @Column(name = "created_at")
    private LocalDateTime createAt;

    @Column(name = "updated_at")
    private LocalDateTime updateAt;

    public UserJobseeker(String email, Long id, String password, String role,
                         String fullName, String phoneNumber, String experience,
                         String resumeURL) {
        this.email = email;
        this.id = id;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.resumeURL = resumeURL;
    }
    @PrePersist
    protected void onCreate() {
        createAt = LocalDateTime.now();
        updateAt = LocalDateTime.now();
    }
    @PreUpdate
    protected  void onUpdate(){
        updateAt = LocalDateTime.now();
    }

}
