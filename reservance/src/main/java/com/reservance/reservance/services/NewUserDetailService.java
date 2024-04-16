package com.reservance.reservance.services;

import com.reservance.reservance.model.User.User;
import com.reservance.reservance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NewUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = ur.findByemail(email);
        if (user.isPresent()) {
            var Objuser = user.get();
            return org.springframework.security.core.userdetails.User.builder()
                    .username(Objuser.getEmail())
                    .password(Objuser.getPassword())
                    .roles(getRoles(Objuser))
                    .build();
        } else {
            throw new UsernameNotFoundException(email);
        }

    }
        private String[] getRoles (User user){
            if (user.getRole() == null) {
                return new String[]{"USER"};
            }
            return user.getRole().split(",");

        }



}
