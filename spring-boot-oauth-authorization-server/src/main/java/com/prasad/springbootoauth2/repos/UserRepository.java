package com.prasad.springbootoauth2.repos;

import org.springframework.data.repository.CrudRepository;

import com.prasad.springbootoauth2.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByName(String name);

}
