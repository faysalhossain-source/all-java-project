package com.faysal.NewStudentCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.faysal.NewStudentCRUD.model.CustomUserDetails;
import com.faysal.NewStudentCRUD.model.User;
import com.faysal.NewStudentCRUD.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	@Autowired
	public CustomUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + email));

		return new CustomUserDetails(user);
	}

	@Transactional
	public UserDetails loadUserById(Long id) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + id));

		return new CustomUserDetails(user);
	}
}