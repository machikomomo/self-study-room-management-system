package com.momoka.studentmanager.config;

import com.momoka.studentmanager.pojo.Administrator;
import com.momoka.studentmanager.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;

@Configuration
public class UserDetailService implements UserDetailsService {

    @Autowired
    private AdministratorService as;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Administrator administrator = as.queryByUsername(s);
        administrator.setPassword(passwordEncoder.encode(administrator.getPassword()));
        if(administrator!=null){
            return new User(administrator.getUsername(),administrator.getPassword(),true,true,true,true, Collections.singletonList((GrantedAuthority)()->"admin"));
        }
        throw new UsernameNotFoundException("Not Found Username");
    }
}
