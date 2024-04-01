package com.reservance.reservance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.reservance.reservance.model.User.User;

public interface UserRepository extends JpaRepository<User, String>{
	UserDetails findByemail (String email);
}
