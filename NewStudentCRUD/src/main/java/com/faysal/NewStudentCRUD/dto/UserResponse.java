package com.faysal.NewStudentCRUD.dto;

import java.time.LocalDateTime;

import com.faysal.NewStudentCRUD.constant.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	private Long id;
	private String email;
	private Role role;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}