package com.prasad.springbootoauth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.prasad.springbootoauth2.entities.User;
import com.prasad.springbootoauth2.repos.UserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
	private UserRepository repos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repos.findByName(username);
		return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(),user.getRoles());
	}
		

}
