package com.momoka.studentmanager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired

    SuccessHandler successHandler;
    @Autowired
    FailHandler failHandler;

    @Bean
    private BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/student/login")
                .loginProcessingUrl("/student/dologin")
                .successHandler(successHandler)
                .failureHandler(failHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/student/welcome","/student/login","/keeper/queryAll","/news/queryAll").permitAll()
                .anyRequest()
                .authenticated()
                .and().csrf().disable();
    }
}
