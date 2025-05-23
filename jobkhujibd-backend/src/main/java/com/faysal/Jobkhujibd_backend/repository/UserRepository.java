package com.faysal.Jobkhujibd_backend.repository;

import java.util.List;
import java.util.Optional;

import com.faysal.Jobkhujibd_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faysal.Jobkhujibd_backend.constants.Role;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    List<User> findByRole(Role role);
}