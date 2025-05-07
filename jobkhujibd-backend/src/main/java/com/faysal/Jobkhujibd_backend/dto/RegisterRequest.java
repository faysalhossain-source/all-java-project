package com.faysal.Jobkhujibd_backend.dto;

//import com.faysal.Jobkhujibd_backend.annotation.ValidRole;
import com.faysal.Jobkhujibd_backend.constants.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank(message = "Email cannot be blank")
        @Email(message = "Email should be valid")
        String email,

        @NotBlank(message = "Password cannot be blank")
        @Size(min = 5, message = "Password must be at least 5 characters")
        String password,

//        @ValidRole(message = "Role must be valid")
        Role role,

        @NotBlank(message = "Full name cannot be blank")
        String fullName,

        Integer age,
        String gender,

        @NotBlank(message = "Mobile number cannot be blank")
        String mobile,

        String city,
        String state,
        String pinCode,

        // Employer-specific
        String companyName,
        String companyAddress,

        // Jobseeker-specific
        String experience,
        String resumeUrl

) {
}
