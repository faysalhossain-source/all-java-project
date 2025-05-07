package com.faysal.Jobkhujibd_backend.dto;

import com.faysal.Jobkhujibd_backend.constants.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String email;
    private Role role;

    private String fullName;
    private String mobile;

    private String city;
    private String state;
    private String pinCode;

    // Employer-specific
    private String companyName;
    private String companyAddress;

    // Jobseeker-specific
    private String experience;
    private String resumeUrl;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

