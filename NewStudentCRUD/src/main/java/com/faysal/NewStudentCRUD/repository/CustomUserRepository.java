package com.faysal.NewStudentCRUD.repository;

import com.faysal.NewStudentCRUD.model.User;

public interface CustomUserRepository {
	User findCustomUserByEmail(String email);
}