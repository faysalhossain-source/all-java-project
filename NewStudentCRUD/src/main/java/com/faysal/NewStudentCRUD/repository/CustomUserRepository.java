package com.faysal.NewStudentCRUD.repository;

import com.faysal.NewStudentCRUD.model.CustomUser;

public interface CustomUserRepository {
	CustomUser findCustomUserByEmail(String email);
}