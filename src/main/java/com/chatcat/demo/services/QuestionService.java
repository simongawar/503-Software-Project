package com.ua.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.demo.model.Question;
import com.ua.demo.repository.QuestionRepository;



@Service
public class QuestionService {

	@Autowired
	private QuestionRepository repository;
	
	public List<Question> getQuestions(){
		return repository.findAll();
	}
	
}
