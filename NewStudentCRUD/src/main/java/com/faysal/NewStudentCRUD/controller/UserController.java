package com.faysal.NewStudentCRUD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faysal.NewStudentCRUD.annotation.CurrentUser;
import com.faysal.NewStudentCRUD.model.CustomUser;

@RestController
public class UserController {

	@GetMapping("/user")
	public CustomUser user(@CurrentUser CustomUser currentUser) {
		return currentUser;
	}
}