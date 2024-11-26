package com.ua.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="chathistories")
public class Chat {
	
	@Id
	private String email;
	private String name;
	private String Class;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass() {
		return Class;
	}
	public void setClass(String Class) {
		this.Class = Class;
	}
	
}

