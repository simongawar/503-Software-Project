package com.ua.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.demo.model.Chat;
import com.ua.demo.repository.ChatRepository;



@Service
public class ChatService {
	
	@Autowired
	private ChatRepository repository;
	
	public Chat saveChat(Chat chat) {
		return repository.save(chat);
	}
	
	public List<Chat> showChat(){
		return repository.findAll();
	}

}
