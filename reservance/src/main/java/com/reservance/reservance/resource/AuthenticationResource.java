package com.reservance.reservance.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservance.reservance.model.User.AuthenticationDTO;
import com.reservance.reservance.model.User.LoginResponseDTO;
import com.reservance.reservance.model.User.RegisterDTO;
import com.reservance.reservance.model.User.User;
import com.reservance.reservance.repository.UserRepository;
import com.reservance.reservance.security.TokenService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("auth")
public class AuthenticationResource {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	TokenService tokenService;
	
	@Autowired
	private UserRepository ur;
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
		var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
		var auth = this.authenticationManager.authenticate(usernamePassword);
		
		var token = tokenService.generateToken((User) auth.getPrincipal());
		
		return ResponseEntity.ok(new LoginResponseDTO(token));
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
		if(this.ur.findByemail(data.email()) != null)return ResponseEntity.badRequest().build();
		
		String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
		User newUser = new User(data.email(),encryptedPassword,data.role());
		
		this.ur.save(newUser);
		
		return ResponseEntity.ok().build();
	}
	
}
