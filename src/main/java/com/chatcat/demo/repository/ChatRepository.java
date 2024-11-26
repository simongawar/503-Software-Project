package com.ua.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ua.demo.model.Chat;



@Repository
public interface ChatRepository extends MongoRepository<Chat,String> {
 
}

