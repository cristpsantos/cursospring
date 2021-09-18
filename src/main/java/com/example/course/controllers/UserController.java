package com.example.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(path="/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Laurinha", "laurinha@gmail.com", "99999-9999", "123456");
		return ResponseEntity.ok().body(u);	
		
	}
}
