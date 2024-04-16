package com.reservance.reservance.resource;

import com.reservance.reservance.model.User.User;
import com.reservance.reservance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationResource {

    @Autowired
    private UserRepository ur;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public User register (@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return ur.save(user);
    }
}
