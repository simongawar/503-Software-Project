package com.ua.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ua.demo.model.Question;





@Repository
public interface QuestionRepository extends MongoRepository<Question,String> {
	
}