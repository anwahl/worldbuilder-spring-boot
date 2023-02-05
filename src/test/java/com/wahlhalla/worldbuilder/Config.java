package com.wahlhalla.worldbuilder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.wahlhalla.worldbuilder.user.impl.UserDetailsImpl;

@Configuration
public class Config {
    /*@Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
       /* UserDetails user = User.withUsername("user")
            .password(passwordEncoder.encode("secret"))
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }*/

    @Bean
    @Primary
    public UserDetailsService userDetailsService() {
        List<GrantedAuthority> authorities1 = new ArrayList<>();
         authorities1.add(new SimpleGrantedAuthority("ROLE_USER"));
         authorities1.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
         List<GrantedAuthority> authorities2 = new ArrayList<>();
          authorities2.add(new SimpleGrantedAuthority("ROLE_USER"));
        
        UserDetailsImpl admin = new UserDetailsImpl(1L, "admin", "admin", "password", authorities1);
        UserDetailsImpl user = new UserDetailsImpl(2L, "user", "user", "password", authorities2);

        return new InMemoryUserDetailsManager(admin, user);
    }

}