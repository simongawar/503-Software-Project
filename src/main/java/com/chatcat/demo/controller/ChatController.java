package com.ua.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ua.demo.model.Chat;
import com.ua.demo.services.ChatService;



@RestController
public class ChatController {

	@Autowired
	private ChatService service;
	
	@PostMapping("/saveChat")
	public String saveChat(@RequestBody Chat chat) {
		service.saveChat(chat);
		return "Chat History";
	}
	
	@GetMapping("/showChat")
	public List<Chat> showChat(){
		return service.showChat();
	}
	
	
}
