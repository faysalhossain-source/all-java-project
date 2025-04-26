package com.faysal.NewStudentCRUD.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faysal.NewStudentCRUD.constant.Role;
import com.faysal.NewStudentCRUD.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

	boolean existsByEmail(String email);

	List<User> findByRole(Role role);
}