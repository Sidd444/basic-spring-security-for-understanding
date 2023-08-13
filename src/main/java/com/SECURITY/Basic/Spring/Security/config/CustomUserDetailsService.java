package com.SECURITY.Basic.Spring.Security.config;

import com.SECURITY.Basic.Spring.Security.Person;
import com.SECURITY.Basic.Spring.Security.PersonRespository;
import com.SECURITY.Basic.Spring.Security.UserDetailsCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    PersonRespository personRespository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Person person = personRespository.findByUserName(username);

        if(person == null){
            throw new RuntimeException("User doesn't exist");
        }

        return new UserDetailsCreator(person);
    }
}
