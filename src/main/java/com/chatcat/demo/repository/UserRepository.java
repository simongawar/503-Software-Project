package com.ua.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ua.demo.model.User;



@Repository
public interface UserRepository extends MongoRepository<User,String> {
	
}