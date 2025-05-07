package com.faysal.Jobkhujibd_backend.controller;

import com.faysal.Jobkhujibd_backend.configaration.JwtTokenProvider;
import com.faysal.Jobkhujibd_backend.dto.LoginRequest;
import com.faysal.Jobkhujibd_backend.dto.RegisterRequest;
import com.faysal.Jobkhujibd_backend.dto.UserResponse;
import com.faysal.Jobkhujibd_backend.model.User;
import com.faysal.Jobkhujibd_backend.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthController(AuthenticationManager authenticationManager,
                          JwtTokenProvider jwtTokenProvider,
                          UserService userService,
                          PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequest registerRequest) {
        try {
            User user = new User();
            user.setEmail(registerRequest.email());
            user.setPassword(passwordEncoder.encode(registerRequest.password()));
            user.setRole(registerRequest.role());
            user.setFullName(registerRequest.fullName());
            user.setMobile(registerRequest.mobile());
            user.setCity(registerRequest.city());
            user.setState(registerRequest.state());
            user.setPinCode(registerRequest.pinCode());
            user.setCompanyName(registerRequest.companyName());
            user.setCompanyAddress(registerRequest.companyAddress());
            user.setExperience(registerRequest.experience());
            user.setResumeUrl(registerRequest.resumeUrl());
            user.setCreatedAt(LocalDateTime.now());
            user.setUpdatedAt(LocalDateTime.now());

            User savedUser = userService.createUser(user);

            UserResponse userResponse = new UserResponse();
            userResponse.setId(savedUser.getId());
            userResponse.setEmail(savedUser.getEmail());
            userResponse.setRole(savedUser.getRole());
            userResponse.setFullName(savedUser.getFullName());
            userResponse.setMobile(savedUser.getMobile());
            userResponse.setCity(savedUser.getCity());
            userResponse.setState(savedUser.getState());
            userResponse.setPinCode(savedUser.getPinCode());
            userResponse.setCompanyName(savedUser.getCompanyName());
            userResponse.setCompanyAddress(savedUser.getCompanyAddress());
            userResponse.setExperience(savedUser.getExperience());
            userResponse.setResumeUrl(savedUser.getResumeUrl());
            userResponse.setCreatedAt(savedUser.getCreatedAt());
            userResponse.setUpdatedAt(savedUser.getUpdatedAt());

            return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);

        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(HttpServletRequest request, HttpServletResponse response,
                                              @Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.email(), loginRequest.password())
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenProvider.createToken(authentication);

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("tokenType", "Bearer");
        responseData.put("access_token", jwt);

        return ResponseEntity.ok(responseData);
    }
}
