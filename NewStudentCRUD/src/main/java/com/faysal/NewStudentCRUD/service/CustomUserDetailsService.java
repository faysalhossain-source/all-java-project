package com.faysal.NewStudentCRUD.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.faysal.NewStudentCRUD.model.CustomUser;
import com.faysal.NewStudentCRUD.model.CustomUserDetails;
import com.faysal.NewStudentCRUD.repository.CustomUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private final CustomUserRepository userRepository;

	public CustomUserDetailsService(CustomUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CustomUser customUser = this.userRepository.findCustomUserByEmail(username);
		if (customUser == null) {
			throw new UsernameNotFoundException("username " + username + " is not found");
		}
		return new CustomUserDetails(customUser);
	}

}